//iteration example

package com.capgemini.streamapi;

import java.util.stream.Stream;

public class StreamAPI6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stream.iterate(1, element -> element+1).filter(element->element%5==0).limit(5).forEach(System.out::println);
		
		System.out.println("*****");
		Stream.iterate(1, element -> element+1).filter(element->element%5==0).limit(3).forEach(System.out::println);
	}

}

/*
 package com.capgemini.streamapidemo;

import java.util.stream.Stream;

public class IterateEx {

	public static void main(String[] args) {
		
		Stream.iterate(1, element->element+1).filter(element->element%5==0).limit(3).forEach(System.out::println);

	}

}

 * */
