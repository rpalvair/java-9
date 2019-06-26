package com.palvair.java9;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResources {

    public static void main(String[] args) throws IOException {
        final BufferedReader reader = new BufferedReader(new FileReader("fichier.txt"));
        final BufferedReader reader1 = new BufferedReader(new FileReader("fichier.txt"));

        try (reader; reader1) {
            reader.readLine();
            reader1.readLine();
        }
    }
}
