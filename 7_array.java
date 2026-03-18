import java.util.Scanner;

public class 7_array{
	
public static void main(String [] args)
	{

	Scanner sc =new Scanner(System.in);
	System.out.println("ENter number of subjects:");
	int n=sc.nextInt();
	int total=0;
	for(int i=0;i<n;i++){
	System.out.println("Enter marks for subject"+(i+1)+":");
	marks[i]=sc.nextInt();
	total+=marks[i];
	double percentage=(double)total/n;
	System.out.println("Total mark="+total);
	System.out.println("Percentage"+percentage);

	}
	}

}
