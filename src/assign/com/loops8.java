package assign.com; //8. Write a program to find Armstrong number or not

public class loops8 {
    public static void main(String[] args){
        int n=153;
        int s=0;
        int m=n;
        int a;
        while(n!=0) {
            a = n % 10;
            s = s + (a * a * a);
            n = n / 10;
        }
        if(m==s){
            System.out.println("number is armstrong");
        }
        else {
            System.out.println("number is not armstrong");
        }
    }
}
