package assign.com;
 interface Inter10{  //public
    int x=10;
}
class K1 implements Inter10{
    public void show1(){
        System.out.println("x= " +x);
    }
}
public class Interface8 {
    public static void main(String[] args){
        K1 k1=new K1();
        k1.show1();
    }
}
