import java.util.Scanner;

public class arearunner {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println( "type value of a");
        double a = keyboard.nextDouble();
        
        System.out.println( "type value of b");
        double b = keyboard.nextDouble();

        System.out.println( "type value of c");
        double c = keyboard.nextDouble();

        area.perimeter(a, b, c);

        
        
    }
    
}
