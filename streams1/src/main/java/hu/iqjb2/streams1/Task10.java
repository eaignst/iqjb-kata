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

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Anagram of "time" are "emit", "item", "mite"
 *
 * Use Collectors.groupingBy and Collectors.counting()
 *
 * @author avincze
 */
public class Task10 extends Task implements Command, Testable {
    
    @Override
    public void execute() {
        System.out.println("Task10 - Ratio of words with and without anagrams");
       
        getRatioOfAnagrams()
                .forEach((key, value)->System.out.println(key + ": " + value));
    }

    private Map<Boolean, Long> getRatioOfAnagrams() {
        return ImmutableMap.of(
            true, 18_777L,
            false, 36_999L);
    }

    @Test
    public void test() {
        Map<Boolean, Long> ratios = getRatioOfAnagrams();

        Assert.assertThat(ratios.keySet(), Matchers.hasSize(2));
        Assert.assertThat(ratios.get(false), Matchers.equalTo(18_313L));
        Assert.assertThat(ratios.get(true), Matchers.equalTo(865L));
    }
}
