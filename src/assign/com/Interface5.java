package assign.com;//Create two interfaces with the same method (same signature) in both the
                   // interfaces.Implement these two interfaces in one class. Call the method.
interface Inter5{
    void show1();
}
interface Inter6{
    void show1();
}
class I1 implements Inter5 ,Inter6{
    public void show1(){
        System.out.println("show1");
    }
}
public class Interface5 {
    public static void main(String[] args){
        I1 i=new I1();
        i.show1();
    }

}
