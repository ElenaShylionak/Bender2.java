public class Fry {
private String MovieName;  // мы задали основную переменную в поле вне метода.

public void SetName (String name){ // метод куда передается переменная с другого класса
    MovieName = name;

}
public String getMovieName(){ // метод который возращает переменную
    return MovieName;

} public void oput (){ //метод вывода на консоль
        System.out.printf("Твой любимый фильм %s", getMovieName());
    }



}




