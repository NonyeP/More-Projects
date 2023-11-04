package com.cbfacademy;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class ReadExercise {

    public static void main(String[] args) {
        //Read from file
    String filePath = "C:\\Users\\Paul\\CBFAcademy\\java-exercises-NonyeP\\exercises\\input-output\\src\\main\\resources\\exercise.txt";

        try (FileInputStream file = new FileInputStream(filePath);
             InputStreamReader streamReader = new InputStreamReader(file);
             LineNumberReader lineReader = new LineNumberReader(streamReader)) {
            String outputline = lineReader.readLine();
            while (outputline != null) {
                System.out.printf("%d: %s%n", lineReader.getLineNumber(), outputline);
                outputline = lineReader.readLine();
            }
        } catch (IOException e) {
            System.out.println("FileReading Exception: " + e.getMessage());
        }
        

        //write to a file
        String data = "C:\\Users\\Paul\\CBFAcademy\\java-exercises-NonyeP\\exercises\\input-output\\src\\main\\resources\\exercise2.txt";
        BufferedReader inputStream = null;
        PrintWriter outputStream = null;
        // try (FileInputStream in = new FileInputStream(filePath);
        //     FileOutputStream out = new FileOutputStream(data);
        try{
            inputStream = new BufferedReader(new FileReader(filePath));
            outputStream = new PrintWriter(new FileWriter(
                    data));

            String l;
            while ((l = inputStream.readLine()) != null) {
                outputStream.println(l);
            }
            System.out.println("File copied");
            inputStream.close();
            outputStream.close();
        }catch(IOException e) {
            System.out.println(e.getMessage());
        }

        
    }
}