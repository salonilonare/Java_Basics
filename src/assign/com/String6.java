package assign.com;   //Matching a String Against a Regular Expression With matches()

public class String6 {
    public static void main(String[] args){

                String Str = new String("Welcome to world");
                System.out.print(
                        "Does String contains regex (.*)world(.*) ? : ");
                System.out.println(Str.matches("(.*)world(.*)"));
                System.out.print(
                        "Does String contains regex world ? : ");

                // Testing if regex is present or not
                System.out.println(Str.matches("world"));
            }
        }

