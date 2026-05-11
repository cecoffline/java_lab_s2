class Person{
    String name;
    int age;

    Person(String name,int age){
        this.name=name;
        this.age=age;
    }

     void displayPerson(){
        System.out.println("The name is :"+name);
        System.out.println("The age is :"+age);
        System.out.println("-------------------------------");
    }
}

class Employee extends Person{

    int emp_id;
    double salary;

    Employee(int emp_id,double salary,String name,int age){

        super(name,age);
        this.emp_id=emp_id;
        this.salary=salary;

    }


     void displayEmployee(){
        System.out.println("employee id:"+emp_id);
        System.out.println("salary :"+salary);
        System.out.println("-------------------------------");
    }
}

class Developer extends Employee{
    String language;

    Developer(String language,int emp_id,double salary,String name,int age){
        super(emp_id,salary,name,age);
        this.language=language;
    }

     void displayDeveloper(){
        System.out.println("The language is :"+language);
    }
}

public class Multiple{
    public static void main(String[]args){
        Developer d=new Developer("python",312,2000,"hashir",32);
        d.displayPerson();
        d.displayEmployee();
        d.displayDeveloper();
    }
}

