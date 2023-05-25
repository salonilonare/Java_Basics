package assign.com;//9. Write a program to find the prime or not.

public class loops9 {
    public static void main(String[] args){
        int n=23;
        int j;
        int m=0;
        for(j=2;j<n;j++){
            if(n%j==0){
                m=1;
            }
        }
        if(m==0) System.out.println("number is prime");

        else System.out.println("number is not prime");
    }
}
