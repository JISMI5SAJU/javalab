package javaprograms;
import java.util.Scanner;
public class second {
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter the limit");
    	int n=sc.nextInt();
    	int []a=new int[n];
    	System.out.println("Enter the elements in array");
    	for(int i=0;i<n;i++)
    	{
    		a[i]=sc.nextInt();
    	}
    	int temp;
    	for(int i=0;i<n;i++)
    	{
    		for(int j=i+1;j<n;j++) {
    			if(a[i]>a[j]) {
    				temp=a[i];
    				a[i]=a[j];
    				a[j]=temp;
    			}
    		}	
    	}
    		System.out.println(a[1]);	
    	}
}

  
   
    		
    		
    

