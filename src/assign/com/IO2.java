package assign.com;//Write a program to write text to .txt file using OutputStream

import java.io.FileOutputStream;
    public class IO2 {
        public static void main(String args[]){
            try{
                FileOutputStream fout=new FileOutputStream("E:\\new.txt");
                String s="how are you.";
                byte b[]=s.getBytes();
                fout.write(b);
                fout.close();
                System.out.println("success...");
            }catch(Exception e){System.out.println(e);}
        }
}
