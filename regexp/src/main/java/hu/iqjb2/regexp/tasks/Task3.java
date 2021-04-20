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

import java.util.stream.IntStream;


/**
 *
 * @author eaignst
 */
public class Task3 extends Task implements Command, Testable {

    @Override
    public void execute() {
        System.out.println("Task2 - get version information from application names");
        System.out.println("Parsed version: ");
        IntStream.range(0, 9).forEach(i -> System.out.println(this.getApplicationNameWithVersion(i) + " has version: " +
            this.parseVesionNumberForApplication(i)));
    }

    public String parseVesionNumberForApplication(int cnt) {
        return getContent("application_names.txt").split("\n")[cnt];
    }

    public String getApplicationNameWithVersion(int cnt) {
        return getContent("application_names.txt").split("\n")[cnt];
    }

    @Test
    public void test() {
        Assert.assertThat(parseVesionNumberForApplication(0), Matchers.equalTo(""));
        Assert.assertThat(parseVesionNumberForApplication(1), Matchers.equalTo("1.4"));
        Assert.assertThat(parseVesionNumberForApplication(2), Matchers.equalTo("1.4"));
        Assert.assertThat(parseVesionNumberForApplication(3), Matchers.equalTo("4.10.1"));
        Assert.assertThat(parseVesionNumberForApplication(4), Matchers.equalTo("4.10.1"));
        Assert.assertThat(parseVesionNumberForApplication(5), Matchers.equalTo("4.10.1"));
        Assert.assertThat(parseVesionNumberForApplication(6), Matchers.equalTo("4.10.1"));
        Assert.assertThat(parseVesionNumberForApplication(7), Matchers.equalTo("4.10.1"));
        Assert.assertThat(parseVesionNumberForApplication(8), Matchers.equalTo("1.08.1"));
        Assert.assertThat(parseVesionNumberForApplication(9), Matchers.equalTo("0.16.1"));
        Assert.assertThat(parseVesionNumberForApplication(10), Matchers.equalTo(""));
    }
}
