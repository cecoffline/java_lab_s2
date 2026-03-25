import java.io.*;

public class filecopy {
    public static void main(String[] args) {
        try {
            FileInputStream fin = new FileInputStream("source.txt");
            FileOutputStream fout = new FileOutputStream("destination.txt");

            int ch;

            while ((ch = fin.read()) != -1) {
                fout.write(ch);
            }

            fin.close();
            fout.close();

            System.out.println("file copied successfully");

        } catch (IOException e) {
            System.out.println("Error occurred while copying file.");
            e.printStackTrace();
        }
    }
}
