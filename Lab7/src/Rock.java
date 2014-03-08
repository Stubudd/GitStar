// ************************************************************
//   Rock.java // 
//   Play Rock, Paper, Scissors with the user //
// ************************************************************ 
import java.util.Scanner;
import java.util.Random;

public class Rock {
    public static void main(String[] args) {
        String personPlay; //User's play -- "R", "P", or "S" 
        String computerPlay = null;  //Computer's play -- "R", "P", or "S" 
        int computerInt;     //Randomly generated number used to determine 
                            //computer's play 
        Scanner scan = new Scanner(System.in); 
        Random generator = new Random(); 
                   System.out.println("Enter your play: R=Rock, P=Paper, S=scissors: ");
                   personPlay = scan.nextLine().toUpperCase();//Get player's play -- note that this is stored as a string //Make player's play uppercase for ease of comparison
                   computerInt = generator.nextInt(3); //Generate computer's play (0,1,2)
                   computerPlay = "";
                   switch (computerInt)//Translate computer's randomly generated play to string switch (computerInt) 
                   {
                   case 0:
                       computerPlay = "R";
                       break;
                   case 1:
                       computerPlay = "P";
                       break;
                   case 2:
                       computerPlay = "S";
                       break;
                       default:
                           System.out.println ("Error You Fool!");
                   }
    
                  System.out.println(computerPlay);//Print computer's play 
    //See who won.  Use nested ifs instead of &&. 
        if (personPlay.equals(computerPlay))
            System.out.println("It's a tie!");
        else if (personPlay.equals("R")) {
            if (computerPlay.equals("S"))
                System.out.println("Rock crushes scissors.  You win!!"); 
            
        } else if (personPlay.equals("R")) {
            if (computerPlay.equals("P"))
                System.out.println("Rock gets wrapped by paper. You Lose!!");
            //situations for personplay = R
            
        } else if (personPlay.equals("P")) {
            if (computerPlay.equals("S"))
                System.out.println("Paper gets cut by scissors. You lose!!");
        } else if (personPlay.equals("P")) {
            if (computerPlay.equals("R"))
                System.out.println("Rock destroys paper. You Win!!");
            //situation for personplay = P
            
        } else if (personPlay.equals("S")) {
            if (computerPlay.equals("P"))
                System.out.println("Scissors cuts up paper. You Win!!");
        } else if (personPlay.equals("S")) {
            if (computerPlay.equals("R"))
                System.out.println("Scissors beat up rock. You Lose!!");
            //situation for personPlay = S
        }
           }
} 