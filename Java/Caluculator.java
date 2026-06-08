/*
  2. Simple Calculator 
• Objective: Practice arithmetic operations and user input. 
• Task: Develop a calculator that performs addition, subtraction, multiplication, and division. 
• Instructions: 
o Prompt the user to enter two numbers. 
o Ask the user to choose an operation. 
o Display the result of the operation. 
*/
import java.util.*;
class Caluculator
{
  public static void main(String[] args)
  {
   Scanner s=new Scanner(System.in);
   System.out.println("Enter two numbers:");
    int a=s.nextInt(),b=s.nextInt();
     System.out.println("Enter choice\n1.ADD 2.SUB 3.MUL 4.DIV\n");
     int ch=s.nextInt();
      int res=0;      
     switch(ch)
     {
      case 1:res=a+b;
               break;
      case 2:res=a-b;
               break;
      case 3:res=a*b;
               break;
      case 4:res=a/b;
               break;
     default:System.out.println("Your choice is Invalid");
    }
  System.out.println("Result  : "+res);
}
}