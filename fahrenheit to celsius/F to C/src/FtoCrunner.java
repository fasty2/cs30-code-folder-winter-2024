import java.util.Scanner;

public class FtoCrunner {
    public static void main(String[] args) {
        FtoC calc = new FtoC();
        Scanner keyboard = new Scanner(System.in);


        System.out.println("What is the temp");
        double input = keyboard.nextDouble();
        calc.converter(input);
        
        System.out.println("What is the temp");
         input = keyboard.nextDouble();
        calc.converter(input);

        System.out.println("What is the temp");
         input = keyboard.nextDouble();
        calc.converter(input);
    }

}
