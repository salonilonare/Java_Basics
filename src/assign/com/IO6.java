package assign.com;//Write a program to write text to .txt file using FileWriter

import java.io.FileWriter;
    public class IO6 {
        public static void main(String args[]){
            try{
                FileWriter fw=new FileWriter("E:\\new.txt");
                fw.write("hello friends");
                fw.close();
            }catch(Exception e){System.out.println(e);}
            System.out.println("Success...");
        }
    }

