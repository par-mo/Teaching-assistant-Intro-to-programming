public class Largest_Palindrome_Product {
	

	public static void main(String[] args) {

		int max_palindrom_number = 1;
		int multipled_result = 1;

		for (int i = 100; i < 1000; i++) {
			for (int j = 100; j < 1000; j++) {
				multipled_result = (i * j);
				if (check_palindrom(multipled_result) == true) {
					//System.out.println(multipled_result);
					 if (multipled_result > max_palindrom_number)
					 {max_palindrom_number = multipled_result;}
				}
			}
		}
		 System.out.println("max_palindrom_number:" + max_palindrom_number);
		// System.out.println(check_palindrom(69811896));
	}
	//////////////////////////////////////////////////////////////
	public static boolean check_palindrom(int n) {
		boolean flag = true;
		
		String temp = Integer.toString(n);

		if ((temp.length() % 2) == 0) {
			int[] newGuess2 = new int[temp.length() / 2];
			int[] newGuess3 = new int[temp.length() / 2];

			
			int[] newGuess = new int[temp.length()];

			// put the digits in an array

			for (int i = 0; i < temp.length(); i++) {
				newGuess[i] = temp.charAt(i) - '0';
			}

			for (int i = 0; i < (temp.length() / 2); i++) {
				newGuess2[i] = newGuess[i];
				// System.out.println(newGuess2[i]);
			}

			for (int i = 0; i < (temp.length() / 2); i++) {
				newGuess3[i] = newGuess[((temp.length() - i - 1))];
				// System.out.println(newGuess3[i]);
			}
			for (int i = 0; i < (temp.length() / 2); i++) {
				if (newGuess2[i] != newGuess3[i]) {
					flag = false;
				}
			}
			if (flag == true) {
				// System.out.println("y");
				return true;

			} else {
				// System.out.println("No");
				return false;
			}

		} else
			return false;

	}
}