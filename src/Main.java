import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        try(FileInputStream fin1 =new FileInputStream("getInfo1.txt");
            FileInputStream fin2 = new FileInputStream("getInfo2.txt");
            FileOutputStream fos = new FileOutputStream("output.txt"))
        {
            int i;
            while((i=fin1.read())!= -1){
                fos.write((char)(i));
            }
            System.out.println("File1 has been written");
            while ((i=fin2.read()) != -1) {
                fos.write((char)i);
            }
            System.out.println("File2 has been written");
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}