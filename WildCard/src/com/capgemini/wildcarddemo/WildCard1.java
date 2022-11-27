package com.capgemini.wildcarddemo;

import java.util.ArrayList;
import java.util.List;

class Maruti{
	private int vehicle;
	
	public Maruti(int vehicle) {
		this.vehicle = vehicle;
	}
	
	public int getVehicle() {
		return vehicle;
	}
	
	@Override
	public String toString() {
		return "Maruti [vehicles=" + vehicle + "]";
	}
}

class Dezire extends Maruti{
	
	private String CarModel;
	
	public Dezire(int vehicle, String carModel) {
		super(vehicle);
		// TODO Auto-generated constructor stub
		CarModel = carModel;
	}
	
}
public class WildCard1 {
	
	void disp1(List<Maruti> list) {
		for(Maruti i : list) {
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Maruti> list = new ArrayList<>();
		list.add(new Maruti(1));
		list.add(new Maruti(2));
		list.add(new Maruti(3));
		list.add(new Maruti(4));
		
		list.add(new Dezire(5, "Alto"));
		list.add(new Dezire(1, "Celerio"));
		
		System.out.println(list);
	}

}
