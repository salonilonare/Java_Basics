package assign.com;//Create a PRIVATE or PROTECTED interface and print the value
interface Inter11{ //private and protected not allowed here
    int x=34;
}
class L1 implements Inter11{
    public void show(){
        System.out.println("x= "+x);
    }
}
public class Interface9 {
    public static void main(String[] args){
        L1 l1=new L1();
        l1.show();
    }
}
