package TeacherRegister;

import java.util.Scanner;

public class MarksMain {
	public static void main(String[] args) throws ClassNotFoundException {  
		System.out.println("*\t*\t*\t*\t*\tTeachers Register V0.8-BETA\t*\t*\t*\t*\t*");
        System.out.println("*\t \t \t \t \t                           \t \t \t \t \t*");
        System.out.println("*\t     Welcome to the ALL IN ONE teachers register where you can enter and store your  \t \t*");
        System.out.println("*\t                 students marks. Follow the menu below to get started.               \t \t*");
        System.out.println("*\t                                Follow the menu below.                               \t \t*");
        System.out.println("*\t \t \t \t \t                           \t \t \t \t \t*");
	    Methods.menu();
	    
	    char yn = 'y';
	    while(yn == 'y') {
	    System.out.println("Still want to do more operations? (yes y or no n)");
	    Scanner sct = new Scanner(System.in);
	    yn = sct.next().charAt(0);
	    
	    
	    switch(yn) {
	    case 'y':
	    	System.out.println("*\t*\t*\t*\t*\t*\t*\t*\t*\t*\t*\t*\t*\t*");
	    	System.out.println("*\t                                Follow the menu below.                               \t \t*");
	    	Methods.menu();
	    	break;
	    case 'n':
	    	break;
	    default:
	    	System.out.println("*\t*\t*\t*\t*\t  ERROR PLEASE TRY AGAIN   \t*\t*\t*\t*\t*");
	    	System.out.println("*\t                                Follow the menu below.                               \t \t*");
	    	Methods.menu();
	    }
	    
	    }
	    
	    System.out.println("*\t*\t*\t*\t*\t*\t*\t*\t*\t*\t*\t*\t*\t*");
	    System.out.println("*\t \t \t \t \t                           \t \t \t \t \t*");
	    System.out.println("*\t          Program terminated, Thank you for using Teachers Register V0.8-BETA.       \t \t*");
	    System.out.println("*\t \t \t \t \t                           \t \t \t \t \t*");
	    System.out.println("*\t*\t*\t*\t*\t*\t*\t*\t*\t*\t*\t*\t*\t*");   
      }

}
