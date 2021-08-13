package Week1;

import java.util.Scanner;

public class DoItBetter
{
      public static void main(String[] args) 
      {
          int op1,op2;
          int sum;
         
        Scanner in = new Scanner(System.in); 
         
          System.out.print("Enter a number: ");
        
           op1 = in.nextInt();
          System.out.println();
          
          System.out.print("Enter a number: ");
          op2 = in.nextInt();
          System.out.println();
          
          sum = op1 + op2;
          System.out.println("The sum is: " + sum);
          
      }
}
