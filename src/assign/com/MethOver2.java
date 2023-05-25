package assign.com;
class A1{
    void show(int a,int b){
        System.out.println(a+b);
    }
    void show(double a,double b,double c){
        System.out.println(a+b+c);
    }

}
public class MethOver2 {
    public static void main(String[] args) {
        A1 a1 = new A1();
        a1.show(3, 4);
        a1.show(34, 56, 2);
    }
}
