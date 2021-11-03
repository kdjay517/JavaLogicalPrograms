package com.bridgelabz.logical;
import java.util.*;
public class PerfectNumber {

	public static void main(String[] args) {
		System.out.println("Enter any Number:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i ,sum=0;
		for (i = 1;i < n;i++) {
			if (n%i == 0)
				sum = sum + i;
			
		}
		if (sum == n)
			System.out.println(n+" is a perfect number."); 
		else
			System.out.println(n+" is a Not perfect number."); 

	}

}