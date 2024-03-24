import java.util.Random;

public class Generator {
    int min = 1;
    int max = 10;
    int randNum;
    public void generate(){

        Random rand = new Random();
        randNum = rand.nextInt(max - min) + min;

    }
}
