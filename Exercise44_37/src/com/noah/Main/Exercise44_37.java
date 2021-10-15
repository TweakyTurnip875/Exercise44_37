package com.noah.Main;

public class Exercise44_37 {
	public static String format(int number, int width) {
		String res = "";
		String numStr = Integer.toString(number);
		int newWidth = width - numStr.length();
		
		for (int i = 0; i < newWidth; i++) {
			res += 0;
		}
		
		res = res.concat(numStr);
		return res;
	}
}