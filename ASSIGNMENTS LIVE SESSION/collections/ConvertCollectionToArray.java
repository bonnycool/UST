package com.collections;

import java.util.ArrayList;
import java.util.Arrays;

public class ConvertCollectionToArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> al=new ArrayList<String>();
		
		al.add("My");
		al.add("Name");
		al.add("is");
		//reference type=object
		//actual object=String
		Object arr[]=al.toArray();//we can only use Object arr[]
		//otherwise we need to new String[0]
		
		//need to ask gpt about this for future study today date-17/01/2026
		System.out.println(Arrays.toString(arr));
	}

}
