package edu.neu.csye6200.api;

import java.util.Arrays;
import java.util.List;

public class LambdaString {
	static void showList(String title, List<String> l) {
		System.out.println(l.size() +" "+ title);
		for(String s:l) {
			System.out.print(s + ",");
		}
		System.out.println();
	}
	
	static <E>void showList1(String title, List<E> l){
		System.out.println(l.size() +" "+ title);
		int i=1;
		for(E n:l) {
			System.out.print(i + ". [" + n + "] ");
			i++;
		}
		System.out.println();
		
	}
	public static void main(String[] args) {
		List<String> list= Arrays.asList("Suraj", "Sandhya");
		List<Integer> list1 = Arrays.asList(32,44,88,10);
		LambdaString.showList("LIST", list);
		LambdaString.showList1("Integers", list1);
		
	}

}
