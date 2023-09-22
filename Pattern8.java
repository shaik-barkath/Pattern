package com.kn.Patterns;

import java.util.Scanner;

public class Pattern8 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = scan.nextInt();
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.print((char) (70 - i));
			}
			System.out.println();
		}
		scan.close();
	}

}
