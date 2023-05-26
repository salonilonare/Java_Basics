package assign.com;//Write a method to find the second largest number in an array

public class Arrays13 {
    public static void main (String[] args){
        int x[]={34,56,213,678,4,8,22};
        int i;
        int m=x[0];
        int n=x[0];
        for(i=0;i<5;i++){
            if(x[i]>m){
                n=m;
                m=x[i];
            }
            else if(x[i]>n || m==n){
                n=x[i];
            }
        }
        System.out.println(n);
    }
}
