package edu.neu.csye6200.api;

import java.util.Arrays;
import java.util.List;

public class DiscountStream {
	public static void main(String[] args) {
		final List<Double> prices = Arrays.asList(5.0, 10.0, 15.0, 20.0);
		double totalOfDiscountPrices = 0.0;
		for(double price:prices) {
			totalOfDiscountPrices+=price*0.9;
		}
		System.out.println("Total:$" + totalOfDiscountPrices);
		
		final double total=prices.stream().mapToDouble((Double price)->price*0.9).sum();
		System.out.println("Total:$" + total);
	}

}
