package assign.com;//Write a function to find the minimum and maximum value of an array

public class Arrays8 {
    public static void main(String[] args){
        int x[]={14,67,32,56,89,7};
        int i;
        int j;
        int max=x[0];
        int min=x[0];
        for(i=1;i<6;i++){
            if(max<x[i]){
                max=x[i];
            }
        }
        for(j=1;j<6;j++){
            if(min>x[j]){
                min=x[j];
            }
        }
        System.out.println("max= " +max);
        System.out.println("min= "+min);
    }
}
