package guessinggame;
import java.util.Scanner;

public class GuessingGame {
    private RandomNumberGenerator randomNumberGenerator;
    private int randomNumber;

    public GuessingGame(RandomNumberGenerator randomNumberGenerator) {
    this.randomNumberGenerator = randomNumberGenerator;
    this.randomNumber = randomNumberGenerator.generateRandomNumber();
    }
    
    public void play(){
        Scanner scanner = new Scanner(System.in); 
        boolean correct = false;
        
        System.out.println("Welcome to the guessing game, the random number is between 1-50");
        
        while(!correct){
            
            System.out.print("What is your guess? ");
            int userGuess = scanner.nextInt();
            
            if (userGuess == randomNumber)
            {
                correct = true;
                System.out.println("You've guessed correct!");
            }
            else if (userGuess > randomNumber){
                System.out.println("Guess Lower");
            }
            else{
                System.out.println("Guess Higher");
            }
        }
    }  

    public static void main(String[] args) { 
        RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator();
        GuessingGame game = new GuessingGame(randomNumberGenerator);
        game.play();
    }
    
}
