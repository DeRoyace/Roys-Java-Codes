/**
 * @Problem taken from CodeWithHarry Java tutorials...
 * Edited question:
 Create a class GuessTheNum, which allows a user to play "Guess the Number" game once.

 Game should have the following methods:
 * Constructor to generate the random number
 * accept() to take a user input of number
 * isCorrectNumber() to detect whether the number entered by the user is true
 * 
 */
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class GuessTheNum {
    static int random, guess, count;
    Scanner sc;

    GuessTheNum()
    {
        count = 0;
        random = ThreadLocalRandom.current().nextInt(1, 100);
    }

    void accept()
    {
        sc=new Scanner(System.in);
        System.out.print("\nGuess any number between 1 to 100 : ");
        guess=sc.nextInt();
    }

    void isCorrectNumber()
    {
        if(guess==random)
        {
            System.out.println("The guessed number matched !!");
        }    
        else if(guess>random)
        {
            System.out.println("The number is larger.");
            count++;
            accept();
            isCorrectNumber();
        }
        else 
        {
            System.out.println("The number is smaller.");
            count++;
            accept();
            isCorrectNumber();
        }
    }

    public static void main(String[] args) {
        GuessTheNum gn=new GuessTheNum();
        gn.accept();
        gn.isCorrectNumber();
        System.out.println("Number of guesses to detect the correct number is "+count);
    }
    
}
