package com.bridgelabz.EmployeWages;
import java.util.Scanner;
public class DailyEmployeWages {
	public static void main(String[] args)
		  {
				Scanner sc = new Scanner(System.in);
				System.out.println("Is Employee Come...? ");
				System.out.println("Yes/No (Y/N) ");
				int wgesPerHr = 20;
				int fullDayHr = 8;
				char X = sc.next().charAt(0);
				if  (X == 'Y' || X == 'y') {
					System.out.println("Employee is Present");
					System.out.println("Wages of Employee is " + wgesPerHr * fullDayHr);
				}  else if (X == 'N' || X == 'n') {
					System.out.println("Employee is Absent");
					System.out.println("Wages of Employee is " + wgesPerHr * 0);
				}
			}

	}


