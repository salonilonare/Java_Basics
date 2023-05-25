package assign.com;
interface Inter13{
      static final  int x=19;
}
class P1 implements Inter13{
    public void show(){
        System.out.println("x=" +x);
    }
}
public class Interface11 {
    public static void main(String[] args){
        P1 p=new P1();
        p.show();
    }
}
