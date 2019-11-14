package com.calculator;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		
		System.out.println("Введите число от 0 до 10 включительно");
		var number = num.nextInt();
		
		switch (number) {
		case 0: {
			System.out.println("Вы ввели ноль");
			break;
		}
		case 1: {
			System.out.println("Вы ввели единицу");
			break;
		}
		default: {
			System.out.println("Вы ввели непонятное число");
			break;
		}
		}
		
		if ( number < 0 ) {
			System.out.println("Вы ввели отрицательное число");
		} else if ( number >= 0 && number <= 10 ){
			System.out.println(number*2);
		} else if (number > 10 && number < 100) {
			System.out.println("Вы ввели большое число");
		} else {
			System.out.println("Вы ввели очень большое число");
		}

	}

}