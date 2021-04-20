/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hu.iqjb2.regexp;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author eaignst
 */
public class Task {
    
    protected String getContent(String file) {
        try {
            return Files.lines(Paths.get(this.getClass().getResource("/" + file).toURI())).collect(Collectors.joining("\n"));
        } catch (IOException | URISyntaxException ex) {
            Logger.getLogger(Task.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "";
    }
}
