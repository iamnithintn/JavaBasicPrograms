package assignment;

import java.util.Scanner;

public class Equillibrium {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int[] a = new int[size];
		
		int i, j, k;

		for (k = 0; k < size; k++) {
			a[k] = s.nextInt();
		}
		s.close();

		for (i = 0; i < size; ++i) {
			int leftsum = 0, rightsum = 0;

			for (j = 0; j < i; j++) {
				leftsum += a[j];
			}

			for (j = i + 1; j < size; j++) {
				rightsum += a[j];
			}

			if (leftsum == rightsum) {
				System.out.println(i);
				;
			} else {
				System.out.println("No Equilibrium element found");

			}
		}
	}
}