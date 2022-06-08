import java.util.Scanner;

public class NumberLogic {

    //Разработайте программу, которая проверяет, что хотя бы одно из чисел a, b
    //и c чётное/нечётное.
    public static String CheckingEvenOddNumber(double a, double b, double c) {

        String result;

        double number1 = Math.abs(a) % 2;
        double number2 = Math.abs(b) % 2;
        double number3 = Math.abs(c) % 2;

        if (number1 == 0 || number2 == 0 || number3 == 0) {
            result = "Eсть хотя бы одно четное или  не четное  число ";
        }
        else if (number1 == 1 || number2 == 1 || number3 == 1) {
           result = "Eсть хотя бы одно четное или не четное число ";
        } else {
            result = "Нет ни четных, не нечетных чисел";
        }
        return result;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Пожалуйста, введите  a");
        double a = input.nextDouble();
        System.out.println("Пожалуйста, введите  b");
        double b = input.nextDouble();
        System.out.println("Пожалуйста, введите  a");
        double c = input.nextDouble();

        input.close();

        System.out.println(CheckingEvenOddNumber(a,b,c));


    }
}




