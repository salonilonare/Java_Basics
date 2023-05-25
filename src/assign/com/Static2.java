package assign.com;  //2. Print instance variables in static methods
class J{
    static void show(){
        int x=10;
        System.out.println(x);
    }
}
public class Static2 {
    public static void main(String[] args){
        J.show();
    }
}
