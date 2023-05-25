package assign.com; //Write a program with multiple catch blocks

public class Exception4 {
    public static void main(String[] args){
        try{
            int array[] = new int[5];
            array[5] = 30 / 0;
        }
        catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }

    }
}

