/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hu.iqjb2.streams1;

import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Test;

import java.util.IntSummaryStatistics;

/**
 * Use IntSummaryStatistics result with Collectors.summarizingInt(...) terminal operand
 *
 * @author avincze
 */
public class Task456 extends Task implements Command, Testable {

    @Override
    public void execute() {
        System.out.println("Task456 - Anagrams of a word (TODO)");
        System.out.println(getStatisticsOfWords());
    }

    private IntSummaryStatistics getStatisticsOfWords() {
        // TODO return getLines().collect( ...

        return new IntSummaryStatistics();
    }

    @Test
    public void test() {
        IntSummaryStatistics statisticsOfWords = getStatisticsOfWords();

        Assert.assertThat(statisticsOfWords.getMin(), Matchers.isOneOf(1));
        Assert.assertThat(statisticsOfWords.getMax(), Matchers.isOneOf(22));
        Assert.assertThat(statisticsOfWords.getSum(), Matchers.isOneOf(148278L));
        Assert.assertThat(statisticsOfWords.getCount(), Matchers.isOneOf(20159L));
    }
}
