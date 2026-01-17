package com.collections;
import java.util.*;
public class addAndremove {

	public static void main(String[] args) {
		
		ArrayList<Integer> alinteger=new ArrayList<Integer>();
		for(int i=0;i<5;i++)
		{
			alinteger.add(i);
		}
		
		alinteger.remove(3);
		
		System.out.println(alinteger);
		
		
		
	}
}
