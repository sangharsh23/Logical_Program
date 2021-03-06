package com.bridgelabz.logical.program;

import java.util.Scanner;

public class ProgramLogic {
	Scanner num;

	public ProgramLogic() {
		num = new Scanner(System.in);
	}

	public int getNextInt() {
		return num.nextInt();
	}
	public float nextFloatValue() {
		return num.nextFloat();
	}	
	// 1) program to find number is prime or not
	public void getPrimeNumber(int number) {
		boolean condition = false;
		if (number == 0 || number == 1) {
			System.out.println(number + "  is not prime number");
		} else {
			for (int i = 2; i <= number / 2; i++) {
				if (number % i == 0) {
					condition = true;
					break;
				}
			}

			if (!condition)
				System.out.println(number + " is prime number");
			else
				System.out.println(number + " is not  prime number");
		}
	}

	// 2) program to find perfect number
	public void getPerfectNumber(int number) {
		int sum = 0;
		for (int i = 1; i < number; i++) {
			if (number % i == 0) {
				sum = sum + i;
			}
		}
		if (sum == number) {
			System.out.println(number + " is perfect number");
		} else {
			System.out.println(number + " is not perfect number");
		}
	}

	// 3) program to find reverse the number
	public void getReverseNumber(int number) {
		int reverse = 0;
		while (number != 0) {
			int remainder = number % 10;
			reverse = reverse * 10 + remainder;
			number = number / 10;
		}
		System.out.println("given number after reverse : " + reverse);
	}

//4) program to calculate fibonaaci series
	public void getFibonacciSeries(int number) {
		int number1 = 0;
		int number2 = 0;
		int number3 = 1;
		for (int i = 1; i <= number; i++) {
			number1 = number2;
			number2 = number3;
			number3 = number1 + number2;
			System.out.print(number1 + " ");
		}

	}
//5) program to calculate elapsed time for using stopwatch
	public void getElapsedTime(long finishTime ,long startTime) {
		 long timeElasped =(finishTime - startTime) / 1000;
		 System.out.println("time elapsed between start and finish time in sec : " + timeElasped);
	}
	
}