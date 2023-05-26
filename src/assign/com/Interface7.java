package assign.com;//Create an interface and inherit it from the other interface.
interface Inter8{
    void show1();
}
interface Inter9 extends Inter8{
    void show2();
}
class H1 implements Inter9
{
    public void show1(){
        System.out.println("show1");
    }
    public void show2(){
        System.out.println("show2");
    }
}
public class Interface7 {
    public static void main(String[] args){
        H1 h=new H1();
        h.show1();
        h.show2();
    }
}
