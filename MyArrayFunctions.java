package algs11;

import stdlib.*;
import java.util.Arrays;


----------------------------------------------------------------------------------------------------------------------

public class MyArrayFunctions {

	public static double sumHelper(double[] a, double sump, int i) {
		if (i >= a.length)
			return sump;
		return sumHelper(a, sump + a[i], i + 1);
	}

	public static double average(double[] a) {
		final int N = a.length;
		double sum = sumHelper(a, 0.0, 0);
		double average = sum / N;
		return average;
	}

	public static double averageI(double[] a) {
		final int N = a.length;
		double sum = 0.0;
		for (int i = 0; i < N; i++)
			sum += a[i];
		final double average = sum / N;
		return average;
		
	}

	public static double[] copyHelper(double[] a, double[] b, int i) {
		// double[] b = new double[N];
		if (i >= a.length)
			return b;
		b[i] = a[i];

		return copyHelper(a, b, i + 1);

		// return null; //TODO
	}

	public static double[] copy(double[] a) {

		final int N = a.length;
		double[] c = new double[N];
		// TODO
		copyHelper(a, c, 0);

		return c;

	}

	public static double[] copyI(double[] a) {

		final int N = a.length;
		final double[] b = new double[N];
		for (int i = 0; i < N; i++)
			b[i] = a[i];
		return b;
		
	}

	public static double[] reverseHelper(double[] a, int N, int i) {

		if (i > N / 2)
			return a;

		else {
			final double temp = a[i];
			a[i] = a[N - 1 - i];
			a[N - i - 1] = temp;

			return reverseHelper(a, N, i + 1);
		}

		// TODO
	}

	public static void reverse(double[] a) {
		final int N = a.length;
		reverseHelper(a, N, 0);

		return; // TODO
	}

	public static void reverseI(double[] a) {
		
		final int N = a.length;
		for (int i = 0; i < N / 2; i++) {
			final double temp = a[i];
			a[i] = a[N - 1 - i];
			a[N - i - 1] = temp;
		}
	}

	public static void test(double[] a) {
		StdOut.printf("average: %f\n", average(a));
		final double[] b = copy(a);
		StdOut.printf("copy: %s\n", Arrays.toString(b));
		reverse(b);
		StdOut.printf("reverse: %s\n", Arrays.toString(b));
	}

	public static void testI(double[] a) {
		StdOut.printf("average: %f\n ", averageI(a));
		final double[] b = copyI(a);
		StdOut.printf("copy: %s\n ", Arrays.toString(b));
		reverseI(b);
		StdOut.printf("reverse: %s\n ", Arrays.toString(b));
	}

	public static void main(String[] args) {
		final double[] a = new double[] { 10, 20, 30, 40, 50 };
		    testI(a);
	        test(a);
	      
	        StdOut.printf("\n Testing the method test() with different array  \n ");
	        test(new double[] {50,60,70,80});  //Not sure what was required in here because this was an empty array , So I put another values to testify my methods . 
	    }
	}
