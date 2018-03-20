package edu.neu.csye6200.api;

import java.util.Arrays;
import java.util.function.Predicate;
import java.util.List;

public class PredicateExample {
	public static void main(String[] args) {
		List<Integer> ints = Arrays.asList(1,2,3,4,5,6,7,8,9);
		Predicate<Integer> over5Predicate = n->{return n>5;};
		for(Integer I:ints) {
			if(over5Predicate.test(I)) {
				System.out.println(I + "<**");
			}
			else {
				System.out.println(I+"");
			}
		}
		
	}

}
