
public class Cheers {
        public static void main(String[] args) {
	    String cheer = args[0];
            int times = Integer.parseInt(args[1]);
            String letters = "AEFHILMNORSX";

            int i = 0;
            while  (i < cheer.length() - 1 ) {
                char c = cheer.charAt(i);
                if (letters.indexOf(c) != -1) {
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
