package assign.com; //Write a program to generate IOException
import java.io.*;
public class Exception12 {
    public static void main(String[] args) throws Exception{
        File FileName = new File("java.txt");
        FileInputStream FIS=new FileInputStream(FileName);
        System.out.println(FIS.read());

    }
}
