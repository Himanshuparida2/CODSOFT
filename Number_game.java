import java.util.*;
public class Number_game {
   static Random random=new Random();
   public void Game(int guess){
    int com=random.nextInt(100)+1;
    System.out.println("----------------------------------------");
    if(guess==com){                                      // When User Guess Is Correct
        System.out.println("You guessed it!!!");
        System.out.println("Computer Guess was "+com);
    }
    else if(com==guess+5 || com==guess+4 || com==guess+3 || com==guess+2 || com==++guess || com==--guess || com==guess-2 || com==guess-3 || com==guess-4 || com==guess-5){
        System.out.println("You guessed close enough!!!");     // When User Guess Is Close 
        System.out.println("Computer Guess was "+com);
    }
    else if(com<guess+5){                                      // When User Guess Is Too High
        System.out.println("You guessed Too High!!!");
        System.out.println("Computer Guess was "+com);
    }
    else if(com>guess-5){                                       // When User Guess Is Too Low
        System.out.println("Your Guess Was Too Less!!!");
        System.out.println("Computer Guess was "+com);
    }
    else{
        System.out.println("Error!!!");
    }
    System.out.println("----------------------------------------");
   }
   public static void main(String arg []){
          Scanner sc=new Scanner(System.in);
          Number_game g1=new Number_game();
          for(int i=1;i<=5;i++){                           // Game have 5 guesses in a round
            System.out.println("Enter Your Guess: ");
            int guess=sc.nextInt();
            if(guess>100 || guess<1){
                System.out.println("Invalid guess Please guess between 1-100");
            }
            else{
            g1.Game(guess);
            }
        }
          int choice= 1;
          while(choice==1) {
            System.out.println("----------------------------------------");
            System.out.println();
            System.out.println("Enter Your Choice:");
            System.out.println("Press 1 to Play Again");           //User get the choice to play more Round
            System.out.println("Press 2 to Exit");
            System.out.println();
            choice=sc.nextInt();
          switch (choice) {
            case 1:
            for(int i=1;i<=5;i++){                           // Game have 5 guesses in a round
                System.out.println("Enter Your Guess: ");
                int guess=sc.nextInt();
                if(guess>100 || guess<1){
                    System.out.println("Invalid guess Please guess between 1-100");
                }
                else{
                g1.Game(guess);
                }
            }
                break;
            case 2:
               System.out.println();
               break;
            default:
               System.out.println("Invalid Choice !!!");
                break;
          }
        }
          System.out.println("Thank you for Playing!!!");
          System.out.println();
          System.out.println("----------------------------------------");
          sc.close();
   }
}