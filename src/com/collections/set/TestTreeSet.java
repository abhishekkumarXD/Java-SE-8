package com.collections.set;

import java.util.TreeSet;
import java.util.Iterator;

/** TreeSet is an Ordered Set because when we use an Iterator, and we start to loop
    through the collection, they will be retrieved in an ordered fashion. */

public class TestTreeSet {
    public static void main(String[] args) {
        TreeSet tree = new TreeSet();
        tree.add(88);
        tree.add(53);
        tree.add(66);
        tree.add(12);

        Iterator iter = tree.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next() + " ");
        }
    }
}