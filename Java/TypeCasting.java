/*
 Type Casting Example 
• Objective: Practice type casting between different data types. 
• Task: Convert a double to an int and vice versa. 
• Instructions: 
o Declare a double variable with a decimal value. 
o Cast it to an int and display the result. 
o Declare an int variable and cast it to a double, then display. 
*/

import java.util.*;
public class TypeCasting {
    public static void main(String[] args) {

        // Double to int
        double decimalNumber = 25.75;
        int intValue = (int) decimalNumber;

        // Int to double
        int wholeNumber = 50;
        double doubleValue = (double) wholeNumber;

        System.out.println("Original double value: " + decimalNumber);
        System.out.println("After casting to int: " + intValue);

        System.out.println("Original int value: " + wholeNumber);
        System.out.println("After casting to double: " + doubleValue);
    }
}