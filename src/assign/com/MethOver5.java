package assign.com;
class D1 {
    void show(int a, int b) {
        System.out.println(a + b);
    }

    int show(double a, double b) {
        System.out.println(a + b);
        return 0;
    }
}
public class MethOver5 {
    public static void main(String[] args) {
        D1 d1 = new D1();
        d1.show(3, 4);
        d1.show(5,9);
    }
}
