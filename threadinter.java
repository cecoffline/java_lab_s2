import java.util.Scanner;

class FibonacciThread extends Thread {
    private int n; 

    FibonacciThread(int n) {
        this.n = n;
}

    public void run() {
        System.out.println("Fibonacci Numbers");
        long a = 0, b = 1;
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            long next = a + b;
            a = b;
            b = next;
}
        System.out.println("\n");
}
}

class EvenNumberThread extends Thread {
    private int start, end;

    EvenNumberThread(int start, int end) {
        this.start = start;
        this.end = end;
}

    public void run() {
        System.out.println("Even Numbers");
        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
}
}
        System.out.println("\n");
}
}

public class threadinter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of Fibonacci numbers: ");
        int fibCount = sc.nextInt();

        System.out.print("Enter start of range for even numbers: ");
        int start = sc.nextInt();
        System.out.print("Enter end of range for even numbers: ");
        int end = sc.nextInt();

        FibonacciThread fibThread = new FibonacciThread(fibCount);
        EvenNumberThread evenThread = new EvenNumberThread(start, end);

        fibThread.start();
        evenThread.start();

        try {
            fibThread.join();
            evenThread.join();
} 
	catch (InterruptedException e) {
            System.out.println("Thread interrupted");
}

        System.out.println("");
        sc.close();
}
}
