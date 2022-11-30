package com.capgemini.lambdaexpression;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Data{
	private String name;
	
	public Data(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	@Override
	public String toString() {
		return "Data[name=" + name + "]";
	}
}
public class LambdaExpression2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Data> list = new ArrayList<>();
		list.add(new Data("Nayna"));
		list.add(new Data("Sanavi"));
		list.add(new Data("Aaradhya"));
		list.add(new Data("Arun"));
		list.add(new Data("Sarvashri"));
		list.add(new Data("Shreya"));
		
		Collections.sort(list,(Data o1,Data o2)->{return o1.getName().compareTo(o2.getName());});
		
		for(Data data : list) {
			System.out.println(data.getName());
		}
	}

}
