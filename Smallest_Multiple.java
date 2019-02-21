import java.lang.Math;

public class Smallest_Multiple {

	public static void main(String[] args) {
		int n = 20;

		double mul = 1;
		// int jPower=1;

		int[] oddNum = { 2, 3, 5, 7, 11, 13, 17 };
		int[] jPower = new int[7];

		for (int j = 0; j < oddNum.length; j++) {

			for (int i = 1; Math.pow(oddNum[j], i) <= n; i++) {
				jPower[i] = jPower[i] + 1;
			}

			mul = mul * Math.pow(oddNum[j], jPower[j]);

		}

		System.out.print((int) mul);

	}

}
//result: 232792560 