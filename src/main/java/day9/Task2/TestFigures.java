package day9.Task2;

public class TestFigures {
    public static void main(String[] args) {
        Figure[] figures = new Figure[8];

        figures[0] = new Triangle(10, 10, 10, "Red");
        figures[1] = new Triangle(10, 20, 30, "Green");
        figures[2] = new Triangle(10, 20, 15, "Red");
        figures[3] = new Rectangle(5, 10, "Red");
        figures[4] = new Rectangle(40, 15, "Orange");
        figures[5] = new Circle(4, "Red");
        figures[6] = new Circle(10, "Red");
        figures[7] = new Circle(5, "Blue");

        System.out.println(calculateRedPerimeter(figures));
        System.out.println(calculateRedArea(figures));

    }

    public static double calculateRedPerimeter(Figure[] figures) {
        double sum = 0;
        for (Figure x : figures) {
            if (x.getColor().equals("Red")) {
                sum += x.perimeter();
            }
        }

        return sum;
    }

    public static double calculateRedArea(Figure[] figures) {
        double sum = 0;
        for (Figure x : figures) {
            if (x.getColor().equals("Red")) {
                sum += x.area();
            }
        }

        return sum;
    }
}
