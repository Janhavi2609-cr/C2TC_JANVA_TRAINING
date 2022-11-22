package com.capgemini.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Collection7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//LinkedHashSet<Integer> num = new LinkedHashSet<Integer>();
		TreeSet<Integer> num = new TreeSet<Integer>();
		
		for(int i = 30; i>0; i--) {
			
			//adding number to hash set
			num.add(i);
			//System.out.println(i);
		}
		for(int i:num) {
			System.out.println(i);
		}
		
	}

}
