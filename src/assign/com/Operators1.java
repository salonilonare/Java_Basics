package assign.com; //1. Write a function for arithmetic operators(+,-,*,/)
class C{
    void sum(int a, int b){
       int  sum=a+b;
        System.out.println("sum= " +sum);
    }
    void sub(int a, int b){
        int  sub=a-b;
        System.out.println("sub= " +sub);
    }
    void multi(int a, int b){
        int  multi=a*b;
        System.out.println("multi= " +multi);
    }
    void divide(int a, int b){
        int  divide=a/b;
        System.out.println("divide= " +divide);
    }

}
public class Operators1 {
    public static void main(String[] args) {
        int a = 80, b = 20;
        C c = new C();
        c.sum(a,b);
        c.sub(a,b);
        c.multi(a,b);
        c.divide(a,b);
    }
}
