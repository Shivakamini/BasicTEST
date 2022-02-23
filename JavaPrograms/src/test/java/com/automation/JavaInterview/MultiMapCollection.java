package com.automation.JavaInterview;

import static org.testng.Assert.assertEquals;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.testng.collections.MultiMap;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;

//Example: key= fruit, value = """"apple""""; key= fruit, value = """"mango"""";
//***can be achieved by using MultMap

public class MultiMapCollection {

	public static void main(String[] args) {

        String key="fruit";
        
        Multimap<String, String> map = ArrayListMultimap.create();
        map.put(key, "apple");
        map.put(key, "mango");
        map.put(key, "banana");
        
        System.out.println(map);
        System.out.println(map.size());
        
        Collection<String> coll=map.get(key);
        
	}

}
