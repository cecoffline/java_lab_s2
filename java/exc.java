public class exc{
    public static void main(String[]args){
        int a=2;
        int b;

        try{
            b=a/0;
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
    }
}