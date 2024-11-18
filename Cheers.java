
public class Cheers {
        public static void main(String[] args) {
	    String cheer = args[0];
        int times = Integer.parseInt(args[1]);
        String bigLetters = "AEFHILMNORSX"; //// probably the strings
        String smallLetters = "aefhilmnorsx";

            int i = 0;
            while  (i < cheer.length() ) {
                char c = cheer.charAt(i);
                boolean isBigLet = bigLetters.indexOf(c) != -1;
                boolean isSmallLet = smallLetters.indexOf(c) != -1;
                if (isBigLet || isSmallLet) {
                    System.out.println("Give me an " + c + ": " + c + "!");
                } else {
                    System.out.println("Give me a  " + c + ": " + c + "!");
                }
                
                i++;
            }
            System.out.println( "What does that spell?");
            for (int j = 0; j < times; j++) {
                System.out.println(cheer + "!!!");
            }
        }
}   
