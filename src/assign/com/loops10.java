package assign.com;  //10. Write a program to palindrome or not

public class loops10 {
    public static void main(String[] args){
        int n=454;
        int s=0;
        int m=n;
        int a;
        while(n!=0){
            a=n%10;
            s=s*10+a;
            n=n/10;
        }
        if(m==s) System.out.println("number is palindrome");
        else System.out.println("number is not palindrome");
    }
}
