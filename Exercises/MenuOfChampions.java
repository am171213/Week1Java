/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week1;

/**
 *
 * @author Kalex
 */
public class MenuOfChampions 
{
    public static void main(String args[])
    {
        int numOfArt = 10;
        String art = "OoOoOoOo";
        float largePrice = 15.99f;
        float medPrice = 9.99f;
        float smlPrice = 5.59f;
        String largePizza = "Large Pizza";
        String medPizza = "Medium Pizza";
        String smlPizza = "Small Pizza";
        
        for (int i=0; i < numOfArt; i++)
        {
            System.out.print(art);
        }
        System.out.println();
        System.out.println();
        System.out.println("    WELCOME TO MARIO'S PIZZARIA");
        System.out.println();
        for (int i=0; i < numOfArt; i++)
        {
            System.out.print(art);
        }
        System.out.println();
        System.out.println();
         
        System.out.println("    " + largePizza + " --- $" + largePrice);   
        System.out.println("    " + medPizza + " --- $" + medPrice);    
        System.out.println("    " + smlPizza + " --- $" + smlPrice);
    }
}
