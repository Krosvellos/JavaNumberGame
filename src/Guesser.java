import java.util.Scanner;

public class Guesser {

    Scanner scanner = new Scanner(System.in);

    public void Guess(){

        Generator generate = new Generator();
        while(true) {
        generate.generate();

        System.out.println("Guess a number from 1 to 10:");
        int userGuess = scanner.nextInt();

            if (userGuess == generate.randNum) {
                System.out.println("You guessed correct! The number is " + generate.randNum);

            } else {
                System.out.println("You lost! The number was " + generate.randNum);

            }

        }

    }

}
