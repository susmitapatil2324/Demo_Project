package com.velocity.collection.demo;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet hs = new HashSet();
		hs.add(20);
		hs.add(70);
		hs.add(90);
		hs.add(80);
		
		hs.forEach(e-> System.out.println(e));
	}

}
