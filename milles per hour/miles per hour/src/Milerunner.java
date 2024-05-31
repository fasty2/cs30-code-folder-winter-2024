import java.util.Scanner;


public class Milerunner {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println(" Enter value of distance ");
        int distance = keyboard.nextInt();

        System.out.println("Enter number of hours");
        int hours = keyboard.nextInt();

        System.out.println("Enter number of minutes");
        double minutes = keyboard.nextDouble();

        MileperHour.Distance(distance, hours, minutes);
        
    }
    
}
