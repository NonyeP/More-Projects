package com.cbfacademy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FileExtension {
    public static void main(String[] args) throws CustomException {

            List<String> l = new ArrayList<>();
            l.add("App.java");
            l.add("App.txt");
            l.add(null);
            l.add("App.md");

            new FileExtension().checkFileList(l);


//        try{
//        System.out.println(new FileExtension().check(null));
//        }catch(CustomException e){
//            System.out.println(e.getMessage());
//        }
    }
    public int check(String fileName) throws CustomException {

        if (fileName == null || fileName.isEmpty()) {
            throw new CustomException("String is empty or null");

        } else if (fileName.endsWith(".java")) {
            //System.out.println("FileName ends with .java");
            return 1;
        } else {
            //System.out.println("FileName does not end with .java");
            return 0;
        }
    }
    public int checkList(String fileName)  {

        if (fileName == null || fileName.isEmpty()) {
                return -1;

        } else if (fileName.endsWith(".java")) {
            //System.out.println("FileName ends with .java");
            return 1;
        } else {
            //System.out.println("FileName does not end with .java");
            return 0;
        }
    }

    public void checkFileList(List<String> fileNames) throws CustomException {
        Map<String, Integer> map = new HashMap<>();// because it can take one null key and several null values
        int value = 0;
        String name = "";
        for (String extension : fileNames) {
            name = extension;
            value = checkList(extension);
            map.put(name, value);
        }
        System.out.println(map);
    }
}


