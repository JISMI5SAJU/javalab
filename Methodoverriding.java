package javaprograms;
import java.util.Scanner;
public class Methodoverriding {
    public static void main(String[] args) {
    Officer officer=new Officer();
    Manager hr=new Manager();
    System.out.println("Enter details of officer");
    officer.details();
    officer. specialisation();
    System.out.println("Enter details of manager");
    hr.details();
    hr.department();
    System.out.println("Details of officer are");
    officer.printdetails();
    officer.printspecialisation();
    System.out.println("Details of manager are");
    hr.printdetails();
    hr.printdepartment();
    	
    }
}
class employee{
	Scanner sc=new Scanner(System.in);
	String name,address;
	int age,salary;
	long phoneno;
	public void details(){
		System.out.println("Enter name:");
		name=sc.nextLine();
		System.out.println("Enter address");
		address=sc.nextLine();
		System.out.println("Enter age");
		age=sc.nextInt();
		System.out.println("Enter phonenumber");
		phoneno=sc.nextLong();
		System.out.println("Enter salary");
		salary=sc.nextInt(); }
	    public void printdetails() {
		System.out.println("DETAILS");
		System.out.println("Name="+name);
		System.out.println("Address="+address);
		System.out.println("Age="+age);
		System.out.println("Phonenumber="+phoneno);
		System.out.println("Salary="+salary);
	     }
	
	
	void printSalary()
	{
		System.out.println("Salary="+salary);
	}
		}

	class Officer extends employee{
		String specialisation;
		public void specialisation () {
		System.out.println(" Enter Specialisation");
		specialisation=sc.next();}
		public void printspecialisation() {
		System.out.println("specialisation="+specialisation);
		}
		
	}
	class Manager extends employee {
		String department;
		public void department() {
			System.out.println("department");
			department=sc.next();
		}
		public void printdepartment() {
			System.out.println("department="+department);
		}
	}
	

