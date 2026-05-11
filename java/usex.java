import java.util.Scanner;
class UnderAgeException extends Exception{
    UnderAgeException(String msg){
        super(msg);
    }
}
public class usex{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        try{
            if(age<18){
                throw new UnderAgeException("under age");
            }
            else{
                System.out.println("Not Undr age");
            }
        }
        catch(UnderAgeException e){
            System.out.println(e);
        }

        sc.close();
    }
}