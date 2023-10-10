package javaprograms;

import java.util.Scanner;

public class Matrixmulti {
	public static void main(String []args) {
    Scanner sc=new Scanner(System.in);
	int r1,c1,r2,c2;
	System.out.println("Enter the order of first matrix");
	r1=sc.nextInt();
	c1=sc.nextInt();
	System.out.println("Enter the order of second matrix");
	r2=sc.nextInt();
	c2=sc.nextInt();
	int a[][]=new int [r1][c1];
	int b[][]=new int[r2][c2];
	int c[][]=new int[r2][c1];
	if(c1!=r2)
	{ 
		System.out.println("Matrix multiplication is not possible");
	}
	else
	{
		int i,j,k;
        System.out.println("Enter values of first matrix");
        for(i=0;i<r1;i++)
            for(j=0;j<c1;j++)
        	{
        	  a[i][j]=sc.nextInt();
        	}
        System.out.println("Enter values of second matrix");
        for(i=0;i<r2;i++)
        	for(j=0;j<c2;j++)
        	{
        	  b[i][j]=sc.nextInt();
        	}
        System.out.println("First matrix is");
        for(i=0;i<r1;i++) {
            for(j=0;j<c1;j++)
        	{
        	  System.out.print(a[i][j]+"\t");
        	}
            System.out.println();
        }
        System.out.println("Second matrix is");
        for(i=0;i<r2;i++) {
        	for(j=0;j<c2;j++)
        	{
        	  System.out.print(b[i][j]+"\t");
        	}
        	System.out.println();
        }

        //multiplication
        for(i=0;i<r1;i++)
        	for(j=0;j<c2;j++)
        	{
        		c[i][j]=0;
        		for(k=0;k<c1;k++)
        		c[i][j]=c[i][j]+a[i][k]*b[k][j];
        	}
        System.out.println("The resultant matrix is");
        for(i=0;i<r1;i++)
        {
        	for(j=0;j<c2;j++)
        	{
        		 System.out.print( c[i][j]+"\t");
        	}
              System.out.println();
	}
	}
}
}
        
        
        
        		
        
        
        
        		
        		
		
		
	
	
	
	


