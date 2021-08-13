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
public class PassingTheTuringTest 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        String name = "";
        String color ="";
        String food = "";
        int num = 0;    
        
        System.out.println("What is your name? ");
        name = in.nextLine();
        
        System.out.println("Hello, " + name + " my name is Roborto.");
        
        System.out.println("What is your favorite color? ");
        color = in.nextLine();
        
        System.out.println("Your favorite color is " + color + "? That's pretty neat.");
        
        System.out.println("What is your favorite food? ");
        color = in.nextLine();
        
        System.out.println("Your favorite food is " + food + "? That's pretty neat.");
        
        System.out.println("What is your favorite number? ");
        num = in.nextInt();
        
        System.out.println("Your favorite number is " + num + "? That's pretty neat.");
        System.out.println("Well, that's enough fun for today. See you later!");
    }
}
