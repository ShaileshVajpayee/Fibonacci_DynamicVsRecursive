import java.util.Scanner;

/**
 * This program compares Recursive and Dynamic Programming speed for Fibonacci
 * 
 * @author shaileshvajpayee
 *
 */
public class Fibonacci {

	public static int[] S;

	/**
	 * Recursive approach
	 * @param n upto this number
	 * @return	result
	 */
	public int fib_recur(int n) {
		if (n <= 2) {
			return 1;
		}
		return fib_recur(n - 1) + fib_recur(n - 2);
	}

	/**
	 * Dynamic programming implementation where results are stored in an array
	 * @param n upto this number
	 * @return	result
	 */
	public int fib_dynamic(int n) {

		S[0] = 0;
		S[1] = 1;

		for (int i = 2; i <= n; i++) {
			S[i] = S[i - 1] + S[i - 2];
		}
		return S[n];
	}

	/**
	 * The main function of the class
	 * 
	 * @param args
	 *            ignored
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		double start, end, time;

		Fibonacci Fib = new Fibonacci();

		int n = Integer.parseInt(s.nextLine());

		S = new int[n + 1];

		start = System.currentTimeMillis();
		int recur_ans = Fib.fib_recur(n);
		end = System.currentTimeMillis();
		time = end - start;

		System.out.println("Recursive answer " + recur_ans + " It took " + time + "ms");

		start = System.currentTimeMillis();
		int dynamic_ans = Fib.fib_dynamic(n);
		end = System.currentTimeMillis();
		time = end - start;
		System.out.println("Dynamic answer " + dynamic_ans + " It took " + time + "ms");

		s.close();
	}
}
