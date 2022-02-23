// Code to generate 4-digit random number
import java.util.concurrent.ThreadLocalRandom;

public class RandomNum {

    public static void main(String[] args) 
    {
        int randomInt = ThreadLocalRandom.current().nextInt(1000, 9999);
        System.out.println(randomInt);
    }

}
