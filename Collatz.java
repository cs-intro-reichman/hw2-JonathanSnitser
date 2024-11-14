
public class Collatz {
	public static void main(String args[]) {
	    int highNum = Integer.parseInt(args[0]);
		String cOrV = args[1];
		if (cOrV.charAt(0) == 'v') {
			for (int i = 1; i < highNum + 1; i++) {

				int num = i;
				int loopTimes = 1;
				System.out.print(num + ", ");
				do { 
					if (num % 2 == 0){
						num = num / 2;
					} else {
						num = (num * 3) + 1;
					}
					System.out.print(num + ", ");
					loopTimes++;
				} while (num != 1);
				System.out.println(" (" + loopTimes + ")");
			}
		} 
		
		System.out.println("Every one of the first " + highNum + " hailstone sequences reached 1.");
	}
}
