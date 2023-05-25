package assign.com;
class C1 {
    void show(int a, int b) {
        System.out.println(a + b);
    }

    void show(double a, double b) {
        System.out.println(a + b);
    }
}


    public class MethOver4 {
        public static void main(String[] args) {
            C1 c1 = new C1();
            c1.show(3, 4);
            c1.show(5,9);
    }
}
