public class App {
    public static void main(String[] args) throws Exception {
        modle test = new modle();

        test.check (10, 20);
        test.check (20, 10 ); 
        test.check (20, 20 ); 
        test.check (10, 10); 
        test.check (0, 1); 
        test.check(1, 0);
        test.check(3, 5);
        test.check(5, 3);
        test.check(55342, 323);
               
    }
}
