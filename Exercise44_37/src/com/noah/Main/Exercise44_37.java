/*
	author: Noah Smith
	date: 8/19/21
	
	This program uses a method to format an integer with the specified width (e.g format(56, 4) returns 000056). 
*/

package com.noah.Main;

import java.util.Scanner;

public class Exercise44_37 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Input a number and a width to format:");
		
		int number = input.nextInt();
		int width = input.nextInt();
		
		System.out.println(format(number, width));
	}
	
	public static String format(int number, int width) {
		String res = "";
		String numStr = Integer.toString(number), widthStr = Integer.toString(width);
		int newWidth = width - numStr.length();
		
		for (int i = 0; i < newWidth; i++) {
			res += 0;
		}
		
		res = res.concat(numStr);
		return res;
	}
}