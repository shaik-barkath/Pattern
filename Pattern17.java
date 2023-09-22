package com.kn.Patterns;

import java.util.Scanner;

public class Pattern17 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = scan.nextInt();
		for (int i = 5; i > 0; i--) {
			for (int j = 5; j > 0; j--) {
				if (i >= j) {
					System.out.print(j);
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		scan.close();
	}

}
