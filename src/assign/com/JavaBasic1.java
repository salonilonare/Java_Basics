package assign.com;//1. How to create a class, object, method and its signature
class D{ //class
    int x=10;
    void show(){ //method
        System.out.println("class A");
    }
}
public class JavaBasic1 {
    public static void main(String[] args){
        D d =new D(); // creating class object
        System.out.println(d.x);
        d.show();
    }
}

