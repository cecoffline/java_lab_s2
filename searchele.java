import java.util.Scanner;

public class searchele {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        sc.nextLine(); 
        String arr[] = new String[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLine(); 
        }
        System.out.print("Enter element to search: ");
        String key = sc.nextLine();
        int flag = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i].equals(key)) {  
                System.out.println("Element found at position: " + (i + 1));
                flag = 1;
                break;
            }
        }
        if (flag == 0) {
            System.out.println("Element not found");
        }
    }
}

