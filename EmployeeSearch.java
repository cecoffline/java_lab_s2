import java.util.Scanner;

class Employee {
    int e_no;
    String e_name;
    double salary;

    Employee(int e_no, String e_name, double salary) {
        this.e_no = e_no;
        this.e_name = e_name;
        this.salary = salary;
    }

    void display() {
        System.out.println("Employee Number: " + e_no);
        System.out.println("Employee Name: " + e_name);
        System.out.println("Salary: " + salary);
    }
}

public class EmployeeSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();

        Employee[] emp = new Employee[n];
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Employee " + (i + 1));
            System.out.print("Enter Employee Number: ");
            int e_no = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter Employee Name: ");
            String e_name = sc.nextLine();
            System.out.print("Enter Salary: ");
            double salary = sc.nextDouble();

            emp[i] = new Employee(e_no, e_name, salary);
        }

        System.out.print("\nEnter Employee Number to search: ");
        int searchNo = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < n; i++) {
            if (emp[i].e_no == searchNo) {
                System.out.println("\nEmployee Found:");
                emp[i].display();
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("\nEmployee not found.");
        }

    }
}
