import java.util.Scanner;
class product{
	int pcode;
	String pname;
	double price;
	product(int c,String n,double p){
		pcode=c;
		pname=n;
		price=p;
	}
	}

	public class Product{
		public static void main(String[]args){
			Scanner sc=new Scanner(System.in);


	System.out.println("Enter the Details of the product 1:");
	System.out.println("Enter the Code of the product 1:");
	int c1=sc.nextInt();		
	System.out.println("Enter the Name of the product 1:");
	int n1=sc.next();
	System.out.println("Enter the Price of the product 1:");
	int p1=sc.nextDouble();
	

	System.out.println("Enter the Details of the product 2:");
	System.out.println("Enter the Code of the product 2:");
	int c2=sc.nextInt();		
	System.out.println("Enter the Name of the product 2:");
	int n2=sc.next();
	System.out.println("Enter the Price of the product 2:");
	int p2=sc.nextDouble();


	System.out.println("Enter the Details of the product 2:");
	System.out.println("Enter the Code of the product 3:");
	int c3=sc.nextInt();		
	System.out.println("Enter the Name of the product 3:");
	int n3=sc.next();
	System.out.println("Enter the Price of the product 3:");
	int p3=sc.nextDouble();

	product prod1=new product(c1,n1,p1);
	product prod2=new product(c2,n2,p2);
	product prod3=new product(c3,n3,p3);

	product lowest=prod1;

	if(prod2.price<lowest.price)
	lowest=prod2;
	
	if(prod3.price<lowest.price)
	lowest=prod3;

	System.out.println("\nProduct with lowest price:");
	System.out.println("Code:"+lowest.pcode);
	System.out.println("Name:"+lowest.pname);
	System.out.println("Price:"+lowest.price);

}
 }
