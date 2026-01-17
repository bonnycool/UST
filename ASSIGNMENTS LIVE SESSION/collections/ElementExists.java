package com.collections;

import java.util.ArrayList;

public class ElementExists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> al=new ArrayList<String>();
		al.add("banana");
		al.add("apple");
		al.add("grape");
		
		if(al.contains("apple"))
			System.out.println("Apple is present");

	}

}
