package assign.com;//5. Write a function to remove a specific element from an array
import java.util.Arrays;
public class Arrays5 {
    public static void main(String[] args){
        int[] arr = new int[]{4,6,7,3,9};
                int[] arr1 = new int[arr.length-1];
                int j=3;
                for(int i=0, k=0;i<arr.length;i++){
                    if(i!=j){
                        arr1[k]=arr[i];
                        k++;
                    }
                }
                System.out.println("Before deletion :" + Arrays.toString(arr));
                System.out.println("After deletion :" + Arrays.toString(arr1));

            }
        }

