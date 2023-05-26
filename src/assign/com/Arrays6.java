package assign.com;//Write a function to copy an array to another array

public class Arrays6 {
    public static void main(String[] args){
        int x[]={13,23,45,56,76};
        int y[]=new int[5];
        y=x;
        System.out.println("array of y => ");
        for(int i : y){
            System.out.printf(i + " ");
        }
    }
}
