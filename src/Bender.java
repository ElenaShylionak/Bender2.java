import java.util.Scanner;

public class Bender {
    public static void main(String[] args) {
   Fry MyFry =new Fry();
   Scanner s =new Scanner(System.in);

        System.out.println( " введите свой любимый фильльм");
        String movie = s.nextLine();

        MyFry.SetName(movie); //пепредали в метод
        MyFry.oput();//





    }
}
