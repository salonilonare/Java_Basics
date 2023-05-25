package assign.com;//6. Print all the static, instance variables in main method
class O{
    int x=10;
    void show(){
        O o=new O();
        System.out.println(o.x);
    }
}
public class Static6 {
    static int y=90;
    public static void main(String[] args){
    O o1 = new O();
    o1.show();
    System.out.println(y);
    }
}
