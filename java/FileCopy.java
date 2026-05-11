import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy{
    public static void main(String[]args){
        try{
            FileInputStream fi=new FileInputStream("src.txt");
            FileOutputStream fo=new FileOutputStream("dest.txt");
            int i;
            while ((i=fi.read())!=-1){
                fo.write(i);
            }
            fi.close();
            fo.close();
            System.out.println("File copy successful");
        }

        catch(IOException e){
            System.out.println(e);
        }
    }
}