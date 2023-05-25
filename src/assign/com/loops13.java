package assign.com;//13. Program for multiple if else statement(Largest number in 10,20 and 30)

public class loops13 {
    public static void main(String[] args){
        int x=10;
        int y=20;
        int z=30;
        if(x>y && x>z) System.out.println("x is larger");
        else if(y>x && y>z)System.out.println("y is larger");
        else if(z>x && z>y)System.out.println("z is larger");
    }
}
