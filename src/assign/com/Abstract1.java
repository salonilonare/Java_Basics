package assign.com;  //Create an abstract class with abstract and non-abstract methods.
abstract class S{
    abstract void show();
}
class T extends S{
    void show(){
        System.out.println("class T");
    }
}
public class Abstract1 {
    public static void main(String[] args){
        T t =new T();
        t.show();

    }
}
