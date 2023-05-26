package assign.com;//Write a function to find the missing number of sorted array of 1 to 100

public class Arrays19 {
    static int ar[] = {3, 5, 8,23, 44};

    public static void main(String[] args) {
        displayMissing();
    }
    static public void displayMissing() {

        System.out.print("given array(already sorted): ");
        for (int j = 0; j < ar.length; j++)
            System.out.print(ar[j] + " ");

        System.out.print("\nNumbers missing between 1 to 100 in array :  ");

        int j = 0;
        for (int i = 1; i <= 100; i++) {
            if (j < ar.length && i == ar[j])
                j++;
            else
                System.out.print(i + " ");

        }


    }
}
