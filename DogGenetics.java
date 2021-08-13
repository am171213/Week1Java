package Week1;

import java.util.Scanner;
import java.util.Random;

public class DogGenetics 
{
    public static void main(String[] args) 
    {
    String dogName;
     Scanner in = new Scanner(System.in);
     Random ran = new Random();
     int totalPer = 0;
     int[] arr = new int[5];
     
     System.out.println("What is your dogs name?");
     dogName = in.nextLine();
     
    System.out.println("Well then, I have this highly reliable report on "+ dogName +"'s prestigious background right here.");
    arr[0] = ran.nextInt(100);
    totalPer = arr[0];
    
    for (int i = 1; i < arr.length-1 && totalPer <= 100; i++)
    {
        arr[i] = ran.nextInt(100-totalPer);
        totalPer = arr[i] + totalPer;
    }
        
    arr[arr.length-1] = 100-totalPer;
    
    System.out.println(arr[0] + "% St. Bernard");
    System.out.println(arr[1] + "% Chihuahua");
    System.out.println(arr[2] + "% Dramatic RedNosed Asian Pug");
    System.out.println(arr[3] + "% Common Cur");
    System.out.println(arr[4] + "% King Doberman");
    System.out.println("Wow! That's quite the dog.");
    }
}
