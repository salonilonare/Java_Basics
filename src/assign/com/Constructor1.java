package assign.com;//Write a class with a default constructor, one argument constructor and two
                   // argument constructors. Instantiate the class to call all the constructors
                   // of that class from a main class
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
