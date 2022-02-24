package flowControl;
import java.util.*;
public class Exercise5 {
	static int calculateSum(int n) {
		int sum=0;
		for(int i=1;i<=n;i++) {
			if(i%3==0 || i%5==0) {
				sum+=i;
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the input");
		int n=sc.nextInt();
		int x=calculateSum(n);
		System.out.println("The sum is "+x);

	}

}
