import java.util.Scanner;

class Complex {
    int real, img;

    Complex(int r, int i) {
        this.real = r;
        this.img = i;
    }
}

public class ComplexDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the real and imaginary part of first number:");
        int r1 = sc.nextInt();
        int i1 = sc.nextInt();

        System.out.println("Enter the real and imaginary part of second number:");
        int r2 = sc.nextInt();
        int i2 = sc.nextInt();

        Complex c1 = new Complex(r1, i1);
        Complex c2 = new Complex(r2, i2);

        int realSum = c1.real + c2.real;
        int imgSum = c1.img + c2.img;

        System.out.println("Result is: " + realSum + " + " + imgSum + "i");

        sc.close();
    }
}

