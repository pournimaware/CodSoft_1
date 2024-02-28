import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int minRange = 1;
        int maxRange = 100;
        int attemptsLimit = 5;
        int round = 1;
        int totalAttempts = 0;
        int totalRoundsWon = 0;

        System.out.println("Welcome to guess the Number Game!");
        System.out.println("You have" + attemptsLimit + "attempts to the guess number between" + minRange + "and" + maxRange);

        boolean playAgain= true;
        while(playAgain){
            System.out.println("\n Round" + round);
            int screateNumber = random.nextInt(maxRange - minRange + 1)+ minRange;
            int attempts = 0;



            boolean guessedCorrectly = false;
            while(attempts<attemptsLimit &&! guessedCorrectly){
                System.out.println("Attempt" +(attempts +1)+" :Enter you guess:" );
                int guess = scanner.nextInt();
                attempts++;
                totalAttempts++;

                if (guess==screateNumber){
                    System.out.println("Congratulations! you've guessed  the Number"+ screateNumber+"correctly!");

                    guessedCorrectly= true;
                    totalRoundsWon++;
                }
                else if (guess <screateNumber){
                    System.out.println("To low! try again.");
                }else{
                    System.out.println("To high! Try again.");
                }

            }
            if (!guessedCorrectly){
                System.out.println("Sorry! you've  used all your attempts.The correct number was:"+ screateNumber);
            }
            round++;
            System.out.println("Do you want to play again?(yes/no):");

            String playAgainResponse = scanner.next();
            playAgain = playAgainResponse.equalsIgnoreCase("yes");
            
            System.out.println("\n GameOver!");

            System.out.println("Total Rounds played:"+ (round-1));
            System.out.println("Total Rounds Won:"+ totalRoundsWon);

            System.out.println("Total Attempts:" + totalAttempts);

        }

    }
}