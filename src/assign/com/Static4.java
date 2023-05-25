package assign.com;//4. Call instance methods in static methods
class L{
    static void show(){
        L l1=new L();
        l1.show1();
    }
    void show1(){
        System.out.println("instance method");
    }
}
public class Static4 {
    public static void main(String[] args){
        L.show();
    }
}
