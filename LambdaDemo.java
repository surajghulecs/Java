package edu.neu.csye6200.api;

public class LambdaDemo {
	@FunctionalInterface
	public interface GreatDivide{
		int divide(int x, int y);
	}
	
	public static void simpleLambda() {
		GreatDivide intDivide = (int x, int y)->x/y;
		System.out.println(intDivide.divide(21, 3));
	}
	public static void runnableAnonymous() {
		Runnable rAnynomous = new Runnable() {
			@Override
			public void run() {
				System.out.println("Run rAnynomous! Run");
			}
		};
		Thread t = new Thread(rAnynomous);
		t.start();
	}
	
	public static void rAnynomous() {
		Thread t = new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("Run anonymous, run!");
				
			}
			
		});
		t.start();
	}
	
	public static void runnableLambda() {
		Runnable r=()->{System.out.println("run thread in background");};
		new Thread(r).start();
	}
	
	public static void onlyThread() {
		Thread t = new Thread(()->System.out.println("Only thread with no runnable"));
		t.start();
	}
	public static void main(String[] args) {
		LambdaDemo.simpleLambda();
		LambdaDemo.runnableAnonymous();
		LambdaDemo.rAnynomous();
		LambdaDemo.runnableLambda();
		LambdaDemo.onlyThread();
	}

}
