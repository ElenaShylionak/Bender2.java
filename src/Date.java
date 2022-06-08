import java.util.Scanner;

public class Date {

    //Написать программу, которая находит количество полных секунд (или минут,
    //или часов)

    public static double isCalculatorSecond(double hour) {

        double account = hour / 3600;
        return account;

        //Hours / 3600;
    }

    public static double isCalculatorMinute(double hour) {

        double account2 = hour / 60;
        return account2;

        //Hours / 60);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Эта проограмма-конвертер секунд в часы и минуты");
        System.out.println("Пожалуйста, введите количество секунд");
        double hour = input.nextDouble();

        input.close();

        //System.out.printf("Hours: "  + isCalculatorSecond(hour)  +  " Minute: " + isCalculatorMinute(hour));
        System.out.printf("Hours: %10.2f\nMinute: %9.2f", isCalculatorSecond(hour), isCalculatorMinute(hour));
    }
}



