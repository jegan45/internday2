package task;

import java.util.Scanner;

public class level4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String a=sc.next();
		int dis=sc.nextInt();
		int n=1;
		if(a.equals("micro"))
		{
			n=dis*10;
			//gst=n+n%7;
		}	
		//int gst=n+(7%100);
		//System.out.println(gst);
		else if(a.equals("mini"))
		{
			n=dis*15;
		}
		else
		{
		    n=dis*20;
		} 
		int gst=n+(7%100);
		System.out.println(gst);
	}

}
