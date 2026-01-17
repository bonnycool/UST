package com.collections;

import java.util.HashMap;

public class DisplayAllHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String,String> hm=new HashMap<String,String>();
		hm.put("+91", "India");
		hm.put("+23", "America");
		hm.put("+975", "Dubai");
		
		System.out.println(hm.keySet());
		System.out.println(hm.values());
		System.out.println(hm.entrySet());
		
		

	}

}
