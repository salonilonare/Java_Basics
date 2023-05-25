package assign.com;
    class T1{
        T1(){
            System.out.println("class T1");
        }
    }
    class U1 extends T1 {
        U1(){
            super();
        }
    }
    public class This5 {
        public static void main(String[] args){
            U1 u=new U1();
        }
    }

