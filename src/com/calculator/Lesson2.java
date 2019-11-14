package com.calculator;

import java.util.Scanner;

public class Lesson2 {

	public static void main(String[] args) {
		var input  = new Scanner(System.in);
		
		var a = input.nextShort();
		var b = input.nextShort();
		
		System.out.println((short)(a + b));
		
		System.out.println((int)(a + b));
	}
}