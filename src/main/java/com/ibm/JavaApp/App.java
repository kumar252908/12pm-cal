package com.ibm.JavaApp;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {

	public long first;
	public long second;
	
	public Calculator(long first, long second){
		this.first = first;
		this.second=second;
	}
	
	public long getFirst() {
		return first;
	}

	public long getSecond() {
		return second;
	}

	public long addFucn(long first, long second){
		
		return first+second;
	}
	
	public long subFucn(long first, long second){
		
		return second-first;
	}
	
	public long mulFucn(long first, long second){
		
		return first*second;
	}
	
	
	public static void main(String[] args) {

		long first = Long.parseLong(args[0]);
		long second = Long.parseLong(args[1]);
		
		App ap = new App(first, second);
		
		String output = String.format("\n*** Your Results ***\n\nFirst: %d\nSecond: %d\n\nSum : %d\nDifference : %d\nProduct : %d\n\n", ap.first, ap.second, ap.addFucn(first, second), ap.subFucn(first, second), ap.mulFucn(first, second));
	    System.out.println("CALCULATOR DISPLAY");
	    System.out.println(output);
	}
	
}
