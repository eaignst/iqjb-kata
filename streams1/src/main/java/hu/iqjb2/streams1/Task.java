/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hu.iqjb2.streams1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
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
            this.lines = Files.lines(Paths.get("D:\\IQJB\\Trainings\\20190715\\streams1\\src\\main\\java\\hu\\iqjb2\\streams1\\dictionary.txt"));
        } catch (IOException ex) {
            Logger.getLogger(Task.class.getName()).log(Level.SEVERE, null, ex);
        }  
    }
}
