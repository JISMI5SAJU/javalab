package javaprograms;
import java.util.StringTokenizer;
import java.util.Scanner;

public class SumOfElementsInaString {

	public static void main(String[] args) {
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		StringTokenizer object=new StringTokenizer(sc.nextLine());
		while(object.hasMoreTokens()) {
			int data=Integer.parseInt(object.nextToken());
			System.out.println("next token:"+data);
			sum=sum+data;
		}
		System.out.println("The sum of elements in string is="+sum);
	}

}
