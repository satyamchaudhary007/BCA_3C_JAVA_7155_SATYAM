// 9 WRITE A JAVA PROGRAM TO FIND OUT STUDENTS RESULT/GRADE USING IF CONDITION?

import java.util.Scanner;

public class prog9{

		public static void main(String args[]){
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Enter your Gr number:");
		int gr = scn.nextInt();
		
		scn.nextLine();
		
		System.out.print("enter your name:");
		String name = scn.nextLine();
			
		System.out.print("enter your marks of c :");
		int c  =scn.nextInt();
		
		System.out.print("enter your marks of cplus:");
		int cplus = scn.nextInt();
		
		System.out.print("enter your marks of java:");
		int java = scn.nextInt();
		
		System.out.print("entet your marks of ds:");
		int ds = scn.nextInt();
		
		System.out.print("enter your marks of html:");
		int html = scn.nextInt();
		 
		int total = c + cplus + java + ds + html;
		
		int perc = total/5;
		
		
		System.out.println("====================================================================================");
		System.out.println("|                       MARWADI UNIVERSITY RESULT                                   |");
		System.out.println("====================================================================================");
		System.out.println("| GR NO: " + gr);
		System.out.println("| NAME: " + name);
		System.out.println("====================================================================================");
		System.out.println("| SUBJECT                           |     TOTAL          |    MARKS                 |");
		System.out.println("====================================================================================");
		System.out.println("     C:                             |      100           |    "    + c);
		System.out.println("     C++:                           |      100           |    "    + cplus);
		System.out.println("     java                           |      100           |    "    + java);
		System.out.println("     ds                             |      100           |    "    + ds);
		System.out.println("     html                           |      100           |    "    + html);
		System.out.println("====================================================================================");
		System.out.println("                                    |      500           |    " + total);
		System.out.println("====================================================================================");
		System.out.println("PERCENTAGE: "  + perc);
		
		if(perc>=90 && perc<=100){
			System.out.println("GRADE: O");
		}
		else if(perc >= 80 && perc <= 89){
			System.out.println(" GRADE: A+");
		}
		else if(perc >= 70 && perc <=79){
			System.out.print("GRADE: A");
		}
		else if(perc >= 60 && perc <= 69){
			System.out.print("GRADE: B+");
		}
		else if(perc >= 50 && perc <=59){
			System.out.print("GRADE: B");
		}
		else if(perc >=40 && perc <= 49){
		  System.out.print("GRADE: C");
		}
		else if(perc >=30 && perc <=39){
			System.out.print("GRADE: D");
		}
		else {
			System.out.print("GRADE: F");
		}
		System.out.println("====================================================================================");
		
		}

}