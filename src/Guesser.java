import java.util.Scanner;

public class Guesser {

    Scanner scanner = new Scanner(System.in);

    public void Guess() {
        while (true) {
            System.out.println();
            System.out.println("A number is chosen from 1 to 10! Guess the number within 3 trials!");

            Generator generate = new Generator();

            generate.generate();
            int k = 3;

            int i;
            for (i = 0; i < k; i++) {
                System.out.println("Guess a number from 1 to 10:");
                int userGuess = scanner.nextInt();

                if (userGuess == generate.randNum) {
                    System.out.println("You guessed correct! The number was " + generate.randNum);
                    break;
                } else if (generate.randNum > userGuess && i != k - 1) {
                    System.out.println("The number is higher then " + userGuess + " ! Try again!");
                } else if (generate.randNum < userGuess && i != k - 1) {
                    System.out.println("The number is lower than " + userGuess + " ! Try again!");
                }

            }
            if (i == k) {
                System.out.println("You are out of trails! The number was " + generate.randNum);
            }

        }

    }
}
