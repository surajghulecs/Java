package edu.neu.csye6200.api;

import java.util.Arrays;
import java.util.List;

public class simpleStream {
	public static void main(String[] args) {
		List<Integer> l = Arrays.asList(5,2,4,1,3);
		l.forEach(n->System.out.println(n + " "));
		System.out.println("Reduce to sorted odd subset");
		l.stream().filter(n->n%2==1).sorted().map(n->100*n).forEach(n->System.out.print(n+" "));
		System.out.println();
		
	}

}
