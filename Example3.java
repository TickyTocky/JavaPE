package com.stackroute.pe1;

import java.util.Scanner;

public class Example3 
{
	public static void main(String[] args)
	{
		char a;
		System.out.println("Enter your word :- ");
		
		Scanner sc = new Scanner (System.in);
		
		String word = sc.next();
		
		sc.close();
		
		int len = word.length();
		if(len == 1)
		{
			a = word.charAt(0);
			if(a == 'a' || a == 'e' || a == 'i'|| a == 'o'|| a == 'u')
			{
				System.out.println("It is a Vowel.");
			}
			else
			{
				System.out.println("It is a consonent.");
			}
		}
		else 
		{
			for(int i = 0; i < len; i++)
			{
				a = word.charAt(i);
				if(a == 'a' || a == 'e' || a == 'i'||a == 'o'|| a == 'u')
				{
					System.out.println(a + " - is a vovel");
				}
				else
				{
					System.out.println(a + " - is a consonent");
				}	
			}
		}
	}
}
