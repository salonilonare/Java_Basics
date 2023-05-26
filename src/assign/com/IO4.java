package assign.com;//Write text to a .txt file using BufferedOutputStream

import java.io.*;
    public class IO4{
        public static void main(String args[])throws Exception{
            FileOutputStream fout=new FileOutputStream("E:\\new.txt");
            BufferedOutputStream bout=new BufferedOutputStream(fout);
            String s="welcome to home page";
            byte b[]=s.getBytes();
            bout.write(b);
            bout.flush();
            bout.close();
            fout.close();
            System.out.println("success");
        }
    }
