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
public class AllTheTrivia 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        int planets;
        String pres;
        String tree;
        String month;
        
        System.out.println("How many planets in the solar system?");
        planets = Integer.parseInt(in.nextLine());
        
        System.out.println("Who was the first US president?");
        pres = in.nextLine();
        
        System.out.println("What kind of tree gives you syrup?");
        tree = in.nextLine();
        
        System.out.println("What is the first month of the year?");
        month = in.nextLine();
        
        System.out.println();
     
        System.out.println("I saw " + planets + " " + pres + "'s under a " + tree + " tree in " + month +".");
    }
}
