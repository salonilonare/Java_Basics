package assign.com;//11. Program to check whether a number is EVEN or ODD using switch

public class loops11 {
    public static void main(String[] args){
        int n=10;
        switch(n%2)
        {
            case 0:
                   System.out.println("number is even");
                      break;
            case 1:
                System.out.println("number is odd");
                break;
        }
    }
}
