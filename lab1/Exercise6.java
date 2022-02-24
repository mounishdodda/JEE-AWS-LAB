package flowControl;

public class Exercise6 {
 static int calculateDifference(int n) {
	 int l=(n*(n+1)*(2*n+1))/6;
	 int r= (n*(n+1))/2 * (n*(n+1))/2;
	 System.out.println(l);
	 System.out.println(r);
	 return l-r;
	 
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=10;
		int x=calculateDifference(n);
		System.out.println(x);
	}

}
