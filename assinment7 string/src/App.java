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
        System.out.println(3 + 6);

        String message2 = "That was great - lol.";
        String target2 = "lol";
        int pos2 = message2.indexOf(target2);
        int end2 = pos2 + target2.length();
        
        String fix = message2.substring(0, 14);
        fix = fix + " laughing out loud";

        System.out.println(fix);


        
    }
}
