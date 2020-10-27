/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hu.iqjb2.streams1;

import com.google.common.collect.ImmutableMap;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Test;

import java.util.Map;

/**
 * Use Collectors.groupingBy and Collectors.counting() functions
 *
 * @author avincze
 */
public class Task2 extends Task implements Command, Testable {

    @Override
    public void execute() {
        System.out.println("Task2 - Frequency of character (TODO)");
        getFreqOfCharacter()
            .forEach((key, value)->System.out.println(key + ": " + value));
    }

    private Map<String, Long> getFreqOfCharacter() {
        // TODO return getLines().collect( ...

        return ImmutableMap.of("a", 1L, "b", 2L, "c", 3L);
    }

    @Test
    public void test() {
        Map<String, Long> freqOfDictionary = getFreqOfCharacter();

        Assert.assertThat(freqOfDictionary.keySet(), Matchers.hasSize(28));
        Assert.assertThat(freqOfDictionary.get("a"), Matchers.isOneOf(12758L));
        Assert.assertThat(freqOfDictionary.get("b"), Matchers.isOneOf(3285L));
        Assert.assertThat(freqOfDictionary.get("c"), Matchers.isOneOf(6953L));
    }
}
