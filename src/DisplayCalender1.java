import java.util.Scanner;

public class DisplayCalender1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the month");
		int month = sc.nextInt();
		
		System.out.println("Enter the year:");
		int year = sc.nextInt();
		
		int startDayOfMonth = 4;
        int spaces = startDayOfMonth;
		String[] months = { "", "January", "February", "March", "April", "May", "June",  "July", "August", "September",
                "October", "November", "December" }; // leave empty so that we start with months[1] = "January"
            
		int[] days = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		
		
		
		 System.out.println("          "+ months[month] + " " + year);
		 System.out.println("_____________________________________");
         System.out.println("   Sun  Mon Tue   Wed Thu   Fri  Sat");
         spaces = (days[month-1] + spaces)%7;

         // print the calendar
         for (int i = 0; i < spaces; i++)
             System.out.print("     ");
         for (int i = 1; i <= days[month]; i++) {
             System.out.printf(" %3d ", i);
             if (((i + spaces) % 7 == 0) || (i == days[month])) System.out.println();
         }

         System.out.println();

	}
	

}
