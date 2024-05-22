import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {    
        
        Scanner keyboard = new Scanner(System.in);
        
        
        
        System.out.println("type the year you want ");
        int year1 = keyboard.nextInt();
        
        boolean isLeapYear = ((year1 % 4 == 0) && (year1 % 100 != 0) || (year1 % 400 == 0));

        if ((year1 % 4 == 0) && year1 % 100 != 0)
        {
            System.out.println(year1 + " is a leap year.");
        }
        else if ((year1 % 4 == 0) && (year1 % 100 == 0) && (year1 % 400 == 0))
        {
            System.out.println(year1 + " is a leap year.");
        }
        else
        {
            System.out.println(year1 + " is not a leap year.");
        }
        keyboard.close();
    }
}
