package assign.com; //Write a program to create your own exception

class CustomException extends Exception {
    String message;
    CustomException(String str) {
        message = str;
    }
    public String toString() {
        return ("Custom Exception Occurred : " + message);
    }
}
public class Exception6 {
    public static void main(String args[]) {
        try {
            throw new CustomException("My Exception");
        } catch(CustomException e) {
            System.out.println(e);
        }
    }
}
