package binarysearch;

public class PowerXN {
	public double myPow(double x, int n) {
		if (n == 0) {
			return 1;
		}
		if (n == 1) {
			return x;
		}
		if (n == -1) {
			return 1 / x;
		}
		int a = n / 2;
		int b = a;
		double y = myPow(x, a);
		if (n % 2 == 0) {
			return y * y;
		} else {
			if (b < 0) {
				return y * y * x;
			} else {
				return y * y * 1 / x;
			}

		}
	}
}
