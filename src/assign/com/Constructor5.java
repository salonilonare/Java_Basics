package assign.com; //Try to call the constructor multiple times with the same object
class Y{
    Y(){
        System.out.println("constructor");
    }
}
public class Constructor5 {
    public static void main(String[] args){
     Y y =new Y();
    // Y y = new Y(); error
    }
}
