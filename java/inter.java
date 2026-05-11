import java.util.Scanner;

interface student{
    void GetResult();
}

interface marks{
    void GetMarks();
}

class multi implements student,marks{
    int roll;
    String name;
    int mark1,mark2;

    Scanner sc=new Scanner(System.in);

    public void GetResult(){
        System.out.println("ENter the student roll no:");
        roll=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the student name:");
        name=sc.nextLine();
        System.out.println("Enter the mark 1:");
        mark1=sc.nextInt();
        System.out.println("Enter the mark 2:");
        mark2=sc.nextInt();
    }

    
    public void GetMarks(){
        System.out.println("---------------------------------");
        System.out.println("Name:"+name);
        System.out.println("Roll no:"+roll);
        System.out.println("Total Marks:"+(mark1+mark2));
        System.out.println("---------------------------------");
    
        }

         

}

public class inter{
    public static void main(String []args){
        multi m=new multi();
        
        m.GetResult();
        m.GetMarks();

      
    }
}