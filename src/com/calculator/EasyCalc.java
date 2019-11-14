package com.calculator;

import java.util.Scanner;

public class EasyCalc {

	public static void main(String[] args) {
		System.out.println("Чтобы перемножить два числа введите их поочередно и нажмите клавишу Enter");

		Scanner num = new Scanner(System.in);

		System.out.println(
				"Введите операцию без кавычек, ‘+’ (сложение), ‘-’ (разность), ‘*’ (умножение), ‘/’ (деление), ‘div’ (целочисленное деление), ‘mod’ (остаток от деления), ‘^’ (возведение в степень)");
		var operation = num.next();

		System.out.println("Введите первое число");
		var fnum = num.nextInt();

		System.out.println("Введите второе число");
		var snum = num.nextInt();

		switch (operation) {
		case "+": {
			System.out.println("Если сложить число " + fnum + " с числом " + snum + " вы получите:");
			System.out.println(fnum + snum);
			break;
		}
		case "-": {
			System.out.println("Если вычесть из числа " + fnum + " число " + snum + " вы получите:");
			System.out.println(fnum - snum);
			break;
		}
		case "*": {
			System.out.println("Если умножить число " + fnum + " на число " + snum + " вы получите:");
			System.out.println(fnum * snum);
			break;
		}
		case "/": {
			System.out.println("Дробное деление числа " + fnum + " на " + snum + " будет равно:");
			System.out.println(fnum / (float) snum);
			break;
		}
		case "div": {
			System.out.println("Целочисленное деление числа " + fnum + " на " + snum + " будет равно:");
			System.out.println((int) (fnum / snum));
			break;
		}
		case "mod": {
			System.out.println("Остаток от деления числа " + fnum + " на " + snum + " будет равен:");
			System.out.println((int) (fnum % snum));
			break;
		}
		case "^": {
			var n = 1;
			for (int i = 0; i < snum; i = i + 1) {
				fnum = fnum * fnum;
			}
			System.out.println("Возведение числа " + fnum + " в степень " + snum + " равно:");
			System.out.println((int) (fnum));
			break;
		}

		}

	}
}
