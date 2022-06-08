import java.util.Scanner;

public class NumberCounter {
    public static void main(String[] args) {

        //нужно создать программу которая проверяет, что введенное польз-ем число палиндром


        Scanner scanner = new Scanner(System.in);
        System.out.println("Пожалуйста, введите 4 числa   ");
        int number = scanner.nextInt();
        do {
            if (number > 9999 || number < 1000) {
                System.out.println(" не верное число  ");
                System.out.println("Пожалуйста, введите 4 числa   ");
                number = scanner.nextInt();
            }
        } while (number > 9999 || number < 1000);

        int  a = number / 1000;
        int  b = number / 100 - (a * 10);
        int  c = number / 10 - (a * 100) - (b * 10);
        int  d = number  - (a * 1000) - (b * 100) - (c * 10);
        if(a == d){
            if (b == c) {
                System.out.println(" Число пaлиндром  ");
            }
            else {
                System.out.println(" Число не пaлиндром  ");
            }
        }
        else {
            System.out.println(" Число не пaлиндром  ");

        }





    }

}