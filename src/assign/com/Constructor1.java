package assign.com;
class U{
    U(){
       System.out.println("default constructor") ;
    }
    U(int x){
        System.out.println("one argument constructor");
    }
    U(int x,int y){
        System.out.println("two argument constructor");
    }
}
public class Constructor1 {
    public static void main(String[] args){
        U u =new U();
        U u2=new U(10);
        U u3 = new U(2,3);
    }
}
