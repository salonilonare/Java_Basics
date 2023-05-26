package assign.com;//Create two interfaces with one method each. Implement these two interfaces
                   // in one class.
interface Inter3{
    void show1();
}
interface Inter4{
    void show2();
}
class G1 implements Inter3, Inter4{
    public void show1(){
        System.out.println("show1");
    }
    public void show2(){
        System.out.println("show2");
    }
}
public class Interface4 {
    public static void main(String[] args){
        G1 g1=new G1();
        g1.show1();
        g1.show2();
    }
}
