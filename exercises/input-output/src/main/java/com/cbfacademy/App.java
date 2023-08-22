package com.cbfacademy;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.io.Reader;
import java.nio.file.Paths;

public class App {
    public static void main(String[] args) {
        String filePath = "c:/users/44774/cbfacademy/java-exercises-JigaleePuff/exercises/input-output/src/main/java/com/cbfacademy";
        try {
            BufferedReader reader = new BufferedReader(new FileReader("exercise.txt")); 
               reader.read(""); 
        } catch (Exception e) {
            // TODO: #2 handle exception
        }
    }
}

