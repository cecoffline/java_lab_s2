import java.util.Scanner;

public class leap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the start year:");
        int start = sc.nextInt();
        System.out.println("Enter the end year:");
        int end = sc.nextInt();
        for (int year = start; year <= end; year++) {
            if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                System.out.println(year);
            }
        }
    }
}

