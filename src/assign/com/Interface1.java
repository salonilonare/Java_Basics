package assign.com;
interface Inter1{
    void show();
}
class E1 implements Inter1{
    public void show(){
        System.out.println("class E1");
    }
}
public class Interface1 {
    public static void main(String[] args){
        E1 e1=new E1();
        e1.show();
    }
}
