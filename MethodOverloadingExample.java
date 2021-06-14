package com.java.Program;

public class MethodOverloadingExample {
	private String formatNumber(int a) {
		return String.format("%d", a);
	}

	private String formatNumber(double a) {
		return String.format("%.3f", a);
	}

	private String formatNumber(String a) {
		return String.format("%.2f", Double.parseDouble(a));
	}

	public static void main(String[] args) {
		MethodOverloadingExample obj = new MethodOverloadingExample();
		System.out.println(obj.formatNumber(5));
		System.out.println(obj.formatNumber(5.00));
		System.out.println(obj.formatNumber("5.00"));

	}
}
