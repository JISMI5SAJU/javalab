package javaprograms;
import java.util.Scanner;
public class reverse {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String input=sc.next();
		char [] chararray=input.toCharArray();
		int length=input.length();
		System.out.println("The reversed string is");
		char b[]=new char[length];
		for(int i=0;i<length;i++) {
			b[i]=chararray[length-i-1];
			System.out.print(b[i]);
		}
	}
}
 
