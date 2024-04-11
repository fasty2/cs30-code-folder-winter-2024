public class App {
    public static void main(String[] args) 
    {
        String message1 = "I am very happy!";
        String target1 = "very ";
        int pos1 = message1.indexOf(target1);
        int end1 = pos1 + target1.length();

        String fixed1 = message1.substring(0, pos1);
        fixed1 = fixed1 + message1.substring(end1, message1.length());

        System.out.println(fixed1);
        //String message2 = "That was great - lol.";
        //String target2 = "lol";
        
    }
}
