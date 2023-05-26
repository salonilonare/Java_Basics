package assign.com;//. Write a method to find number of even number and odd numbers in an array

public class Arrays15 {
    public static void main (String[] args){
        int[] arr = new int[]{4, 6, 7, 3, 9,8,55};
        int i;
        int m=0;
        int n=0;
        for(i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                m++;
            }
            else{
                n++;
            }
        }
        System.out.println("number of even values= "+m);
        System.out.println("number of odd values= "+n);

    }
}
