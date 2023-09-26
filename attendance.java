/*******************************
*
*File       :Attendance.Java
*Description:Calculating marks
*Author      :Jismi
*Date        :26/09/23
*/
package javaprograms;

import java.util.Scanner;

public class attendance {
	public static void main(String[] args)
	{
	 int attendance_percentage;
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter the attendance percentage");
	 attendance_percentage=sc.nextInt();
	 if(attendance_percentage>90)
	 {
      System.out.println("Internal mark is "+10);
     }
	 else
	 {
		 System.out.println("The internal marks for attendance is "+(float)attendance_percentage/10);

	 }
	}

}
