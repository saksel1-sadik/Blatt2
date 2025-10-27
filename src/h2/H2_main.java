package h2;

public class H2_main {

	public static void main(String[] args) {
		int i = 10, j = 15, k = 5, min = 0, max = 0;

		min = i;

		if (j < min) {
			min = j;
		}
		if (k < min) {
			min = k;
		}

		// jetzt ist min garantiert das Minimum
		System.out.println("Minimum = " + min);

		max = i;

		if (j > max) {
			max = j;
		}

		if (k > max) {
			max = k;
		}

		// jetzt ist max garantiert das Maximum
		System.out.println("Maximum = " + max);

	}

}
