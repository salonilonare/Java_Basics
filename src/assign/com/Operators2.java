package assign.com;  //2. Write a method for increment and decrement operators(++, --)
class A{
    void  increment(){
        int x=4;
        int y;
        y=x-- + ++x + x++ + --x;
        System.out.println("x= " +x);
        System.out.println("y= " +y);
    }

}

public class Operators2 {
    public static void main(String[] args){
        A a =new A();
        a.increment();

    }
}
