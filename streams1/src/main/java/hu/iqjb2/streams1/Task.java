/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hu.iqjb2.streams1;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Stream;

/**
 *
 * @author avincze
 */
public class Task {
    
    protected Stream<String> lines;

    public Task() {
        try {
            this.lines = Files.lines(Paths.get(this.getClass().getResource("/dictionary.txt").toURI()));
        } catch (IOException | URISyntaxException ex) {
            Logger.getLogger(Task.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    protected Stream<String> getLines() {
        return lines;
    }
}
