package com.hackbulgaria.oop;

public class Pair {
	private Object a;
	private Object b;
	
	Pair(Object _a, Object _b) {a = _a; b = _b;}
	
	
	public static void main(String[] args) {
		Pair first = new Pair (2,3);
		Pair second = new Pair (2,3);
		System.out.println(first.toString());
		System.out.println(first.equals(second));
	}
	@Override
	public String toString()
	{
		return String.format("%s, %s", a, b);
	}
	
	
	public boolean equals(Pair obj)
	{
		
		return this.a.equals(obj.a) && (this.b.equals(obj.b));
		
	}
	
}
