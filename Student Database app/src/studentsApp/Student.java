package studentsApp;

import java.util.Scanner;

public class Student {
	private String firstName;
	private String lastName;
	private int gradeYear;
	private String studentID;
	private String courses=null;
	private int tuitionBalance;
	private static int costOfCourse = 600;
	private static int id = 1000;
	
	//constructor 
	public Student() {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter student firstname: ");
		this.firstName=in.nextLine();
		
		System.out.print("Enter student lastname: ");
		this.lastName=in.nextLine();
		
		System.out.print("1-for freshman\n2-for junior\n3-for sophomore\n4-for senior\nEnter student class level: ");
		this.gradeYear=in.nextInt();
		
		setStudentID();	
	}
	//generate an ID
	private void setStudentID() {
		id++;
		this.studentID=gradeYear+""+id;  
	}
	//enroll in courses
	public void enroll() {
		//GET IN A LOOP TILL USER HITS  Q
		do {	
			System.out.print("enter course to enrol (Q to quit):");
			Scanner in = new Scanner(System.in);
			String course =in.nextLine();
			if(!course.equals("Q")) {
				courses= courses+"\n "+course;
				tuitionBalance = tuitionBalance + costOfCourse;
			}
			else {break;}
		  }while (1 !=0);		
	}
	//view balance
	public void viewBalance() {
		System.out.println("YOUR BALANCE IS:" + tuitionBalance);
	}
	//pay tuition
	public void payTuition() {
		viewBalance();
		System.out.print("enter your payment:");
		Scanner in= new Scanner(System.in);
		int payment=in.nextInt();
		tuitionBalance=tuitionBalance-payment;
		System.out.println("thank you for your payment of: "+ payment);
		viewBalance();
	}
	//show status
	public String toString() {
		return "NAME:" + firstName +" "+ lastName +
				"\nGRADELEVEL: " +gradeYear +
				"\nSTUDENT ID: " +studentID+
				"\nCOURSES ENROLLED:" + courses +
				"\nBALANCE: $" + tuitionBalance;				
	}

}
