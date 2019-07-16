/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hu.iqjb2.observer;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author avincze
 */
public class ConsoleLogger extends Logger{

    @Override
    protected void log(String message, String severity) {
        System.out.println(
                "CONSOLE\t" + 
                LocalDateTime.now().format(
                        DateTimeFormatter.ofPattern("yyyy.MM.dd hh:mm:ss"))
                        + "\t" + severity + 
                        "\t" + message);
    }
}
