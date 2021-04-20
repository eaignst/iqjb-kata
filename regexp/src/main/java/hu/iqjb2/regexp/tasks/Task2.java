/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hu.iqjb2.regexp.tasks;

import hu.iqjb2.regexp.Command;
import hu.iqjb2.regexp.Task;
import hu.iqjb2.regexp.Testable;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Test;

import java.util.Map;
import java.util.stream.Collectors;


/**
 *
 * @author eaignst
 */
public class Task2 extends Task implements Command, Testable {

    @Override
    public void execute() {
        System.out.println("Task2 - parse the count of records in kafka_query_log.txt");
        System.out.println("Parsed value : " + parseRecordCountInKafkaTopic());
    }

    public Integer parseRecordCountInKafkaTopic() {
        return getContent("kafka_query_log.txt").split("\n").length;
    }

    @Test
    public void test() {
        Assert.assertThat(parseRecordCountInKafkaTopic(), Matchers.equalTo(60));
    }
}
