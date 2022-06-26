package org.example;

import java.util.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        List<Integer>list1= Arrays.asList(5, 12, 9, 3, 15, 88);
        List<Integer>list2= Arrays.asList(5, 12, 9, 3, 17, 88);
        Set<Integer> treeSet= new TreeSet<>();
        treeSet.addAll(list1);
        treeSet.addAll(list2);
        System.out.println(treeSet);
    }
}
