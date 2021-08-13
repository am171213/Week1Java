/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week1;

import java.util.Scanner;

/**
 *
 * @author Kalex
 */
public class BestAdderEver 
{
      public static void main(String[] args) {
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
