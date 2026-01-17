package com.collections;

import java.util.ArrayList;

public class ClearElementsFromCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> al=new ArrayList<Integer>();
		
		al.add(1);
		al.add(1);
		al.add(1);
		al.add(1);
		System.out.println(al);
		
		al.clear();//it will clear the arrayList collection
		System.out.println(al.isEmpty());

	}

}
