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
 * Anagram of "time" are "emit", "item", "mite"
 *
 * @author avincze
 */
public class Task9 extends Task implements Command, Testable {

    
    
    @Override
    public void execute() {
        System.out.println("Task9 - Frequency of anagram groups");
       
        getFrequencyOfAnagramGroups()
                .forEach((key, value)->System.out.println(key + ": " + value));
    }

    private Map<Long, Long> getFrequencyOfAnagramGroups() {
        return ImmutableMap.of(
            1L, 18_999L,
            2L, 26_999L);
    }

    @Test
    public void test() {
        Map<Long, Long> frequencies = getFrequencyOfAnagramGroups();

        Assert.assertThat(frequencies.keySet(), Matchers.hasSize(5));
        Assert.assertThat(frequencies.get(1L), Matchers.equalTo(18_313L));
        Assert.assertThat(frequencies.get(2L), Matchers.equalTo(768L));
        Assert.assertThat(frequencies.get(3L), Matchers.equalTo(79L));
    }
}
