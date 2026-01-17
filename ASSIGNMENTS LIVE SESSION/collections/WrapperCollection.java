package com.collections;

import java.util.ArrayList;

public class WrapperCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList al=new ArrayList();
		al.add(1);
		
		System.out.println(al);
		
		al.add("hello");
		System.out.println(al);
		//not recommenend
		
		ArrayList<Integer> ai=new ArrayList<Integer>();//inside the wrapper class
		
		ai.add(1);
		ai.add(2);
		System.out.println(ai);

	}

}
