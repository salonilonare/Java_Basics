package assign.com;  //Handle the Arithmetic exception using try-catch block

public class Exception2 {
    public static void main(String[] args){
int x=7;
int y=0;
try{
    System.out.println(x/y);
}
catch(ArithmeticException e){
    System.out.println("catch block..");
}
        System.out.println("hello");
    }
}
