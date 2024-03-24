import java.util.Scanner;

public class Guesser {

    Scanner scanner = new Scanner(System.in);

    public void Guess(){

        Generator generate = new Generator();
        generate.generate();

        System.out.println(generate.randNum);

    }

}
