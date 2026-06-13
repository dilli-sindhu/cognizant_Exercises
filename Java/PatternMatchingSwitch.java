/*
30. Pattern Matching for switch (Java 21) 
• Objective: Simplify conditional logic with pattern matching in enhanced switch expressions. 
• Task: Determine the type of an object and respond accordingly. 
• Instructions: 
o Create a method that accepts Object as input. 
o Use a switch expression to check if the object is Integer, String, Double, etc. 
o Print a message based on the object’s type. 
*/
public class PatternMatchingSwitch {

    public static void printType(Object obj) {
        switch (obj) {
            case Integer i ->
                System.out.println("Integer value: " + i);

            case String s ->
                System.out.println("String value: " + s);

            case Double d ->
                System.out.println("Double value: " + d);

            case null ->
                System.out.println("Null value");

            default ->
                System.out.println("Unknown type");
        }
    }

    public static void main(String[] args) {
        printType(100);
        printType("Java");
        printType(3.14);
        printType(null);
    }
}