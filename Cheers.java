
public class Cheers {
        public static void main(String[] args) {
	    String cheer = args[0];
        int times = Integer.parseInt(args[1]);
        String bigLetters = "AEFHILMNORSX";
        String smallLetters = "aefhilmnorsx";
        String finalCheer = "";
            int i = 0;
            while  (i < cheer.length() ) {
                char c = cheer.charAt(i);
                boolean isBigLet = bigLetters.indexOf(c) != -1;
                boolean isSmallLet = smallLetters.indexOf(c) != -1;
                if (isBigLet) {
                    System.out.println("Give me an " + c + ": " + c + "!");
                    finalCheer = finalCheer + c;
                }else if (isSmallLet) {
                   c = Character.toUpperCase(c);
                   System.out.println("Give me an " + c + ": " + c + "!");
                   finalCheer = finalCheer + c;
                } else {
                    System.out.println("Give me a  " + c + ": " + c + "!");
                    finalCheer = finalCheer + c;
                }
                i++;
            }
            System.out.println( "What does that spell?");
            for (int j = 0; j < times; j++) {
                System.out.println(finalCheer + "!!!");
            }
        }
}   
