package com.collections;

import java.util.*;
public class StoreAndDisplay {
	public static void main(String args[])
	{
		ArrayList<String> al=new ArrayList<String>();
		al.add("akash");
		al.add("Bonny");
		al.add("Alwin");
		al.add("Shiva");
		al.add("Leon");
		
//		System.out.println(al);
//		for(String name:al)
//		{
//			System.out.println(name);
//		}
		
		for(int i=0;i<5;i++) {
		System.out.println(al.get(i));
		}
		
		
	}

}
