package com.velocity.collection.demo;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
	//Creating ArrayList
	ArrayList arraylist = new ArrayList();
	arraylist.add("Ram");
	arraylist.add("Shyam");
	arraylist.add("Gopal");
	arraylist.add("Arjun");
	
	System.out.println("ArrayList contains :" +arraylist);
	
	Iterator itr = arraylist.iterator();
	
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	
	}

}
