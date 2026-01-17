package com.collections;

import java.util.HashMap;

public class KeyValuePair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		
		hm.put(1, "BONNY");
		hm.put(2, "hello");
		hm.put(2, "Akash");//the old value will be replaced
		
		System.out.println(hm);
		
		System.out.println(hm.get(1));
		System.out.println(hm.get(2));

	}

}
