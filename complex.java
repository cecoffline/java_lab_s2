import java.util.Scanner;
class Complex{
	int real,img;
	complex(int r,int i){
		int real=r;
		int img=i;
	}
	 }

public class complex{
	public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	System.out.println("Ente the real and imaginary part of first number:");
	int r1=sc.nextInt();
	int i1=sc.nextInt();
	System.out.println("Enter the real and imaginary part of second number:");
	int r2=sc.nextInt();
	int i2=sc.nextInt();

	Complex c1=new Complex(r1,i1);
	Complex c2=new Complex(r2,i2);

	int realsum=c1.real+c2.real;
	int imgsum =c1.img+c2.img;

	System.out.println("Result is :"+ realsum + "+" + imgsum);
}
 }
