package assign.com;//Write text to a .txt file using BufferedWriter

import java.io.*;
    public class IO8 {
        public static void main(String[] args) throws Exception {
            FileWriter writer = new FileWriter("E:\\new.txt");
            BufferedWriter buffer = new BufferedWriter(writer);
            buffer.write("learn with fun");
            buffer.close();
            System.out.println("Success");
        }
    }

