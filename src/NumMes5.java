
import java.util.Scanner;

public class NumMes5 {

    public static String isDay(int number) {

        String msg = null;

        switch (number) {
            case 1, 2, 3, 4, 5, 6, 7, 8, 9, 10:
                msg = "Сейчас 1 декада!";
                break;
            case 11, 12, 13, 14, 15, 16, 17, 18, 19, 20:
                msg = "Сейчас 2 декада!";
                break;
            case 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31:
                msg = "Сейчас 3 декада!";
                break;
        }
               return msg;

        }
        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);

            System.out.println("Пожалуйста, введите число от 1 до 31");
            int number= input.nextInt();

            input.close();

            System.out.println(isDay(number));

        }

    }
