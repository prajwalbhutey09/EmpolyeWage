package com.bridgelabz.EmployeWages;

import java.util.Scanner;

public class PresentAbsent {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Is Employee Come...? ");
		System.out.println("Yes/No (Y/N) ");

		char X = sc.next().charAt(0);
		if (X == 'Y' || X == 'y') {
			System.out.println("Employee is Present");

		} else if (X == 'N' || X == 'n') {
			System.out.println("Employee is Absent");
		}
	}
}
