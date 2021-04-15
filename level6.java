package com.jegan;

import java.time.LocalTime;
import java.util.Scanner;

public class level6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int dis=sc.nextInt();
		String a=sc.next();
		String s=sc.next();
		LocalTime lt=LocalTime.parse(s);
		int hour=lt.getHour();
		int n=1;
		if(hour>=5 && hour<=7)
		{
			if(a.equals("micro"))
			{
				n=dis*10;
			}
			else if(a.equals("mini"))
			{
				n=dis*15;
			}
			else
			{
				n=dis*20;
			}
		}
		double offer=n+(1.25%100);
		System.out.println(offer);
	}

}
