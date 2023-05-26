package assign.com;//Write a function to reverse an array of integer values

public class Arrays9 {
    public static void main(String[] args){
        int [] arr = new int [] {11,12,13,14,15,16};
            System.out.println("given array: ");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            System.out.println("Array in reverse order: ");
            for (int i = arr.length-1; i >= 0; i--) {
                System.out.print(arr[i] + " ");
            }

        }
}
