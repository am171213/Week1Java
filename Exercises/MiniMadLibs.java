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
public class MiniMadLibs 
{
      public static void main(String[] args)
      {
        Scanner in = new Scanner(System.in);
        String noun1,adj1,noun2,num,adj2,plNoun1,plNoun2,plNoun3,verbPres,verbPast;
        
        System.out.println("Can I get a noun?: ");
            noun1 = in.nextLine();
        System.out.println("Can I get a adjective: ");
            adj1 = in.nextLine();
        System.out.println("Can I get a noun?: ");
            noun2 = in.nextLine();
        System.out.println("Can I get a number?: ");
            num = in.nextLine();
        System.out.println("Can I get a adjective?: ");
            adj2 = in.nextLine();
        System.out.println("Can I get a plural noun?: ");
            plNoun1 = in.nextLine();
        System.out.println("Can I get a plural noun?: ");
            plNoun2 = in.nextLine();
        System.out.println("Can I get a plural noun?: ");
            plNoun3 = in.nextLine();
        System.out.println("Can I get a verb?: ");
            verbPres = in.nextLine();
        System.out.println("Can I get a past-tense verb?: ");
            verbPast = in.nextLine();
            
        System.out.print (noun1 + ": the " + adj1 + " frontier. These are the voyages of the starship " + noun2);
        System.out.print (". Its " + num + "-year mission: to explore strange " + adj2 + " " + plNoun1 + ", to seek out " + adj2);
        System.out.println(" " + plNoun2 + " and " + adj2 + " " + plNoun3 + ", to boldly " + verbPres + " where no one has " + verbPast + " before.");
        
      }
}
