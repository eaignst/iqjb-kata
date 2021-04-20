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


/**
 *
 * @author eaignst
 */
public class Task1 extends Task implements Command, Testable {

    @Override
    public void execute() {
        System.out.println("Task1 - parse kafka topic name from correlator config for 'incident'");
        // find by "incident -> carrier -> kafka -> options -> server -> topic = ???"
        // type = \"incident\".*(?:.|\n)+?carrier =.*\n.*type = \"kafka\".*\n.*options = .*\n.*servers = .*\n.*topic = (\".*\")
        System.out.println("Parsed value : " + parsekafkaTopicNameForIncident());
}

    public String parsekafkaTopicNameForIncident() {
        return getContent("correlator.cfg").split("\n")[0];
    }

    @Test
    public void test() {
        Assert.assertThat(parsekafkaTopicNameForIncident(), Matchers.equalTo("eea-incident-default"));
    }
}
