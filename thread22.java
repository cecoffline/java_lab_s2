import java.util.Scanner;

class TableThread extends Thread {
    public void run() {
        System.out.println("--- Multiplication Table of 5");
        for (int i = 1; i <= 10; i++) {
            System.out.println("5 x " + i + " = " + (5 * i));
        }
        System.out.println("");
    }
}

class PrimeThread extends Thread {
    private int n;

    PrimeThread(int n) {
        this.n = n;
    }

    public void run() {
        System.out.println("Prime Numbers");
        int count = 0, num = 2;

        while (count < n) {
            if (isPrime(num)) {
                System.out.println(num);
                count++;
            }
            num++;
        }
        System.out.println("");
    }

    private boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}

public class thread22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n (number of primes): ");

        if (sc.hasNextInt()) {
            int n = sc.nextInt();

            TableThread tableThread = new TableThread();
            PrimeThread primeThread = new PrimeThread(n);

            try {
                tableThread.start();
                tableThread.join();
                primeThread.start();
                primeThread.join();
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");
            }

            System.out.println("\n");
        } else {
            System.out.println("Invalid input.");
        }

        sc.close();
    }
}
