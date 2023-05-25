package assign.com;
class W1{
    W1(){
        System.out.println("hello!!!");
    }
    W1(int x){
        this();
        System.out.println(x);
    }
}
public class This3 {
    public static void main(String[] args){
    W1 w1=new W1(10);
    }
}




