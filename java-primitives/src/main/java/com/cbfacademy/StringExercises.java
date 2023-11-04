package com.cbfacademy;

public class StringExercises {

    public String fromCharacters(char[] characters) {
        // TODO - Write code that creates a String from the input array of characters
        String newString = "";
            try {
                // TODO: Write code that creates a String from the input array of characters
               // for(int i = 0 ; i < characters.length -1;i++){
                for (char a : characters) {
                    System.out.println(a);
                    String charString = String.valueOf(a);
                    newString = newString + (charString);
                }
                //throw new RuntimeException("Not implemented");
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("Exception in method caught");
            }
        return newString;
        
    }

    public Long howMany(String text, Character character) {
        // TODO - Write code to determine how many of the input ${character} are contained in the input ${text}
        
            long count = 0;
            int i = 0;
            System.out.println("String length is : " + text.length());
            try {
                while (i < text.length()) {
                    if (character == text.charAt(i)) {
                        System.out.println("character[" + i + "] = " + character);
                        count++;
                    }
                    i++;
                }
                
            }catch (Exception e) {
                e.printStackTrace();
                System.out.println("Exception in method caught");
            }
            System.out.print("Total number of character that match entry(" + character + ") = ");
        return count;
    }

    public Boolean isPalindrome(String word) {
        // TODO - Write code to determine whether the input ${word} is a palindrome

        String newWord = "";
        Boolean flag = true;
        if(word == null || word.isEmpty() || word.trim().isEmpty()) {
            System.out.println("String is null, empty or blank.");
              return false;
        }else{
            try{
            for(int i = 0 ; i < word.length();i++){
                
            }
            for(int j = word.length()-1 ; j >= 0;j--){
                char fromString = word.charAt(j);
                newWord += String.valueOf(fromString);
                
            }
            System.out.println(word + " and " + newWord );
           
            if(word.equalsIgnoreCase(newWord)){
                System.out.println("The input word is a Palindrome");
                flag = true;
            }else {
                System.out.println("The input word is not a Palindrome");
                flag = false;
            }
        }catch (Exception e) {
          e.printStackTrace();
                System.out.println("Exception in method caught");
        } 
    } 
        return flag;
        
    }

    public String getName() {
        return "String Exercises";
    }
    public static void main(String[] args) {
           
            System.out.println("\nThis is StringExercises class");
            System.out.println(new StringExercises().isPalindrome("Madam"));
            System.out.println(new StringExercises().howMany("hello", 'l'));
            System.out.println(new StringExercises().fromCharacters(new char[]{'J','u','l','i','e', 't'}));

    }
}
