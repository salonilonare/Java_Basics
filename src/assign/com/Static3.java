package assign.com;//3. Print static variables in Instance methods
class K{
    void show(){
        //static int x=10;//error:illegal start of expression
        int x=10;
        System.out.println(x);
    }
}
public class Static3 {
    public static void main(String[] args){
    K k =new K();
    k.show();
    }
}
