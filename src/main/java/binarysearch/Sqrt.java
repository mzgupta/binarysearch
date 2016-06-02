package binarysearch;

public class Sqrt {
	public int mySqrt(int c) {
		if (c < 0)
			return c;
		double EPSILON = 1E-15;
		double t = c;
		while (Math.abs(t - c / t) > EPSILON * t)
			t = (c / t + t) / 2.0;
		return (int) t;

	}
}
