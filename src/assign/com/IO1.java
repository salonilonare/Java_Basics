package assign.com;// Write a program to read text from .txt file using InputStream

import java.io.FileInputStream;
    public class IO1 {
        public static void main(String args[]){
            try{
                FileInputStream fin=new FileInputStream("E:\\new.txt");
                int i=0;
                while((i=fin.read())!=-1){
                    System.out.print((char)i);
                }
                fin.close();
            }catch(Exception e){System.out.println(e);}
        }
    }

