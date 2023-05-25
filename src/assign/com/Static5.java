package assign.com;//5. Call static methods in instance methods
class M{
    void show(){
        M.show1();
    }
    static void show1(){
        System.out.println("static method");
    }
}
public class Static5 {
    public static void main(String[] args){
        M m=new M();
        m.show();
    }
}
