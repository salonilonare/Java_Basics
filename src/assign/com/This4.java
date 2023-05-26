package assign.com;//Call argument constructor of current class using this()

    class X1{
        X1(int a){
            System.out.println("hello!!!");
        }
        X1(int a,int b){
            this(a);
           // System.out.println(a+b);
        }
    }
    public class This4 {
        public static void main(String[] args){
            X1 x1=new X1(10,20);
        }
    }

