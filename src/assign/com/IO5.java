package assign.com;//Write a program to read text from .txt file using FileReader

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

    public class IO5
    {
        public static void main(String[] args)
        {
            File file = new File("E:\\new.txt");

            try (FileReader fr = new FileReader(file))
            {
                int content;
                while ((content = fr.read()) != -1) {
                    System.out.print((char) content);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

