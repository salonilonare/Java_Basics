package assign.com;//17. Write a program to generate StringIndexOutOfBoundsException

public class Exception17 {
    public static void main(String[] args) {
        String str = "Hello how are you";
        System.out.println("Length of the String: "+str.length());
        for(int i=0; i<str.length(); i++) {
            System.out.println(str.charAt(i));
        }
        System.out.println(str.charAt(20));
    }
}
