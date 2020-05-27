package com.ibm.JavaApp;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    
	public static int firstNum;
	public static int secondNum;
	
	
	public App(int firstNum2, int secondNum2) {
		// TODO Auto-generated constructor stub
	}


	public int getFirstNum() {
		return firstNum;
	}


	public void setFirstNum(int firstNum) {
		this.firstNum = firstNum;
	}


	public int getSecondNum() {
		return secondNum;
	}


	public void setSecondNum(int secondNum) {
		this.secondNum = secondNum;
	}

	public int addFunction(int firstNum, int secondNum) {
			return firstNum+secondNum;
	}
	
	public int subFunction(int firstNum, int secondNum) {
		return secondNum-firstNum;
	}
	
	public int mulFunction(int firstNum, int secondNum) {
		return firstNum*secondNum;
	}
	
	public static void main( String[] args )
    {
        
		
		long firstNum = Long.parseLong(args[0];
	       long secondNum = Long.parseLong(args[1];
		App app = new App(firstNum, secondNum);
      
               
        
       
        System.out.println("Sum is : "+app.addFunction(firstNum, secondNum));
        System.out.println("Difference is : "+app.subFunction(firstNum, secondNum));
        System.out.println("Product is : "+app.mulFunction(firstNum, secondNum));
        System.out.println("build is completed");
        String output = String.format("\n*** Your Calculator ***\n\nFirst: %d\nSecond: %d\n\nSum : %d\nDifference : %d\nProduct : %d\n\n", app.firstNum, app.secondNum, app.addFunction(firstNum, secondNum), app.subFunction(firstNum, secondNum), app.mulFunction(firstNum, secondNum));
	    System.out.println(output);
        
    }
}
