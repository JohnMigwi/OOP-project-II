package studentsApp;

import java.util.Scanner;

public class StudentDatabaseApp {

	public static void main(String[] args) {	
		// how many n number of students to be added
		System.out.print("enter number of new students to enroll: ");
		Scanner in =new Scanner(System.in);
		int numOfStudents=in.nextInt();
		Student[] students= new Student[numOfStudents];
		
		//displaying details of n number of students
		for(int n=0; n < numOfStudents; n++) {
			students[n]=new Student();
			students[n].enroll();
			students[n].payTuition();	
			System.out.println(students[n].toString());
		}
		
		/*or display using\\
		 * for(int n=0; n < numOfStudents; n++) {	
			System.out.println(students[n].toString());*/
	}
}
