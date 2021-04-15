package task;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class level5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String a=sc.next();
		LocalDate d=LocalDate.now();
		LocalTime t=LocalTime.now();
		switch(a)
		{
		case "micro":
			System.out.println(d);
			System.out.println(t);
			break;
		case "mini":
			System.out.println(d);
			System.out.println(t);
		case "prime":
			System.out.println(d);
			System.out.println(t);
		}
		
	}

	

}
