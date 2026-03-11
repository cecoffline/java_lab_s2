import java.util.Scanner;

public class leapmod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the  year:");
        int y = sc.nextInt();
        
            if ((y % 4 == 0 && y % 100 != 0) || y % 400 == 0) {
                System.out.println("Its a leap year");
            }
		else{
			System.out.println("Its not a leap year");
        }
    }
}

