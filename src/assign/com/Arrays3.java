package assign.com; //3. Write a program to find the index of an array element

public class Arrays3 {
    public static void main(String[] args){
        int n=7;
        int k=6;
        int arr[]={3,5,6,7,2,8,9};
        for(int i=0;i<n;i++){
            if(arr[i]==k){
                System.out.println(i);
            }
        }
    }
}
