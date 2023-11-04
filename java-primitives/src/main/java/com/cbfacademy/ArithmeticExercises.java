package com.cbfacademy;

public class ArithmeticExercises {
    
//Following our example of arithmetic operations on integers, create a simple Java program with simple expressions to (for both float and double types):

//add decimal numbers
//subtract decimal numbers
//multiply decimal numbers
//divide decimal numbers
//and print the results on the screen.

//Relational Operations
//Following our example of relational operations on integers, create a simple Java program with simple expressions to (for doubles only):

//compare the equality of decimal numbers
//evaluate which decimal is higher
//evaluate which decimal is smaller
//and print the results on the screen.

public static void main(String[] args) {
    float operand1 = 12.0f;
        float operand2 = 20.0f;

        ArithmeticExercises exercises = new ArithmeticExercises();

        System.out.println(exercises.addFloat(operand1,operand2));
        System.out.println(exercises.subtractFloat(operand1,operand2));
        System.out.println(exercises.multiplyFloat(operand1,operand2));
        System.out.println(exercises.divideFloat(operand1,operand2));

}

public float addFloat(float num1,float num2){
return num1 + num2;

}
public float subtractFloat(float num1,float num2){
return num1 - num2;

}
public float multiplyFloat(float num1,float num2){
return num1 * num2;
}

public float divideFloat(float num1,float num2){
return num1 / num2;
}

}
