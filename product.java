import java.util.Scanner;

class ProductItem {
    int pcode;
    String pname;
    double price;

    ProductItem(int c, String n, double p) {
        pcode = c;
        pname = n;
        price = p;
    }
}

public class Product {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Details of the product 1:");
        System.out.print("Enter the Code: ");
        int c1 = sc.nextInt();
        System.out.print("Enter the Name: ");
        String n1 = sc.next();
        System.out.print("Enter the Price: ");
        double p1 = sc.nextDouble();

        System.out.println("\nEnter the Details of the product 2:");
        System.out.print("Enter the Code: ");
        int c2 = sc.nextInt();
        System.out.print("Enter the Name: ");
        String n2 = sc.next();
        System.out.print("Enter the Price: ");
        double p2 = sc.nextDouble();

        System.out.println("\nEnter the Details of the product 3:");
        System.out.print("Enter the Code: ");
        int c3 = sc.nextInt();
        System.out.print("Enter the Name: ");
        String n3 = sc.next();
        System.out.print("Enter the Price: ");
        double p3 = sc.nextDouble();

        ProductItem prod1 = new ProductItem(c1, n1, p1);
        ProductItem prod2 = new ProductItem(c2, n2, p2);
        ProductItem prod3 = new ProductItem(c3, n3, p3);

        ProductItem lowest = prod1;

        if (prod2.price < lowest.price)
            lowest = prod2;

        if (prod3.price < lowest.price)
            lowest = prod3;

        System.out.println("\nProduct with lowest price:");
        System.out.println("Code: " + lowest.pcode);
        System.out.println("Name: " + lowest.pname);
        System.out.println("Price: " + lowest.price);

    }
}

