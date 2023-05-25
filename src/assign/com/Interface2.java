package assign.com;
interface Inter2{
    void show();
 //  void show2(); error
}
    class F1 implements Inter2 {
        public void show(){
            System.out.println("class F1");
        }
    }
    public class Interface2{
        public static void main(String[] args){
            F1 f1=new F1();
            f1.show();
        }
    }

