package com.calculator;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);

		System.out.println("Введите год");
		var number = num.nextInt();

		switch (number % 10) {
		case 0: {
			System.out.println("Металл");
			break;
		}
		case 1: {
			System.out.println("Металл");
			break;
		}
		case 2: {
			System.out.println("Вода");
			break;
		}
		case 3: {
			System.out.println("Вода");
			break;
		}
		case 4: {
			System.out.println("Дерево");
			break;
		}
		case 5: {
			System.out.println("Дерево");
			break;
		}
		case 6: {
			System.out.println("Огонь");
			break;
		}
		case 7: {
			System.out.println("Огонь");
			break;
		}
		case 8: {
			System.out.println("Земля");
			break;
		}
		case 9: {
			System.out.println("Земля");
			break;
		}
		}

		switch (number % 12) {
		case 0: {
			System.out.println("Крыса");
			break;
		}
		case 1: {
			System.out.println("Бык");
			break;
		}
		case 2: {
			System.out.println("Тигр");
			break;
		}
		case 3: {
			System.out.println("Кролик");
			break;
		}
		case 4: {
			System.out.println("Дракон");
			break;
		}
		case 5: {
			System.out.println("Змея");
			break;
		}
		case 6: {
			System.out.println("Лошадь");
			break;
		}
		case 7: {
			System.out.println("Овца");
			break;
		}
		case 8: {
			System.out.println("Обезьяна");
			break;
		}
		case 9: {
			System.out.println("Петух");
			break;
		}
		case 10: {
			System.out.println("Собака");
			break;
		}
		default: {
			System.out.println("Свинья");
			break;
		}
		}

	}

}
