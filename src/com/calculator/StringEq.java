package com.calculator;

public class StringEq {

	public static void main(String[] args) {
		var a = "String";
		var b = "String";
		System.out.println(a == b); // не правильное сравнение
		System.out.println(a.equals(b)); // правильное сравнение строк

	}

}
