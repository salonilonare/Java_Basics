package assign.com;  //equalsIgnoreCase(), startsWith(), endsWith() and compareTo()

public class String8 {
    public static void main(String[] args){
        String s1= "ram";
        String s2= "Ram";
        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println(s1.startsWith("r"));
        System.out.println(s2.endsWith("m"));
        System.out.println(s1.compareTo(s2));
    }
}
