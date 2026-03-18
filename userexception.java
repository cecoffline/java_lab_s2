import java.util.Scanner;

class NegativeException extends Exception {
    NegativeException(String msg) {
        super(msg);
    }
}

public class userexception {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n, i;
        int sum = 0;

        System.out.print("Enter how many numbers: ");
        n = sc.nextInt();

        for(i = 0; i < n; i++) {
            try {
                System.out.print("Enter number: ");
                int num = sc.nextInt();

                if(num < 0) {
                    throw new NegativeException("Negative numbers are not allowed");
                }

                sum = sum + num;
            }
            catch(NegativeException e) {
                System.out.println("Exception: " + e.getMessage());
                i--; 
            }
        }

        double avg = (double)sum / n;

        System.out.println("Average of positive numbers = " + avg);

        sc.close();
    }
}
