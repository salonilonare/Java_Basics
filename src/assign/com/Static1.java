package assign.com;//1. Write a class with 2 static variables, 2 Instance variables, 2 static methods,
                   // 2 instance methods and a main method.
class H {
                       static void show() {
                           System.out.println("static method 1");
                       }

                       static void show2() {
                           System.out.println("static method 2");
                       }


    void instan(){
        System.out.println("instance method 1");
    }
    void instan2(){
        System.out.println("instance method 2");
                       }
                   }
public class Static1 {
    static int x=10;
    static int y=29;


    public static void main(String[] args){
        H h =new H();
        H.show();
        H.show2();
        h.instan();
        h.instan2();
        System.out.println(x);
        System.out.println(y);



    }
}
