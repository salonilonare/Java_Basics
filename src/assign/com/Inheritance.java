package assign.com;//Inheritance
class E{
void Es(){
    System.out.println("class Es");
}
    void Ess(){
        System.out.println("class Ess");
    }
    void show(){
    System.out.println("overriden method E");
    }
}
class F extends E{
    void Fs(){
        System.out.println("class Fs");
    }
    void Fss(){
        System.out.println("class Fss");
    }
    void show(){
        System.out.println("overriden method F");
    }
}
class G extends F{
    void Gs(){
        System.out.println("class Gs");
    }
    void Gss(){
        System.out.println("class Gss");
    }
    void show(){
        System.out.println("overriden method G");
    }
}

public class Inheritance {
    public static void main(String[] args){
     E e =new E();
     F f =new F();
     G g =new G();
     e.Es();
     e.Ess();
     f.Fs();
     f.Fss();
     g.Gs();
     g.Gss();
     f.show();
     g.show();
    }
}
