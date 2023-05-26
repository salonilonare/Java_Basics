package assign.com;//Write a method to verify if the array contains two specified elements(12,23)

public class Arrays17 {
    public static void main(String[] args) {
        int[] num = {1, 12, 23, 4, 5};
        int num1 = 12;
        int num2= 23;
        boolean found = false;

        for (int n : num) {
            if (n == num1 || n==num2) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println(num1 + " is found.");
            System.out.println(num2 + " is found.");
        }
        else {
            System.out.println(num1 + " is not found.");
            System.out.println(num2 + " is not found.");
        }
    }
}




