package com.stackroute.pe1;

import java.util.Scanner;

public class Example5 {
	public static void main(String[] args)
	{
		System.out.println("Enter String of numbers :- ");
		Scanner sc;
		sc = new Scanner(System.in);

		String word=sc.next();
		sc.close();
		
		String[] split	= word.split("\\s+");
		
		for(String a : split)
		{
			System.out.println(a);
		}
	}
}