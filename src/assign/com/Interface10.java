package assign.com;//Create an interface with private, public and protected fields
interface Inter12{
    void show();
    void show2();
    void show3();

}
class M1 implements Inter12{
    public void show(){

        System.out.println("show");
    }
    public  void show2(){ // private

        System.out.println("show2");
    }
    public  void show3(){  //protected
        System.out.println("show3");
    }
}
public class Interface10 {
    public static void main(String[] args){
        M1 m1=new M1();
        m1.show();
        m1.show2();
        m1.show3();
    }
}
