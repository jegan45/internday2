package task;

import java.util.Scanner;

public class level1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Long l=sc.nextLong();//mobile no
		Long p=sc.nextLong();//password
		String s=Long.toString(l);
		String v=Long.toString(p);
		if(s.length()==10 && v.length()==8)
		{
			System.out.println(s);
			System.out.println(v);
		}
	}

}
