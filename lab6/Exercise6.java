package lab6;
import java.util.*;
import java.util.HashMap;
import java.util.Scanner;

public class Exercise6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Size of HashMap->");
		int n=sc.nextInt();
		HashMap<Integer,Integer> hm=new HashMap();
		System.out.println("Enter the values");
		for(int i=0;i<n;i++) {
			System.out.print("Enter the ID->");
			Integer x1=(Integer)sc.nextInt();
			System.out.print("Enter the AGE->");
			Integer x2=(Integer)sc.nextInt();
			hm.put(x1, x2);
		}
		
		ArrayList a=checkAge(hm);
		
		for(Object x:a) {
			System.out.println(x);
		}
		
	}
	
	public static ArrayList checkAge(HashMap<Integer,Integer> hm) {
		ArrayList res=new ArrayList();
		
		for(Map.Entry<Integer, Integer> x:hm.entrySet()) {
			if(x.getValue()>=18) {
				res.add(x.getKey());
			}
		}
		return res;
	}

}
