package binarysearch;

public class DivideTwoIntegers {
	public int divide(int dividend, int divisor) {
		int sign = 1;
		if ((dividend ^ divisor) < 0) {
			sign = -1;
		}

		if (dividend < 0) {
			dividend = dividend * -1;
		}
		if (divisor < 0) {
			divisor = divisor * -1;
		}

		int quotient = 0;
		int qBase = 1;
		int qDivisior = divisor;
		while (dividend >= divisor) {

			if (dividend >= qDivisior) {
				dividend -= qDivisior;
				quotient += qBase;
				qDivisior = qDivisior << 1;
				qBase = qBase << 1;
			} else {
				qDivisior = qDivisior >> 1;
				qBase = qBase >> 1;
			}

		}
		return sign * quotient;
	}
}
