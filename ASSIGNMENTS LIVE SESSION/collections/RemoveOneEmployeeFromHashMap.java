package com.collections;

import java.util.HashMap;

public class RemoveOneEmployeeFromHashMap {
	public static void main(String[] args) {

		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		
		hm.put(1, "BONNY");
		hm.put(2, "alan");
		hm.put(3, "Akash");
		
		hm.remove(3);
		System.out.println(hm);
		
	}

}
