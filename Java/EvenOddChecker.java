/*
3. Even or Odd Checker 
• Objective: Utilize conditional statements. 
• Task: Determine if a number entered by the user is even or odd. 
• Instructions: 
o Prompt the user for an integer. 
o Use the modulus operator % to check divisibility by 2. 
o Display whether the number is even or odd.
*/
class EvenOddChecker
{
  public static void main(String[] args)
 {
   Scanner s=new Scanner(System.in);
    System.out.println("Enter a number");
    int n=s.nextInt();
    if(n%2==0)
           System.out.println(n+" is a even number");
    else
          System.out.println(n+" is a odd number");
}
}
