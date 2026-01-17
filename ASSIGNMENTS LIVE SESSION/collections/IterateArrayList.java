package com.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class IterateArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> al=new ArrayList<String>();
		
		al.add("course1");
		al.add("course2");
		al.add("course3");
		al.add("course4");
		al.add("course5");
		
		for(String course:al)
		{
			System.out.println(course);
		}

	
	}

}
