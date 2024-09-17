package com.in28minutes.microservices.currencyconversionservice;

import java.util.LinkedList;
import java.util.List;

public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		List<String> myList = new LinkedList<>();
		myList.add("aa");
		myList.add("bb");
		myList.add("cc");
		myList.add("dd");
		myList.remove((myList.size()-1)-2);

		System.out.println(myList);
		
	}

}
