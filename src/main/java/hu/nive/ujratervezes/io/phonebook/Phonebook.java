package hu.nive.ujratervezes.io.phonebook;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class Phonebook {
    void exportPhonebook(Map<String, String> contacts, String output) {
        if (contacts == null) throw new IllegalArgumentException();
        if (output == null) throw new IllegalArgumentException();

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(output))) {
            for (Map.Entry<String,String> entry : contacts.entrySet()) {
                bufferedWriter.write(entry.getKey() + ": " + entry.getValue() + "\n");
            }
        }  catch (Exception e) {
            throw new IllegalArgumentException();
        }

    }
}