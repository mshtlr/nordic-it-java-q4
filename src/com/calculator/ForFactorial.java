package com.calculator;

import java.util.Scanner;

public class ForFactorial {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		System.out.println("Введите число от которого будем считать факториал");
		var input = inp.nextInt();
		var fact = 1;

		if (input == 0) {
			fact = 1;
		} else if (input > 12) {
			System.out.println("Вы ввели число больше 12");
		} else {
			for (var i = 1; i < input; i += 1) {
				fact = fact * i;
			}

		}

		System.out.println("Факториал числа " + input + " равен " + fact);
	}

}
