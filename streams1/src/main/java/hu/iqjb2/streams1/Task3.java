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
import java.util.Map;
import java.util.stream.Collectors;

/**
 *
 * @author avincze
 */
public class Task3 extends Task implements Command, Testable {

    @Override
    public void execute() {
        System.out.println("Task3 - Number of characters (TODO)");
        System.out.println(getNumberOfCharacters());
    }

    private Long getNumberOfCharacters() {
        // TODO return getLines().collect( ...

        return 3L;
    }

    @Test
    public void test() {
        Assert.assertThat(getNumberOfCharacters(), Matchers.isOneOf(148278L));
    }
}
