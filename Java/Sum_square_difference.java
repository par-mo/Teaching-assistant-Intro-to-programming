public class Sum_square_difference {

	public static void main(String[] args) {

		int sum1 = 0;
		int sum2 = 0;

		for (int i = 1; i <= 100; i++) {
			sum1 = sum1 + (i * i);
			sum2 = sum2 + i;
		}
		System.out.print(sum2 * sum2 - sum1);

	}
}
// Solution: 25164150