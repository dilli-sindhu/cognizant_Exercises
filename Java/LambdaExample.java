/*
27. Lambda Expressions 
• Objective: Use functional programming features. 
• Task: Sort a list of strings using a lambda expression. 
• Instructions: 
o Create a List of strings. 
o Use Collections.sort() with a lambda to sort the list. 
o Display the sorted list.
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LambdaExample {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        names.add("Ravi");
        names.add("Anil");
        names.add("Priya");
        names.add("Kiran");

        Collections.sort(names, (a, b) -> a.compareTo(b));

        System.out.println("Sorted List:");
        names.forEach(System.out::println);
    }
}