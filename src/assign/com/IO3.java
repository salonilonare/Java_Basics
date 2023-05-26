package assign.com;//Read text from a .txt file using BufferedInputStream

import java.io.*;
    public class IO3{
        public static void main(String args[]){
            try{
                FileInputStream fin=new FileInputStream("E:\\new.txt");
                BufferedInputStream bin=new BufferedInputStream(fin);
                int i;
                while((i=bin.read())!=-1){
                    System.out.print((char)i);
                }
                bin.close();
                fin.close();
            }catch(Exception e){System.out.println(e);}
        }
    }

