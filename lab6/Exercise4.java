package lab6;
import java.util.*;
import java.util.Map.Entry;
public class Exercise4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Size of HashMap->");
		int n=sc.nextInt();
		HashMap<Integer,Integer> hm=new HashMap();
		System.out.println("Enter the values");
		for(int i=0;i<n;i++) {
			Integer x1=(Integer)sc.nextInt();
			Integer x2=(Integer)sc.nextInt();
			hm.put(x1, x2);
		}
		
		HashMap<Integer,String> res=getMarks(hm);
		System.out.println(res);
	}
	
	public static  HashMap<Integer, String> getMarks(HashMap<Integer,Integer> hm) {
		
		HashMap<Integer,String> res=new HashMap();
		
		
	     for(Map.Entry x: hm.entrySet()) {
	    	 if(((int)x.getValue())>=80 && ((int)x.getValue())<90) {
	    		 res.put((Integer)x.getKey(),"GOLD");
	    	 }
	    	 else if((int)x.getValue()>=70 && (int)x.getValue()<80) {
	    		 res.put((Integer)x.getKey(),"SILVER");
	    	 }
	    	 else if((int)x.getValue()>=60 && (int)x.getValue()<70) {
	    		 res.put((Integer)x.getKey(),"BRONZE");
	    	 }
	    	 else {
	    		 continue;
	    	 }
	    	 
	     }
		
		
		return res;
	}

	private static Entry[] entrySet() {
		// TODO Auto-generated method stub
		return null;
	}


	

}
