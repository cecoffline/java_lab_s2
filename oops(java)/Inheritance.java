import java.util.Scanner;

class Employee {
    int id;
    String name;
    double sal;

    Employee(int id, String name, double sal) {
        this.id = id;
        this.name = name;
        this.sal = sal;
    }
}

class Teacher extends Employee {
    String dept;
    String sub;

    Teacher(int id, String name, double sal, String dept, String sub) {
        super(id, name, sal);
        this.dept = dept;
        this.sub = sub;
    }

    void show() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + sal);
        System.out.println("Department: " + dept);
        System.out.println("Subject: " + sub);
        System.out.println("---------------------------");
    }
}

public class Inheritance {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of teachers: ");
        int n = sc.nextInt();
        sc.nextLine(); 

        Teacher[] t = new Teacher[n];

        for (int i = 0; i < n; i++) {

            System.out.println("\nTeacher " + (i + 1));

            System.out.print("Enter ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Salary: ");
            double sal = sc.nextDouble();
            sc.nextLine();

            System.out.print("Enter Department: ");
            String dept = sc.nextLine();

            System.out.print("Enter Subject: ");
            String sub = sc.nextLine();

            t[i] = new Teacher(id, name, sal, dept, sub);
        }

        System.out.println("\nTeacher Details:");
        for (Teacher x : t) {
            x.show();
        }

        sc.close();
    }
}
