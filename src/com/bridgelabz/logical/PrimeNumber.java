package com.bridgelabz.logical;
import java.util.*;
public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number:");
		int n = sc.nextInt();
		int i,count = 0;
		for (i = 1;i <= n;i++) {
			if (n%i == 0)
				count = count+1;
		}
		if (count == 2)
			System.out.println(n +" "+ "is a PrimeNumber");
		else
			System.out.println(n + " " +"is a Not PrimeNumber");

	}

}