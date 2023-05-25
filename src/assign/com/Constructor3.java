package assign.com;
class X {
     public X() {
        System.out.println("default constructor");
    }

    X(int a) {
        System.out.println("one argument constructor");
    }

    protected X(int a, int b) {
        System.out.println("two argument constructor");
    }
}

public class Constructor3 {
    public static void main(String[] args){
        X x =new X();
        X x2=new X(10);
        X x3 = new X(2,3);
    }
}
