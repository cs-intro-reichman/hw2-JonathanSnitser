// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    int termNum = Integer.parseInt(args[0]);
		double sum = 1.0;
		double devider = 3;
		double plusOrMinus = -1;
		for (int i=0; i < termNum; i++) {
			sum = sum + (1 / devider * plusOrMinus);
			devider = devider + 2;
			plusOrMinus = plusOrMinus * (-1);
		}
		System.out.println("pi according to Java: " + Math.PI);
		System.out.println("pi, approximated: " + (sum * 4));
	}
}
