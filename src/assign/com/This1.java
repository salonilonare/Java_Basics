package assign.com;//Print the fields/instance members of the current class using this and without
                   // using object
class Q1{
    int x=19;
    void show(){
        System.out.println(this.x);
    }
}
public class This1 {
    public static void main(String[] args){
        Q1 q = new Q1();
        q.show();

    }
}
