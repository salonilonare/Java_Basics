package assign.com;//Write a method which throws exception

public class Exception3 {
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


