package lab6;

import java.util.*;

import com.sun.tools.javac.util.List;

public class Exercise1 {
	
	static ArrayList<Integer> getValues(HashMap<Integer,Integer> hm){
	
		ArrayList<Integer> l=new ArrayList<Integer>();
		
		
		for(Map.Entry<Integer,Integer> m:hm.entrySet()) {
			l.add((Integer) m.getValue());
		}
		
		Collections.sort(l);
		return l;
	}
	

	public static void main(String[] args) {
		
		HashMap<Integer,Integer> hm=new HashMap<Integer, Integer>();
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the HashMap size->");
		int n=sc.nextInt();
		System.out.println("Enter the keys and values");
		for(int i=0;i<n;i++) {
			Integer x1=(Integer)sc.nextInt();
			Integer x2=(Integer)sc.nextInt();
			hm.put(x1, x2);
			
		}
		
		ArrayList<Integer> al=getValues(hm);
		
		for(Integer x:al) {
			System.out.println(x);
		}
		

	}

}
