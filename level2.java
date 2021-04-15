package task;

import java.util.Scanner;

public class level2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String a=sc.next();
		//String b=sc.next();
		//String c=sc.next();
		//int n=0;
		switch(a)
		{
		case "micro":
			System.out.println(10);
			break;
		case "mini":
			System.out.println(15);
			break;
		case "prime":
			System.out.println(20);
			break;
		}
		
	}

}
