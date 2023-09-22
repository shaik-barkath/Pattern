package com.kn.Patterns;

import java.util.Scanner;

public class Pattern33 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = scan.nextInt();
		boolean k = true;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= 9; j++) {
				if (j >= 6 - i && 4 + i >= j && k == true) {
					System.out.print("*");
					k = false;
				} else {
					System.out.print(" ");
					k = true;
				}
			}
			System.out.println();
		}
		scan.close();
	}

}
