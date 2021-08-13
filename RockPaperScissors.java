package Week1;
import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors 
{    

    public static enum Choices {Rock,Paper,Scissors}
    public static void main (String[] args)
    { 
        
        Random ran = new Random();
        int rounds = 0;
        Scanner in = new Scanner(System.in);
        int playerWins = 0;
        int playerLosses = 0;
        int ties = 0;
        final int MAX_ROUNDS = 10;
        final int MIN_ROUNDS =1;
        boolean playingGame = true;
        Choices playerChoice;
        Choices compChoice;
        int playAgain;
        
        
        while(playingGame)
        {
            System.out.println("Hello! Welcome to Rock Paper Scissors.");
            rounds = AskRounds(in);
         
            if (rounds > MAX_ROUNDS)
            {
                System.out.println("This number is too large. Goodbye.");
                playingGame = false;
            }
            if (rounds < MIN_ROUNDS)
            {
                System.out.println("This number is too small. Goodbye.");
                playingGame = false;
            }
            
            for (int round = 1; round <= rounds; round++)   
            {
                System.out.println("Round " + round + "--------------");          
                playerChoice = AskChoice(in);
                compChoice = RandChoice(ran);
                
                if (playerChoice == compChoice)   
                {
                    System.out.println("Looks like its a tie.");
                    ties++;
                }
                else
                {
                    if (PlayerWin(playerChoice,compChoice))
                    {
                        System.out.println("You win this round.");
                        playerWins++;
                    }
                    else
                    {
                        System.out.println("I win this time.");
                        playerLosses++;
                    } 
                }
              
            }    
            
            System.out.println("You Won:  "+ playerWins + " times.");
            System.out.println("You lost: " + playerLosses + " times.");
            System.out.println("We tied:  " + ties + " times.");
            
            System.out.println("Would you like to play again? (1 for Yes, 2 for No)");
               in.nextLine();
            
            playAgain = in.nextInt();
                
            if (playAgain == 2)
            {
                System.out.println("Thanks for playing!");
                playingGame = false;
            }
        }  
    }
    
    public static boolean PlayerWin(Choices playerChoice, Choices compChoice)
    {
        if (playerChoice == Choices.Scissors && compChoice == Choices.Paper)
        {
            return true;
        }
        else if (playerChoice == Choices.Paper && compChoice == Choices.Rock)
        {
            return true;
        }
        else if (playerChoice == Choices.Rock && compChoice == Choices.Scissors)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public static Choices RandChoice(Random rand)
    {
        return Choices.values()[rand.nextInt(2)];
    }
    
    
    public static Choices AskChoice(Scanner in)
    {
        int input = 0;
        System.out.println("What is your choice? (1)Rock, (2)Paper or (3)Scissors?: ");

        input = in.nextInt();
            
        
        switch(input)
        {
            case 1: return Choices.Rock;
            case 2: return Choices.Paper;
            case 3: return Choices.Scissors;
            default: System.out.println("Unreadable statement.");
        }
        return Choices.values()[input];
    }
                
    
    public static int AskRounds(Scanner in)
    {
        System.out.println("How many rounds would you like to play?");
        return in.nextInt();
    }    
}


