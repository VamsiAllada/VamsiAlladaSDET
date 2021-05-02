package assignments1;

public class PrimeNumberProgram {

	public static void main(String[] args) {

		int min = 0;
		int max = 30;

		for (int i = min; i <= max; i++) {

			if (i == 0 || i == 1)
				continue;

			boolean flg = true;
			for (int j = 2; j <= i / 2; j++) {

				if (i % j == 0) {
					flg = false;
					break;
				}

			}

			if (flg == true)
				System.out.print(i + " ");

		}
	}
}
