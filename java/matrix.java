import java.util.Scanner;

public class matrix{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
         System.out.println("Enter the no of r and c:");
         int ro=sc.nextInt();
        int a[][]=new int[ro][ro];
        int b[][]=new int[ro][ro]
         System.out.println("Enter the elements of first matrix:");
         for(int i=0;i<ro;i++){
            for(int j=0;j<ro;j++){
                 a[i][j]=sc.nextInt();
            }
         }

         System.out.println("Enter the elements of second matrix:");
         for(int i=0;i<ro;i++){
            for(int j=0;j<ro;j++){
                 b[i][j]=sc.nextInt();
            }
         }

         int add[][]=new int[ro][ro];

        
         for(int i=0;i<ro;i++){
            for(int j=0;j<ro;j++){
                add= a[i][j]+b[i][j];
            }
         }

         System.out.println("The sum is ");
         for(int i=0;i<ro;i++){
            for(int j=0;j<ro;j++){
               System.out.println(add[i][j]+ " ");
            }
         }

         sc.close();
    }
}