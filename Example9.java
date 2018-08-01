package com.stackroute.pe1;

import java.util.Scanner;

public class Example9 
{
	public static void main(String[] args)
	{
		System.out.println("Enter your word :- ");
		
		Scanner sc = new Scanner (System.in);
		String str = sc.next();
		
		sc.close();
		
		int len=str.length();
		
		for(int i=len-1;i>=0;i--)
		{
			System.out.print(str.charAt(i));
		}
	}
	

}