package task;

import java.util.Scanner;

public class level3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String a=sc.next();
		int dis=sc.nextInt();
		if(a.equals("micro"))
		{
		System.out.println(dis*10);
		}
		else if(a.equals("mini"))
		{
			System.out.println(dis*15);
		}
		else
		{
			System.out.println(dis*20);
		} 
	}

}
