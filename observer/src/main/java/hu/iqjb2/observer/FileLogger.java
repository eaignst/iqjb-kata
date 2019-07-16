/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hu.iqjb2.observer;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;

/**
 *
 * @author avincze
 */
public class FileLogger extends Logger {

    private String filePath;

    public FileLogger() {
        filePath = "FileLogger.log";
    }

    @Override
    protected void log(String message, String severity) {
        String txt
                = LocalDateTime.now().format(
                        DateTimeFormatter.ofPattern("yyyy.MM.dd hh:mm:ss"))
                + "\t" + severity
                + "\t" + message;
        try (FileWriter fw = new FileWriter(filePath, true)) {
            fw.write(txt + "\n");
        } catch (IOException ex) {
            java.util.logging.Logger.getLogger(FileLogger.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
