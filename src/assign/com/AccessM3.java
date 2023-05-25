package assign.com;
 class Q{
     protected void display()
     {
         System.out.println("saloni");
     }

 }
public class AccessM3 extends Q{
    public static void main(String[] args){
        AccessM3 m = new AccessM3();
        m.display();
    }
}
