import java.util.Scanner;

public class Area {

   
    double area(double l, double b) {
        return l * b;
    }

   
    double area(double r) {
        return 3.14 * r * r;
    }

   
    int area(int s) {
        return s * s;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Area ob = new Area();

       
        System.out.print("Enter length and breadth: ");
        double l = sc.nextDouble();
        double b = sc.nextDouble();
        System.out.println("Area of Rectangle: " + ob.area(l, b));

        
        System.out.print("Enter radius: ");
        double r = sc.nextDouble();
        System.out.println("Area of Circle: " + ob.area(r));

       
        System.out.print("Enter side of square: ");
        int s = sc.nextInt();
        System.out.println("Area of Square: " + ob.area(s));

    }
}
