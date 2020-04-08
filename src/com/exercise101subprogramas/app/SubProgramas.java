package com.exercise101subprogramas.app;

import java.util.Scanner;

public class SubProgramas {

	public static void main(String[] args) {
		
		int num1=0;
		int num2=0;
		int result=0;
		
		Scanner input = new Scanner(System.in);
		
		//System.out.println(); showTunnedMessage("Ale");
		System.out.println(showTunnedMessage("Ale"));
		
		showMessage();
		
		num1 = input.nextInt();
		
		showMessage();
		
		num2 = input.nextInt();
		
		
		result = AddNumbers(num1,num2);
		
		System.out.println("Result is:"+result);
	}
	//Method to ask number
	public static void  showMessage()
	{
		System.out.println("Input a number:");
	}
	//Method to show a tuned message
	public static String showTunnedMessage(String message)
	{
		return "Hola"+message;
	}
	
	//Method to add numbers
	public static int AddNumbers(int num1, int num2)
	{
		return num1+num2;
	}

}
