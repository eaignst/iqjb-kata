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
public class Task7 extends Task implements Command, Testable {

    private String word;

    public Task7 setWord(String word) {
        this.word = word;
        return this;
    }

    
    @Override
    public void execute() {
        System.out.println("Task7 - Anagrams of a word '" + word + "'");
        getAnagramsInDictionary().forEach(System.out::println);
    }

    private List<String> getAnagramsInDictionary() {
        return ImmutableList.of("abc", "bca", "cba");
    }

    @Test
    public void test() {
        this.word = "secure";
        Assert.assertTrue(getAnagramsInDictionary().contains("rescue"));
    }
}
