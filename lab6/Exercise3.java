package lab6;

import java.util.*;

public class Exercise3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> ar = new ArrayList();
		System.out.println("Enter the size of array list");
		int n = sc.nextInt();
		System.out.println("Enter the elements");
		for (int i = 0; i < n; i++) {
			ar.add((Integer) sc.nextInt());
		}

		HashMap<Integer, Integer> res = getSquares(ar);
		for (Map.Entry x : res.entrySet()) {
			System.out.println("Number->" + x.getKey() + " " + "Squared value->" + x.getValue());
		}

	}

	private static HashMap<Integer, Integer> getSquares(ArrayList ar) {

		HashMap<Integer, Integer> res = new HashMap();
		for (int i = 0; i < ar.size(); i++) {
			Integer x = (int) ar.get(i) * (int) ar.get(i);
			res.put((Integer) ar.get(i),x);
		}

		return res;
	}
}
