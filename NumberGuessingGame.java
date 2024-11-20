import java.util.Scanner;
import java.util.Random;
public class NumberGuessingGame{
  public static void main(String[] args){
    int number,playerGuess,guessCount=0,playAgain=1;
    boolean isCorrect=false;
    Random rd=new Random();
    Scanner sc=new Scanner(System.in);
    while(playAgain==1){
      number=rd.nextInt(1,100);
      System.out.println("Hey player! Guess the number: ");
      while(!isCorrect){
        playerGuess=sc.nextInt();
        if(number==playerGuess){
          isCorrect=true;
        }
        else if(playerGuess>(number+10)){
          System.out.println("Too high...");
        }
        else if(playerGuess>number && playerGuess<=(number+10)){
          System.out.println("Little high...");
        }
        else if(playerGuess<(number-10)){
          System.out.println("Too low...");
        }
        else if(playerGuess>=(number-10) && playerGuess<number){
          System.out.println("Little low...");
        }
        guessCount++;
      }
      if(isCorrect){
        System.out.println("Congratulations! You've guessed the number("+number+") in "+guessCount+" chances");
      }
      System.out.println("Do you want to play again(0/1): ");
      playAgain=sc.nextInt();
      isCorrect=false;
    }
  }
}