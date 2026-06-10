/*
 Grade Calculator 
• Objective: Use conditional statements to determine grades. 
• Task: Assign grades based on marks entered by the user. 
• Instructions: 
o Prompt the user for marks out of 100. 
o Use if-else statements to assign grades: 
▪ 90-100: A 
▪ 80-89: B 
▪ 70-79: C 
▪ 60-69: D 
▪ Below 60: F 
o Display the assigned grade. 
*/

import java.util.Scanner;

public class GradeCaluculator{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks (0-100): ");
        int marks = sc.nextInt();

        char grade;

        if (marks >= 90 && marks <= 100) {
            grade = 'A';
        } else if (marks >= 80) {
            grade = 'B';
        } else if (marks >= 70) {
            grade = 'C';
        } else if (marks >= 60) {
            grade = 'D';
        } else if (marks >= 0) {
            grade = 'F';
        } else {
            System.out.println("Invalid marks entered.");
            return;
        }

        System.out.println("Grade: " + grade);
    }
}