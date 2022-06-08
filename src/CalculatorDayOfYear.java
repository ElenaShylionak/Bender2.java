import java.util.Scanner;

public class CalculatorDayOfYear {

    public static int isCalculatorDayOfYear(int days) {

        int week = days / 7; // получаем количество полных недель
        int day = days - week * 7; // какой сейчас день недели

        return day;

    }


    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.println("Пожалуйста, введите  число ");
        int day = input.nextInt();

        do {
            if (day < 0 || day > 365) {
                System.out.println("Вы ввели некорректные данные. Введите еще раз, пожалуйста");

                System.out.println("Пожалуйста, введите  число ");
                day = input.nextInt();

            }
        } while (day < 0 || day > 365);


        switch (isCalculatorDayOfYear(day)) {
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







