package assign.com;//Write a function to get the difference of largest and smallest value

public class Arrays16 {
    public static void main (String[] args){
        int x[]={77,67,32,56,100,7};
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
        System.out.println("result= " + (max-min));

    }
}
