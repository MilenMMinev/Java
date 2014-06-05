package com.hackbulgaria.oop;

public class StackImpl implements Stack {
	
	private Object[] stack;
	
	public static void main(String[] args) {
		StackImpl s1;
		s1 = new StackImpl(1,2);
		Object test = s1.getStack();
		System.out.println(test);
	}
	
	
	public StackImpl(Object... elements)
	{
		stack = elements;
	}


	@Override
	public void push(Object element) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void pop(Object element) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public int length(Object stack) {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public boolean clear(Object stack) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public boolean isEmpty(Object stack) {
		// TODO Auto-generated method stub
		return false;
	}

	public Object getStack()
	{
		return this.stack;
	}
}
