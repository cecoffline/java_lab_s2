import java.util.Scanner;

class Student{
    int age,roll;
    String name;

    Student(int age,int roll,String name){
        this.age=age;
        this.roll=roll;
        this.name=name;
    }
}

public class StudentArray{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no of students:");
        int n=sc.nextInt();
        Student []st=new Student[n];

        for(int i=0;i<n;i++){
              System.out.println("Enter the age and roll no and name:");
        int age=sc.nextInt();
        int roll=sc.nextInt();
        String name=sc.nextLine();
        st[i]=new Student(age,roll,name);
        }

        System.out.println("Enter the roll no of student you want to search:");
        int search=sc.nextInt();
        int flag=0;
        for(int i=0;i<n;i++){
            if(st[i].roll==search){
                flag=1;
                System.out.println("Student is found"+st[i].name);
            }
        }
    }
}