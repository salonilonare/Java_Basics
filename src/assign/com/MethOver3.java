package assign.com;//Write two methods with the same name and same number of parameters of
                   // same type and call from main method
class B1{
    void show(int a,int b){
        System.out.println(a+b);
    }
  //  void show(int a, int b){
    //    System.out.println(a+b);//error
    //}

}
public class MethOver3 {
    public static void main(String[] args) {
        B1 b1 = new B1();
        b1.show(3, 4);
      //  b1.show(5,6);
    }
}
