package task;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class level7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String a=sc.next();
		int dis=sc.nextInt();
		String s=sc.next();
		LocalDate cd=LocalDate.now();
		LocalDate dob=LocalDate.parse(s);
		//Localdate v=LocalDate.parse(dob);
		int p=Period.between(dob,cd).getYears();
		int n=0;
		int offer=0;
		if(p>=60)
		{
			if(a.equals("micro"))
			{
				n=dis*10;
				offer=(n*50)/100;
				
			}
			else if(a.equals("mini"))
			{
				n=dis*15;
				offer=(n*50)/100;
			}
			else
			{
				n=dis*20;
				offer=(n*50)/100;
			}
		}
		else
		{
			System.out.println(p);
		}
	    //int offer=n*(1/2);
		//System.out.println(p);
		System.out.println(n-offer);
	}

	
	
}
