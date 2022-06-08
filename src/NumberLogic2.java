import java.util.Scanner;

public class NumberLogic2 {

    public static int isEvenOddNumber(int a, int b, int c) {

        int number1 = Math.abs(a) % 2;
        int number2 = Math.abs(b) % 2;
        int number3 = Math.abs(c) % 2;
        int summa = number1 + number2 + number3;

        if (summa == 0 || summa == 1) {
            System.out.println("Большая часть чисел чётных");
        } else {
            System.out.println("Большая часть чисел нечётных");
        }
        return summa;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Пожалуйста, введите  a");
        int a = input.nextInt(); // Использовать метод nextInt
        System.out.println("Пожалуйста, введите  b");
        int b = input.nextInt(); // Использовать метод nextInt
        System.out.println("Пожалуйста, введите  с");
        int c = input.nextInt(); // Использовать метод nextInt

        input.close();

        System.out.println(isEvenOddNumber(a, b, c));
    }
}
