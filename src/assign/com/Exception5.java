package assign.com;// Write a program to throw exception with your own message

public class Exception5 {
        public static void validate(int age) {
            if(age<18) {
                throw new ArithmeticException("not eligible ");
            }
            else {
                System.out.println(" eligible ");
            }
        }
        public static void main(String args[]){
            validate(13);
            System.out.println("hello");
    }
}
