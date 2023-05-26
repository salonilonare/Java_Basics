package assign.com;//Write two methods with the same name but different number of parameters
                   // of same type and call the methods from main method
class Z{
    void show(int a,int b){
        System.out.println(a+b);
    }
    void show(int a,int b,int c){
        System.out.println(a+b+c);
    }

}
public class MethOver1 {
    public static void main(String[] args){
        Z z =new Z();
        z.show(3,4);
        z.show(34,56,2);
    }
}
