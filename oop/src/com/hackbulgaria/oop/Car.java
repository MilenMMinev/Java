package com.hackbulgaria.oop;

public class Car {
	public Object brand;

	public static void main(String[] args) {
		Car audi = new Car();
		audi.brand = "audi";
		System.out.println(audi.toString());
	}
	
	@Override
	public String toString()
	{
		return this.brand.toString() + "@" + Integer.toHexString(hashCode());
	}

}
