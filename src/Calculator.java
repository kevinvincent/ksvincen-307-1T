
public class Calculator {
	
	private static int multiply(int a, int b) {
		return a * b;
	}
	
	public static void main(String args) {
		System.out.printf("%d * %d = %d", 5, 2, multiply(5,2));
	}
}
