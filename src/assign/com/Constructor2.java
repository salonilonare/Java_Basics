package assign.com;//Call the constructors(both default and argument constructors) of super
                   // class from a child class
class V {
    V() {
        System.out.println("default constructor");
    }

    V(int x) {
        System.out.println("one argument constructor");
    }
}
class W extends V{

    V v2=new V(11);
}
public class Constructor2 {
    public static void main(String[] args){
     W w = new W();
    }
}
