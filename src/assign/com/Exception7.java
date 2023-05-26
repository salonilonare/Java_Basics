package assign.com;//Write a program with finally block

public class Exception7 {
    public static void main(String[] args){
        int x=7;
        int y=0;
        try{
            System.out.println(x/y);
        }
        catch(ArithmeticException e){
            System.out.println("catch block..");
        }
        finally{
            System.out.println("finally block...");
    }
    }
}
