package com.calculator;

import java.util.Random;
import java.util.Scanner;

public class RandomGame {

	public static void main(String[] args) {

		Scanner inp = new Scanner(System.in);

		var rand = new Random();
		var number = rand.nextInt(10); // 10 не входит в рандомный диапазон

		System.out.println("Введите число от 0 до 9 включительно");
		var input = inp.nextInt();

		var count = 1;

		while (number != input) {
			if (number > input) {
				System.out.println("Ваше число меньше заданного");
			} else {
				System.out.println("Ваше число меньше больше заданного");
			}

			System.out.println("Введите число от 0 до 9 включительно");
			input = inp.nextInt();

			count += 1;
		}

		System.out.println("Вы угадали с " + count + " раза");
	}

}
