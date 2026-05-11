import java.util.Scanner;

interface Student {

    void getDetails();
}

interface Marks {

    void getMarks();
}

class Result implements Student, Marks {

    Scanner sc = new Scanner(System.in);

    int roll;

    double mark1, mark2, total;

    public void getDetails() {

        System.out.println(
            "Enter roll number:"
        );

        roll = sc.nextInt();
    }

    public void getMarks() {

        System.out.println(
            "Enter mark 1:"
        );

        mark1 = sc.nextDouble();

        System.out.println(
            "Enter mark 2:"
        );

        mark2 = sc.nextDouble();

        total = mark1 + mark2;
    }

    void display() {

        System.out.println(
            "Roll number : " + roll
        );

        System.out.println(
            "Total marks : " + total
        );
    }
}

public class example {

    public static void main(String[] args) {

        Result r = new Result();

        r.getDetails();

        r.getMarks();

        r.display();
    }
}