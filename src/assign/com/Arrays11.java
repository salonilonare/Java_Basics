package assign.com;//Write a program to find the common values between two arrays

public class Arrays11 {
    public static void main(String[] args) {
        int[] arr = new int[]{4, 6, 7, 3, 9};
        int[] arr1=new int[]{45,6,1,9,2};
        int i;
        int j;
        for(i=0;i<arr.length;i++){
            for(j=0;j<arr1.length;j++){
                if(arr[i]==arr1[j]){
                    System.out.println(arr[i]);
                }
            }
        }

    }
}
