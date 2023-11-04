package com.cbfacademy;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectionsExercises {
    public static void main(String[] args) {
        
    }

    public LinkedList<Integer> useLinkedList() {
        // TODO: create an empty linked list
        //  - add 4 as the first element of the list
        //  - then add 5, 6, 8, 2, 9 to the the list
        //  - add another 2 as the last element of the list
        //  - add 4 as the 3rd element of the list
        //  - invoke the method element() on the list and print the result on the screen
        //  - return the list
        LinkedList<Integer> list = new LinkedList<>();
        int value = 0;
        try {
            list.add(4);
            list.add(5);
            list.add(6);
            list.add(8);
            list.add(2);
            list.add(9);
            list.add(2);
            list.add(2, 4);
            value = list.element(); //gives the head of the list
        } catch (Exception e){
            e.printStackTrace();
        }
        System.out.println(value);
    
        return list;
        
    }
       

    public Stack<Integer> useStack() {
        // TODO: create an empty stack
        //  - add 5, 6, 8, 9 to the the stack
        //  - print the first element of the stack on the screen
        //  - print the last element of the stack on the screen
        //  - invoke the method pop() on the stack and print the result on the screen
        //  - invoke the push(4) method on the stack
        //  - return the stack
        
        
        Stack<Integer> stack = new Stack<Integer>();
        try{
        stack.add(5);
        stack.add(6);
        stack.add(8);
        stack.add(9);
        
        System.out.print(stack.firstElement());
        System.out.print(stack.lastElement());
        System.out.print(stack.pop());
        stack.push(4);
        }catch(Exception e){
            e.printStackTrace();
        }
       
        return stack;
        
    }

    public ArrayDeque<Integer> useArrayDeque() {
        // TODO: create an empty arrayDeque
        //  - add 5, 6, 8, 9 to the the stack
        //  - print the first element of the queue on the screen
        //  - print the last element of the queue on the screen
        //  - invoke the method poll() on the queue and print the result on the screen
        //  - invoke the element() method on the queue and print the result on the screen
        //  - return the queue
        
        ArrayDeque<Integer> array = new ArrayDeque<>();
        try{
        array.add(5);
        array.add(6);
        array.add(8);
        array.add(9);
        
        System.out.print(array.getFirst());
        System.out.print(array.getLast());
        System.out.print(array.poll());
        int s = array.element();
        System.out.print(s);
        }catch(Exception e){
            e.printStackTrace();
        }
        return array;
       
    }

    public HashMap<Integer, String> useHashMap() {
        // TODO: create an empty hash map
        //  - add {1, TypeScript} entry to the map
        //  - add {2, Kotlin} entry to the map
        //  - add {3, Python} entry to the map
        //  - add {4, Java} entry to the map
        //  - add {5, JavaScript} entry to the map
        //  - add {6, Rust} entry to the map
        //  - determine the set of keys from the map and print it on the screen
        //  - determine the set of keys from the map and print it on the screen
        //  - determine whether the map contains "English" as a language and print the result on the screen
        //  - return the map
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "TypeScript");
        map.put(2, "Kotlin");
        map.put(3, "Python");
        map.put(4, "Java");
        map.put(5, "JavaScript");
        map.put(6, "Rust");
        try{
        List<Integer> l1;
        List<String> l2;
                Set<Integer> keys = map.keySet();
               // for (Integer k : keys) {
                    //System.out.println( k);
        
               // }
                Collection<String> values = map.values();
               // for (String v : values) {
                    //System.out.println( v);
                //}
                l1 = keys.stream().collect(Collectors.toList());
                l2 = values.stream().toList();
                System.out.print(l1);
                System.out.print(l2);
        
        boolean checkValue = map.containsValue("English");
        System.out.print(checkValue);
        

       }catch(Exception e){
        e.printStackTrace();
        }

        return map;
        //throw new RuntimeException("Not implemented");
    }

    public String getName() {
        return "Collections Exercises";
    }
}
