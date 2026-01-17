package com.collections;
import java.util.*;

public class DisplayHashSetElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<String>  hs=new HashSet<String>();
		
		hs.add("red");
		hs.add("green");
		
		hs.add("white");
		
		hs.add("black");
		
		hs.add("yellow");
		
		for(String color:hs)
		{
			System.out.println(color);
		}
		
		
	}

}
