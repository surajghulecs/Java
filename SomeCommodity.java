package edu.neu.csye6200.api;

import java.util.ArrayList;
import java.util.List;

public class SomeCommodity {
	@FunctionalInterface
	public interface Show<T>{
		void show(T t);
	}
	private String name;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	private int price;
	
	public SomeCommodity(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

	public static void main(String[] args) {
		List<SomeCommodity> shoppingList = new ArrayList<>();
		shoppingList.add(new SomeCommodity("iPhone",399));
		shoppingList.add(new SomeCommodity("iPad",599));
		shoppingList.add(new SomeCommodity("macBook",1599));
		Show<SomeCommodity> showPrice = o->System.out.println(o.getName() + "only $" + o.getPrice());
		for(SomeCommodity item:shoppingList) {
			showPrice.show(item);
		}
		
		
	}

}
