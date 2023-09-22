package com.kn.Patterns;

import java.util.Scanner;

public class Pattern34 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = scan.nextInt();
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if ((i%2==0 && j == 3) || (j%2==0 && i==3)) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		scan.close();
	}

}
