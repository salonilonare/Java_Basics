package assign.com;//HashSet

import java.util.*;
public class Collection3{
    public static void main(String args[]){
        //Creating HashSet and adding elements
        HashSet<String> set=new HashSet();
        set.add("A");
        set.add("B");
        set.add("C");
        set.add("D");
        set.add("E");
        set.add("F");
        set.add("G");
        set.add("H");
        set.add("B");//ignoring duplicates
        set.add("I");
        set.add("J");


        Iterator<String> i=set.iterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        }

        System.out.println("set contains given value: " +set.contains("D"));

        set.remove("F");
        set.remove("E");
        System.out.println("set after removing values: " +set);

        System.out.println("is the set empty or not :" +set.isEmpty());

        System.out.println("size of the set:" + set.size());

        HashSet clone_set= new HashSet();
        clone_set = (HashSet)set.clone();
        System.out.println("clone of the set : " + clone_set);
    }
}

