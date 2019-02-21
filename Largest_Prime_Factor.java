public class Largest_Prime_Factor {

	public static void main(String[] args) {

		long number = 115;// 600851475143L;
		long temp = 1;

		for (long factor = 2; factor <= (number / 2); factor++) {
			if ((number % factor) == 0 && factor > temp) {
				if (isPrime(factor) == true)
					temp = factor;
			}
		}
		System.out.println(temp);
	}

	public static boolean isPrime(long f) {
		for (int factor2 = 2; factor2 <= (f / 2); factor2++) {
			if ((f % factor2) == 0)
				return false;
		}
		return true;

	}
}
