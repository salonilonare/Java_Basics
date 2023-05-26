package assign.com;//Write a function to insert an element at a specific position in the array
import java.util.Arrays;
public class Arrays7 {
    public static void main(String[] args) {

            int[] arr = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
            int Index_position = 2;
            int newValue    = 5;

            System.out.println("Original Array : "+Arrays.toString(arr));

            for(int i=arr.length-1; i > Index_position; i--){
                arr[i] = arr[i-1];
            }
            arr[Index_position] = newValue;
            System.out.println("New Array: "+Arrays.toString(arr));
        }
    }


