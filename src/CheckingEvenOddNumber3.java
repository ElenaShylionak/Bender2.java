import java.util.Scanner;

public class CheckingEvenOddNumber3<nu> {

    //Разработайте программу, которая проверяет, являются ли числа a, b и c
    // чётными/нечётными.

    //1. Начало выполнения алгоритма (вызов соответствующего метода);
    //2. Предлагаем пользователю ввести числа а,b и c
    //3. проверяем каждое число (четное/нечетное) при помощи арифметичких формул
    //4.вывод (возврат) результат


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        //int a; int b; int c;

        System.out.println("Пожалуйста, введите  a");
        int a = input.nextInt(); // Использовать метод nextInt
        System.out.println("Пожалуйста, введите  b");
        int b = input.nextInt(); // Использовать метод nextInt
        System.out.println("Пожалуйста, введите  a");
        int c = input.nextInt(); // Использовать метод nextInt

        {

            int number1 = Math.abs(a) % 2;
            int number2 = Math.abs(b) % 2;
            int number3 = Math.abs(c) % 2;


            if (number1 == 0) {
                System.out.println("Число а четное  ");
            }
            if (number1 > 0) {
                System.out.println("Число a нечетное ");
            }
            if (number2 == 0) {
                System.out.println("Число b четное");
            }
            if (number2 > 0)
                System.out.println("Число b нечетное ");
            if (number3 == 0) {
                System.out.println("Число c четное");
            }
            if (number3 > 0) {
                System.out.println("Число c нечетное ");

                input.close();
            }

        }
    }
}
