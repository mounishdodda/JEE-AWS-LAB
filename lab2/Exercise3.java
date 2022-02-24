package myArrays;

public class Exercise3 {

	// Reverse string
	static String reverseString(String s) {
		String x = "";
		char a;
		for (int j=s.length()-1; j >=0; j--) {
			a = s.charAt(j);
			x = x + a;
		}
		return x;
	}

	static int[] getSorted(int[] a) {
		int temp = 0;
		int[] b = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			b[i] = Integer.parseInt(reverseString(Integer.toString(a[i])));
		}

		// after reverse numbers in array
		System.out.println("After Reversing");
		for (int x : b) {
			System.out.print(x+" ");
		}
		System.out.println();  
		for (int m = 0; m < b.length; m++) {
			for (int n = m + 1; n < b.length; n++) {
				if (b[m] > b[n]) {
					temp = b[m];
					b[m] = b[n];
					b[n] = temp;
				}
			}
		}
		return b;
	}

	public static void main(String[] args) {
		// reverse numbers and return sorted array
		int[] a = { 10, 15, 65, 80, 24, 50 };
		// before reversing
		System.out.println("Before Reversing");
		for (int x : a) {
			System.out.print(x+" ");
		}
		System.out.println();
		// sending the array
		int[] arr = getSorted(a);
		// after sorting
		System.out.println("After Sorting");
		for (int m : arr) {
			System.out.print(m+" ");
		}

	}

}
