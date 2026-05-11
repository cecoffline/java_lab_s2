import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class file{
    public static void main(String[]args){
        try{
        int i;
        FileInputStream fr=new FileInputStream("src.txt");
        FileOutputStream fw=new FileOutputStream("dest.txt");

        while((i=fr.read())!=-1)
        {
            fw.write(i);
        }
          fr.close();
        fw.close();
        
        }
        catch(IOException e){
            System.out.println(e);
        }        
        }

      
    }

