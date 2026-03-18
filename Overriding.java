import java.util.Scanner;

class Shape {
    double area() {
        return 0;
    }
}

class Rectangle extends Shape {
    double l, w;
    Rectangle(double l, double w) { this.l = l; this.w = w; }
    double area() { return l * w; }
}

class Circle extends Shape {
    double r;
    Circle(double r) { this.r = r; }
    double area() { return 3.14 * r * r; }
}

class Square extends Shape {
    double s;
    Square(double s) { this.s = s; }
    double area() { return s * s; }
}

public class Overriding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter length of rectangle: ");
        double l = sc.nextDouble();
        System.out.print("Enter width of rectangle: ");
        double w = sc.nextDouble();
        Shape rect = new Rectangle(l, w);

        
        System.out.print("Enter radius of circle: ");
        double r = sc.nextDouble();
        Shape circle = new Circle(r);

      
        System.out.print("Enter side of square: ");
        double s = sc.nextDouble();
        Shape square = new Square(s);

       
        System.out.println("\nAreas of Shapes:");
        System.out.println("Rectangle Area = " + rect.area());
        System.out.println("Circle Area = " + circle.area());
        System.out.println("Square Area = " + square.area());

    }
}
