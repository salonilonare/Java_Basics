package assign.com;
interface Inter7{
    void show1();
}
class J1 implements Inter7{
         public void show1(){//
             System.out.println("show1");//
         }//
}
public class Interface6 {
    public static void main(String[] args){
        J1 j=new J1();
        j.show1();  //error
    }
}
