public class Quote {
    public static String randomQuote(){
        int num = (int)(Math.random() * 4) + 1;
        if(num == 1) {
            return "Would you like to fluff my tail?";
        }
        else if (num == 2)
           return "Would you like me to make dinner?";
        else if (num == 3)
            return "Would you like me to get the bath ready?";
        else
            return "Would you like to sleep?";
    }
}
