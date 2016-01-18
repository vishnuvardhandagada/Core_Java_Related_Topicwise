//Sorting based on the values

package com.core.java.Collections;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortingMap {

    public static void main(String[] args) {

        HashMap<String,Double> map = new HashMap<String,Double>();
        ValueComparator bvc =  new ValueComparator(map);
        TreeMap<String,Double> sorted_map = new TreeMap<String,Double>(bvc);

        map.put("A",99.5);
        map.put("G",67.4);
        map.put("F",67.4);
        map.put("D",67.3);
        map.put("E",67.1);
        map.put("B",67.6);

        System.out.println("unsorted map: "+map);

        sorted_map.putAll(map);

        System.out.println("results: "+sorted_map);
    }
}

class ValueComparator implements Comparator<String> {

    Map<String, Double> base;
    public ValueComparator(Map<String, Double> base) {
        this.base = base;
    }

    // Note: this comparator imposes orderings that are inconsistent with equals.    
    public int compare(String a, String b) {
        if (base.get(a) >= base.get(b)) {
            return -1;
        } else {
            return 1;
        } // returning 0 would merge keys
    }
}



