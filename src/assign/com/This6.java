package assign.com;//Use this() and super() in methods not in constructors
class Y1{
    int x=19;
    void show(){
        System.out.println(this.x);
    }
}
public class This6 {
    public static void main(String[] args){
        Y1 y=new Y1();
        y.show();
    }
}
  //compile time error