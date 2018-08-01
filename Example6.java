package com.stackroute.pe1;

import java.util.Scanner;

public class Example6 {
	public static void main(String[] args)
	{
		System.out.println("Enter a character :- ");
		Scanner sc = new Scanner (System.in);
		
		String a = sc.next();
		sc.close();
		
		char st = a.charAt(0);
		
		int asc=st;
		
		if(asc >= 65 && asc <= 90)
		{
			System.out.println("Capital Letter.");
		}
		else if(asc >= 97 && asc <= 122)
		{
			System.out.println("Small Letter.");
		}
		else if(asc >= 65 && asc <= 90)
		{
			System.out.println("Capital Letter");
		}
		else if(asc == '1' || asc == '2' || asc == '0' || asc == '3' || asc == '4' || asc == '5' || asc == '6' || asc == '7' || asc == '8' ||asc == '9')
		{
			System.out.println("Digits.");
		}
		else
			System.out.println("Special character.");
	}

}
