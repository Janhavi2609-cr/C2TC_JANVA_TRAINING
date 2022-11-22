//maps: hashmap

package com.capgemini.collection;

import java.util.HashMap;

public class Collection8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> hm = new HashMap<>();
		
		//adding values to hash map
		hm.put(10, "Shreya");
		hm.put(11, "Sharwari");
		hm.put(12, "Sarvashri");
		hm.put(13, "Janhavi");
		hm.put(14, "Vaibhav");
	//	hm.put(null, "Nayna");
		//hm.put(null, null);		//replaces the value
		hm.put(14, "Nayna");
		//hm.put(15, null);
		
		System.out.println(hm);
		
		//check the size of hash map 
		System.out.println(hm.size());
		
		//get the value using key 
		System.out.println(hm.get(14));
		
		//remove the element from map
		System.out.println(hm.remove(15));
		System.out.println(hm);
		
		System.out.println(hm.containsValue("Sarvashri"));
		System.out.println(hm.containsKey(12));
		
		System.out.println(hm.keySet());
		System.out.println(hm.values());
		
		for(int i:hm.keySet()) {
			System.out.println(i+ " "+hm.get(i));
		}
	}
	

}
