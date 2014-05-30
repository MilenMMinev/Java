package com.hackbulgaria.corejava;

import java.util.Arrays;

public class Problems2Impl implements Problems2 {

	@Override
	public boolean isOdd(int number) {
		return number % 2 != 0;
	}

	@Override
	public boolean isPrime(int number) {
		int i = 2;
		while (i < number / 2) {
			if (number % i == 0) {
				return false;
			}
			i++;
		}
		return true;
	}

	@Override
	public int min(int... array) {
		int min = array[0];
		for (int element : array) {
			if (element < min) {
				min = element;
			}
		}
		return min;
	}

	@Override
	public int kthMin(int k, int[] array) {
		Arrays.sort(array); // ctrl shift + o automatically resolves
		return array[k - 1];
	}

	@Override
	public float getAverage(int[] array) {
		float sum = 0;
		for (int element : array) {
			sum += element;
		}
		return sum / array.length;
	}

	@Override
	public long getSmallestMultiple(int upperBound) {
		for (int i = 1;; i++) {
			if (dividesAll(i, upperBound)) {
				return i;
			}
		}
	}

	public boolean dividesAll(long num, long bound) {
		for (int i = 1; i < bound; i++) {
			if (num % i != 0) {
				return false;
			}
		}
		return true;
	}

	@Override
	public long getLargestPalindrome(long N) {
		while (!isPalindrom(N)) {
			N = N - 1;
		}
		return N;
	}

	public boolean isPalindrom(long n) {
		return (n == getReverse(n));
	}

	public long getReverse(long n) {
		long rev = 0;
		long dig;
		while (n > 0) {
			dig = n % 10;
			rev = rev * 10 + dig;
			n = n / 10;
		}
		return rev;
	}

	@Override
	public int[] histogram(short[][] image) {
		int[] result = new int[255];
		for (int k = 0; k < image.length; k++)
			for (int l = 0; l < image[k].length; l++)
				for (int i = 0; i <= 255; i++) {
					if (image[k][l] == i) {
						result[i]++;
					}
				}
		return result;

	}

	@Override
	public long doubleFac(int n) {
		long result = 1;
		long temp;
		for (int i = 1; i <= 2; i++) {
			temp = Fac(n);
			result = Fac(temp);

		}
		return result;
	}

	public long Fac(long n) {
		long result = 1;
		for (int i = 2; i <= n; i++) {
			result *= i;
		}
		return result;
	}

	@Override
	public long kthFac(int k, int n) {
		long result = 1;
		for (int i = 1; i <= k; i++) {
			for (int j = 1; j <= n; j++) {
				result *= j;
			}
		}
		return result;

	}

	@Override
	public int getOddOccurrence(int[] array) {
		Arrays.sort(array);
		int init = array[0];
		int i = 0;
		while (true) {
			while (array[i] == init) {
				i++;
			}
			init = array[i];
			if (i % 2 != 0) {
				return array[i - 1];
			}
		}
	}

	@Override
	public long pow(int a, int b) {
		long result = 1;
		for (int i = 0; i < b; i++) {
			result *= a;
		}
		return result;
	}

	@Override
	public long maximalScalarSum(int[] a, int[] b) {
		long sum = 0;
		Arrays.sort(a);
		Arrays.sort(b);
		for (int i = a.length-1; i >= 0; i--)
		{
				sum += a[i]*b[i];
		}
		return sum;
	}

	@Override
	public int maxSpan(int[] array) {
		return array.length - 1;
	}

	@Override
	public boolean canBalance(int[] array) {
		int sum = 0;
		for (int elements : array)
			sum += elements;
		return sum % 2 == 0;
	}

	@Override
	public int[][] rescale(int[][] original, int newWidth, int newHeight) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String reverseMe(String argument) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String copyEveryChar(String input, int k) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String reverseEveryWord(String arg) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isPalindrome(String argument) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isPalindrome(int number) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int getPalindromeLength(String input) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int countOcurrences(String needle, String haystack) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String decodeURL(String input) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int sumOfNumbers(String input) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean areAnagrams(String A, String B) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean hasAnagramOf(String string, String string2) {
		// TODO Auto-generated method stub
		return false;
	}

}
