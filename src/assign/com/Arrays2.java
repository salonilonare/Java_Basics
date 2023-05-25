package assign.com;//2. Write a function to calculate the average value of an array of integers

public class Arrays2 {
    public static void main(String[] args){
        int[] array = { 10,2,7,9,8};
        int length = array.length;
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum =sum + array[i];
        }

        double average = sum / length;

        System.out.println("Average of array : "+average);


    }
}
