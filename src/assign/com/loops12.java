package assign.com;//12. Print gender (Male/Female) program according to given M/F using switch
import java.util.*;
public class loops12 {
    public static void main(String[] args){

                Scanner s=new Scanner(System.in);
                System.out.println("Enter m or f");
                char c=s.next().charAt(0);


                switch(c){
                    case 'm':
                    case 'M':
                        System.out.println("Gender is male");
                        break;
                    case 'f':
                    case 'F':
                        System.out.println("Gender is female");
                        break;
                    default:
                        System.out.println("invalid case");
                        break;
                }
                s.close();

            }

        }

