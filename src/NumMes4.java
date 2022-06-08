
import java.util.Scanner;

public class NumMes4 {

        public static void main(String[] args) {

                Scanner input = new Scanner(System.in);
                System.out.println("Пожалуйста, введите число от 1 до 31");
                int number = input.nextInt();

                if (number > 0 && number < 11) {
                        System.out.println("Это первая декада");
                } else if (number > 10 && number < 21) {
                        System.out.println("Это вторая декада");
                } else if (number> 20 && number < 32) {
                        System.out.println("Это трейтяя декада");
                } else
                        System.out.println("Число не соотвествует интервалу ");

                input.close();
        }

        }




