class Over{

    public void sum(int a,int b){
        int c=a+b;
        System.out.println("Sum of two numbers: "+c);
    }

    public void sum(int a,int b,int c){
         c=a+b+c;
        System.out.println("The sum of three numbers are:"+c);
    }

}

public class overload{
    public static void main(String[]args){
        Over i=new Over();
        i.sum(1,2);
    }
}

