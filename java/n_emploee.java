import java.util.Scanner;

class Employee{

int emp_id,posit;
String emp_name;
double salary;

    Employee(int emp_id,int posit,String emp_name,double salary){
        this.emp_id=emp_id;
        this.posit=posit;
        this.emp_name=emp_name;
        this.salary=salary;
    }

    public void Details(int no){
        System.out.println("The details of Employee no:"+ no);
        System.out.println("The emloyee id is :"+emp_id);
        System.out.println("The employee position is :"+posit);
        System.out.println("The employee name is :"+emp_name);
        System.out.println("The employee salary is "+salary);
    }
}

public class n_emploee{
    public static void main(String[]args){
        int no,emp_id,posit;
        String emp_name;
        double salary;

    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the no of Employees:");
        no=sc.nextInt();
    Employee [] emp=new Employee[no];
    for(int i=0;i<no;i++){
     System.out.println("Enter the details of Employee "+(i+1));   
     System.out.println("Enter the employee id :");
     emp_id=sc.nextInt();
     System.out.println("Enter the employee position:");
     posit=sc.nextInt();
     sc.nextLine();
     System.out.println("Enter the employee name:");
     emp_name=sc.nextLine();
     System.out.println("Enter the Employee salary:");
     salary=sc.nextDouble();
     emp[i]=new Employee(emp_id,posit,emp_name,salary);
    }

    
    
    System.out.println("---------------Employee details----------------");
    
    for(int i=0;i<no;i++){
        emp[i].Details((i+1));
    }
       
    }
}