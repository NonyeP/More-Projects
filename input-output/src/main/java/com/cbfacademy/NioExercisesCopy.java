package com.cbfacademy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
//import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
//import java.io.OutputStream;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
//import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
///import java.util.stream.Stream;

public class NioExercisesCopy {
    
        public static void main(String[] args) {
            //read input with nio
            //  String filePath1 = "C:\\Users\\Paul\\CBFAcademy\\java-exercises-NonyeP\\exercises\\input-output\\src\\main\\resources\\exercise.txt";
           
            //  try(Stream<String> stream = Files.lines(Paths.get(filePath1))){
            //     stream.forEach(System.out::println);
            //  }catch(IOException e){
            //     System.out.println("File reading exception : " + e.getMessage());
             
            // }
        
           //copy output with nio
        //    Path sourcePath = Paths.get("C:\\Users\\Paul\\CBFAcademy\\java-exercises-NonyeP\\exercises\\input-output\\src\\main\\resources\\exercise.txt"); 
        //    Path newFile = Paths.get("C:\\Users\\Paul\\CBFAcademy\\java-exercises-NonyeP\\exercises\\input-output\\src\\main\\resources\\exercise4.txt");
        //     try (OutputStream os = new FileOutputStream(newFile.toFile())) {
    
        //         Files.copy(sourcePath, os);
    
        //     } catch (IOException ex) {
        //         System.out.println(ex.getMessage());
        //     }
        //     //File content reversal
        //     String fw2 = "C:\\Users\\Paul\\CBFAcademy\\java-exercises-NonyeP\\exercises\\input-output\\src\\main\\resources\\exercise5.txt";
        //     try {
        //      BufferedReader input = new BufferedReader(new FileReader(filePath1));
        //      ArrayList list = new ArrayList();
        //      String line;
        //         while ((line = input.readLine()) != null) {
        //         list.add(line);
        //        }
        //      System.out.println(list);
        //      input.close();
    
        //      Collections.reverse(list);
        //      System.out.println(list);
    
        //      PrintWriter output = new PrintWriter(new BufferedWriter(new FileWriter(fw2)));
        //      for(Iterator i = list.iterator(); i.hasNext();) {
        //         output.println((String) i.next());
        //       }
    
        //      output.close();
    
        //     }catch (IOException e) {
        //     System.out.println(e.getMessage());
        //     }
         String fw2 = "C:\\Users\\Paul\\CBFAcademy\\java-exercises-NonyeP\\exercises\\input-output\\src\\main\\resources\\exercise7.txt";
         String filePath1 = "C:\\Users\\Paul\\CBFAcademy\\java-exercises-NonyeP\\exercises\\input-output\\src\\main\\resources\\exercise.txt";
         try {
            
            BufferedReader input = new BufferedReader(new FileReader(filePath1));
            Path myPath = Paths.get(fw2);
            List<String> list = Files.readAllLines(myPath); //StandardCharsets.UTF_8);

            System.out.println(list);
            input.close();

            Collections.reverse(list);
            System.out.println(list);

            PrintWriter output = new PrintWriter(new BufferedWriter(new FileWriter(fw2)));
            for(Iterator i = list.iterator(); i.hasNext();) {
                output.println((String) i.next());
            }

            output.close();

        }catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

 }
    

