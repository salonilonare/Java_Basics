package assign.com;//Write a function to find the duplicate values of an array

public class Arrays10 {
    public static void main(String[] args) {

        int[] arr = new int[]{4, 6, 32, 89, 4, 2, 32, 61};
        System.out.println("Duplicate elements in given array: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j])
                    System.out.println(arr[j]);
            }
        }
    }
}