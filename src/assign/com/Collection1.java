package assign.com;//ArrayList

import java.util.*;
    public class Collection1 {
        public static void main(String[] args) {
            ArrayList<String> list = new ArrayList<String>();//Creating arraylist
            list.add("A");//Adding object in arraylist
            list.add("B");
            list.add("C");
            list.add("D");
            list.add("E");
            list.add("F");
            list.add("G");
            list.add("H");
            list.add("I");
            list.add("J");
            System.out.println(list);

          //  Iterator itr = list.iterator();
            // while (itr.hasNext()) {
              //  System.out.println(itr.next());

                System.out.println("Returning element: "+list.get(1));
                list.set(1,"K");
                for(String alpha:list)
                    System.out.println(alpha);

                list.remove("D");
            System.out.println(list);

            System.out.println("size of the ArrayList: " +list.size());

            //list.clear(); System.out.println("After removing all elements: " +list);

            boolean ans = list.contains("E");
            if (ans)  System.out.println("true");
            else  System.out.println("false");

            int pos =list.indexOf("H");
            System.out.println("\n index : " + pos);
        }
        }


