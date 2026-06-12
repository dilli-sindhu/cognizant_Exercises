/*
. ArrayList Example 
• Objective: Use dynamic arrays. 
• Task: Manage a list of student names. 
• Instructions: 
o Create an ArrayList to store names. 
o Allow the user to add names to the list. 
o Display all names entered. 
*/
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> students = new ArrayList<>();

        System.out.print("How many names do you want to add? ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter name: ");
            students.add(sc.nextLine());
        }

        System.out.println("\nStudent Names:");
        for (String name : students) {
            System.out.println(name);
        }

        sc.close();
    }
}