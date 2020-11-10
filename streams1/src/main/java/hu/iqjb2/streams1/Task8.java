/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hu.iqjb2.streams1;

import com.google.common.collect.ImmutableList;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

/**
 * Anagram of "time" are "emit", "item", "mite"
 *
 * @author avincze
 */
public class Task8 extends Task implements Command, Testable {

    private int groupSize;
    
    public Task8() {
        this.groupSize = 4;
    }

    public Command setGroupSize(int groupSize) {
        this.groupSize = groupSize;
        return this;
    }

    @Override
    public void execute() {
        System.out.println("Task8 - Anagram groups with a given number of items");

        getAnagramGroups().forEach(System.out::println);
    }

    private List<List<String>> getAnagramGroups() {
        // TODO getLines().collect(...)
        return ImmutableList.of(
            ImmutableList.of("emit", "item", "mite", "time"),
            ImmutableList.of("diet", "edit", "tide", "tied"));
    }

    @Test
    public void test() {
        List<List<String>> anagrams = getAnagramGroups();

        Assert.assertThat(anagrams, Matchers.hasSize(17));
    }
}
