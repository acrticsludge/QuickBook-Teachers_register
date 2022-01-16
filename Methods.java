package TeacherRegister;

import java.util.Scanner;

public class Methods {
	public static void menu() throws ClassNotFoundException {
		Scanner scp = new Scanner(System.in);
        System.out.println("*\t                                     MENU                                            \t \t*");
        System.out.println("*\t \t \t \t \t                           \t \t \t \t \t*");
        System.out.println("*\t                       Enter 1: To enter a student record                            \t \t*");
        System.out.println("*\t                       Enter 2: To delete student record                             \t \t*");
        System.out.println("*\t                       Enter 3: To update student record                             \t \t*");
        System.out.println("*\t                       Enter 4: To view one student record                           \t \t*");
        System.out.println("*\t                       Enter 5: To view all student record(s)                        \t \t*");
        System.out.println("*\t \t \t \t \t                           \t \t \t \t \t*");
		System.out.println("*\t*\t*\t*\t*\t*\t*\t*\t*\t*\t*\t*\t*\t*");
        int input = scp.nextInt();
        int check = 0;
        
        switch(input) {

        case 1:
        	Scanner sc = new Scanner(System.in);
            Scanner scr = new Scanner(System.in);
            InsertStudentRecords app = new InsertStudentRecords();
            SelectStudentRecords appprint4 = new SelectStudentRecords();
            System.out.println("Enter the number of student you want to enter the marks for:");
        	int students = sc.nextInt();
        	
        	for(int i = 1; i<=students; i++)
        	{
        		System.out.println("Enter the name of the student:");
        		String name = scr.nextLine();
        		System.out.println("Enter the Roll number of "+ name+ ": ");
        		int RollNo = sc.nextInt();
        		System.out.println("Enter the math marks of "+name+": ");
        		double marks = sc.nextDouble();
        		
        		app.insert(RollNo, name, marks);
        	}
        	System.out.println("RollNo\tName\tMarks");
        	appprint4.selectAll();
        	break;
        	
        case 2:
        	System.out.println("Enter the RollNo of the student you want to delete:");
            int deleterollno = scp.nextInt();
            
            DeleteRecord delrecord = new DeleteRecord();
            SelectStudentRecords appprint = new SelectStudentRecords();
            delrecord.delete(deleterollno);
            System.out.println("RollNo\tName\tMarks");	
            appprint.selectAll();
            
            
            break;
            
        case 3:
        	System.out.println("Enter the RollNo of the student you want to update:");
            int updatestudent = scp.nextInt();
            System.out.println("Enter the new marks of the student:");
            double newmarks = scp.nextDouble();
            System.out.println("Operation Successful!\nUpdated register: ");		
            UpdateRecord updrecord = new UpdateRecord();
            SelectStudentRecords appprint2 = new SelectStudentRecords();
            updrecord.update(updatestudent, newmarks);
            System.out.println("RollNo\tName\tMarks");	
            appprint2.selectAll();
            break;
          
        case 4:
        	System.out.println("Enter the RollNo of the Student Record you want to view:");
            int specific = scp.nextInt(); 
            SelectSpecific speci = new SelectSpecific();
          
            speci.select(specific);
        	break;
        	
        case 5:
        	SelectStudentRecords appprint3 = new SelectStudentRecords();  
            System.out.println("RollNo\tName\tMarks");	
            appprint3.selectAll();
        	break;
        	
        default:
        	System.out.println("*\t*\t*\t*\t*\t  ERROR PLEASE TRY AGAIN   \t*\t*\t*\t*\t*");
        	Methods.menu();
        
        }
        
	}

}
