package assign.com;
class R1{
R1(){
    System.out.println("class R1");
}
}
class S1 extends R1{
    S1(){
        super();
    }
}
public class This2 {
    public static void main(String[] args){
        S1 s=new S1();
    }
}
