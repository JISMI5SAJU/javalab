/***************************************************
 *file        :palindrome.java
 *description :to check whether a string is palindrome or not
 *Author      :jismi
 *version     :1.0
 *date        :03/10/23
 */


package javaprograms;
import java.util.Scanner;

public class palindrome {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
	    String input=sc.next();
	    boolean isPal=isPalindrome(input);
	    if(isPal)
	    {
	    	System.out.println("the given string is palindrome");
	    }
	    else
	    {
	    	System.out.println("the given string is not palindrome");
	    }
	}
	    static boolean  isPalindrome(String input) {
	    int length=input.length();
	    char [] charArray=input.toCharArray();
	    for(int i=0;i<length/2;i++)
	         if(charArray[i]!=charArray[length-i-1])
	         {
	        	 return false;
	         }
	    
		     return true;
}
}
	    
	        	 
	       
	        	 
	         
	    

	    	



	

	    
	

		
	
	


