import java.util.Scanner;

abstract class Shape {
    abstract double area();
}

class Rectangle extends Shape {
    double length, width;

    Rectangle(double l, double w) {
        length = l;
        width = w;
    }

    double area() {
        return length * width;
    }
}

class Square extends Shape {
    double side;

    Square(double s) {
        side = s;
    }

    double area() {
        return side * side;
    }
}

class Circle extends Shape {
    double radius;

    Circle(double r) {
        radius = r;
    }

    double area() {
        return 3.14 * radius * radius;
    }
}

public class abstractclass {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length of rectangle: ");
        double l = sc.nextDouble();
        System.out.print("Enter width of rectangle: ");
        double w = sc.nextDouble();
        Shape rect = new Rectangle(l, w);

        System.out.print("Enter side of square: ");
        double s = sc.nextDouble();
        Shape sq = new Square(s);

        System.out.print("Enter radius of circle: ");
        double r = sc.nextDouble();
        Shape cir = new Circle(r);

        System.out.println("\nAreas of Shapes:");
        System.out.println("Rectangle Area = " + rect.area());
        System.out.println("Square Area = " + sq.area());
        System.out.println("Circle Area = " + cir.area());

    }
}
