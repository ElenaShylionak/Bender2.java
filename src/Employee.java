import java.util.Random;

public class Employee {

    public static void main(String[] args) {

        int min = 100;
        int max = 200;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min;

    }
}

