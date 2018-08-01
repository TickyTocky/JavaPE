package com.stackroute.pe1;

import java.util.Scanner;

public class Example10 {
	public static void main(String[] args)
	{
		System.out.println("Enter a string :- ");
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		
		sc.close();
		
		System.out.println("Enter a Number :- ");
		
		int num = sc.nextInt();
		int len = str.length();
		
		System.out.print(str);
		
		for(int i = 1; i <= num; i++)
		{
			System.out.print(str.substring(len - num, len));
		}
		
	}

}