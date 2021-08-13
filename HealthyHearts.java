package Week1;
import java.util.Scanner;

public class HealthyHearts 
{
      public static void main(String[] args)
      {
           Scanner in = new Scanner(System.in);
           int age;
           int bpm;
           
           System.out.println("Hello. What is your age?");
           age = in.nextInt();
           
           bpm = 220-age;
        
           System.out.println("Your maximum heart rate should be " + bpm + " beats per minute.");
           
           int upperZone = (int) (bpm*.85);
           int lowerZone = (int) (bpm*.5);
           
           System.out.println("Your target HR zone is " + lowerZone + " - " + upperZone + " beats per minute.");
      }
}
