package assign.com;//7. Call static methods and instance methods in main method
class N{
    static void show(){
        System.out.println("static method");
    }
    void show1(){
        System.out.println("instance method");
    }
}
public class Static7 {
    public static void main(String[] args){
    N.show();
    N n =new N();
    n.show1();
    }
}
