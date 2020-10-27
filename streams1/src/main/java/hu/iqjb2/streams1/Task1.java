/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hu.iqjb2.streams1;

import com.google.common.collect.ImmutableList;
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
public class Task1 extends Task implements Command, Testable {

    @Override
    public void execute() {
        System.out.println("Task1 - Frequency of word length (TODO)");
        getFreqOfDictionary()
            .forEach((key, value)->System.out.println(key + ": " + value));
    }

    public Map<Integer, Long> getFreqOfDictionary() {
//        TODO return getLines().collect( ...

         return ImmutableMap.of(1, 1L, 2, 2L, 3, 3L);
    }

    @Test
    public void test() {
        Map<Integer, Long> freqOfDictionary = getFreqOfDictionary();

        Assert.assertThat(freqOfDictionary.keySet(), Matchers.hasSize(21));
        Assert.assertThat(freqOfDictionary.get(1), Matchers.isOneOf(26L));
        Assert.assertThat(freqOfDictionary.get(2), Matchers.isOneOf(62L));
        Assert.assertThat(freqOfDictionary.get(3), Matchers.isOneOf(601L));
    }
}
