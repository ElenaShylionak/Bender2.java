import java.util.Scanner;

public class PointInsideRegion {

    public static String isSolution(double x, double x1, double x2, double y, double y1, double y2) {
        //Программа, которая проверяет, что точка с координатами (x, y)
        //лежит внутри прямоугольника, левая верхняя вершина которого имеет
        // координаты (x1, y1), правая нижняя – (x2, y2), а стороны параллельны координатным осям.

        String result;

        if (x > x1 &&  x < x2 && y > y2 && y < y1 ) {
            result = "Точка находиться в области";
        } else {
            result = "Точка не находиться в области";

        }
        return result;

    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Пожалуйста, введите координту x левой верхней вершины");
        double x1 = input.nextDouble();
        System.out.println("Пожалуйста, введите координту у левой верхней вершины");
        double y1 = input.nextDouble();
        System.out.println("Пожалуйста, введите координту x правой нижней вершины");
        double x2 = input.nextDouble();
        System.out.println("Пожалуйста, введите координту у правой нижней вершины");
        double y2 = input.nextDouble();

        do {
            if (x1 > x2 || y1 < y2) {
                System.out.println("Вы ввели некорректные данные. Введите еще раз, пожалуйста");

                System.out.println("Пожалуйста, введите координту x левой верхней вершины");
                x1 = input.nextDouble();
                System.out.println("Пожалуйста, введите координту у левой верхней вершины");
                y1 = input.nextDouble();
                System.out.println("Пожалуйста, введите координту x правой нижней вершины");
                x2 = input.nextDouble();
                System.out.println("Пожалуйста, введите координту у правой нижней вершины");
                y2 = input.nextDouble();
            }
        } while (x1 > x2 || y1 < y2);

        System.out.println("Пожалуйста, введите координту точки по x ");
        double x = input.nextDouble();
        System.out.println("Пожалуйста, введите координту точки по  у ");
        double y = input.nextDouble();

        input.close();

        System.out.println(isSolution(x, x1, x2, y, y1, y2));


    }
}