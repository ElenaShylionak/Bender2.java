import java.util.Scanner;

public class DaysWeek {

    //Написать программу, которая определяет номер (или строковый эквивалент)
    //дня недели (или день года) для K-го дня любого месяца текущего года.

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.println("Пожалуйста, введите  число от 1 до 7");
        int num_day = input.nextInt();


            if (1 < 7) {
                System.out.println("Вы ввели некорректные данные");
            }


        switch(num_day) {
            case 1:
                System.out.println("Сегодня понедельник!");
                break;

            case 2:
                System.out.println("Сегодня вторник!");
                break;

            case 3:
                System.out.println("Сегодня среда!");
                break;

            case 4:
                System.out.println("Сегодня четверг!");
                break;

            case 5:
                System.out.println("Сегодня пятница!");
                break;

            case 6:
                System.out.println("Сегодня суббота!");
                break;

            case 7:
                System.out.println("Сегодня воскресенье!");
                break;

        }

    }
}










