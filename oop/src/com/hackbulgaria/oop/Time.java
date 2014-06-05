package com.hackbulgaria.oop;

public class Time {
	public int sec, min, h, day, mon, y;

	public Time(int i, int j, int k, int l, int m, int n) {
		sec = i;
		min = j;
		h = k;
		day = l;
		mon = m;
		y = n;
	}

	public static void main(String[] args) {
		Time now = new Time(12, 24, 35, 13, 11, 1994);
		System.out.println(now.toString());
	}
	
	
	@Override
	public String toString()
	{
		return String.format("%s:%s:%s %s:%s:%s", h, min, sec, day, mon, y);
	}

}
