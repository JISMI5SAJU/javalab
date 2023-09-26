package javaprograms;

import java.util.Scanner;

public class grade {
	public static void main(String [] args)
	{
	int mark;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter marks");
	mark=sc.nextInt();
	if(mark>90)
		System.out.println("grade A+");
	else if(mark>80&&mark<90)
		System.out.println("grade A");
	else if(mark>70&&mark<80)	
		System.out.println("grade B+");
	else if(mark>60&&mark<70)	
		System.out.println("grade B");
	else if(mark>50&&mark<60)
		System.out.println("grade C+");
	else if(mark>40&&mark<50)
		System.out.println("grade C");
	else if(mark>30&&mark<40)
		System.out.println("grade D+");
	else
		System.out.println("grade fail");
	}
}
	



