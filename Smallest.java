package Javatime;
import java.util.Scanner;
public class Smallest {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int a,b,c;
		System.out.println("Input first number");
	    a=sc.nextInt();
	    System.out.println("Input second number");
	    b=sc.nextInt();
	    System.out.println("Input third number");
	    c=sc.nextInt();
	    int number=small(a,b,c);
	    System.out.println("Smallest number="+number);
	}
	public static int small(int a,int b,int c)
	{
	  if(a<b&a<c)
	  {
		 return a;
	  }
	  else if(b<c&b<a)
	  {
		  return b;
	  }
	  else
	  {
		  return c;
	  }
	}
	
	    
	    		
        		
		
	}


