package com.calculator;

import java.util.Scanner;

public class MyCalcHere {

	public static void main(String[] args) {
		System.out.println("Чтобы перемножить два числа введите их поочередно и нажмите клавишу Enter");
		
		Scanner num = new Scanner(System.in);
		
		System.out.println("Введите первое число");
		var fnum = num.nextInt();
		
		System.out.println("Введите второе число");
		var snum = num.nextInt();
		
		System.out.println("Если сложить число " + fnum + " с числом " + snum + " вы получите:");
		System.out.println(fnum + snum);
		
		System.out.println("Если вычесть из числа " + fnum + " число " + snum + " вы получите:");
		System.out.println(fnum - snum);
		
		System.out.println("Если умножить число " + fnum + " на число " + snum + " вы получите:");
		System.out.println(fnum * snum);
		
		System.out.println("Дробное деление числа " + fnum + " на " + snum + " будет равно:");
		System.out.println(fnum / (float)snum);
		
		System.out.println("Целочисленное деление числа " + fnum + " на " + snum + " будет равно:");
		System.out.println((int)(fnum / snum));
		
		System.out.println("Остаток от деления числа " + fnum + " на " + snum + " будет равен:");
		System.out.println((int)(fnum % snum));
		
	}

}