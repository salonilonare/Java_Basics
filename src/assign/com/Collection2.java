package assign.com;//HashMap

import java.util.*;
    public class Collection2{
        public static void main(String args[]){
            HashMap<Integer,String> map=new HashMap<Integer,String>();//Creating HashMap
            map.put(1,"A");  //Put elements in Map
            map.put(2,"B");
            map.put(3,"C");
            map.put(4,"D");
            map.put(5,"E");
            map.put(6,"F");
            map.put(7,"G");
            map.put(8,"H");
            map.put(9,"I");
            map.put(10,"J");

            System.out.println("Iterating Hashmap...");
            for(Map.Entry m : map.entrySet()){
                System.out.println(m.getKey()+" "+m.getValue());
            }
            System.out.println("Clone look like this : " + map.clone());

            System.out.println(" key present : " +map.containsKey(6));

            map.remove(6);
            System.out.println("updated list : " +map);

            map.replace(3,"S");
            System.out.println("updated list : " +map);

            System.out.println("Is map empty : " + map.isEmpty());

            System.out.println("size of the map : " + map.size());

            System.out.println("contains given value : " + map.containsValue("Z"));
            System.out.println("contains given value : " + map.containsValue("H"));

        }
    }


