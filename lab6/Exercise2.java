package lab6;
import java.util.*;
public class Exercise2 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		//System.out.println("Please Enter the Array Size");
		//int n=sc.nextInt();
		char[] c= {'a','b','a','d','b','b','e','e'}; 
		
		HashMap<Character,Integer> res=countChars(c);
		
		for(Map.Entry x:res.entrySet()) {
			System.out.println("Character->"+x.getKey()+" "+"Repeated->"+x.getValue()) ;
		//System.out.println(x.);
		}
		
	}

	private static HashMap countChars(char[] c) {
	       
		HashMap res=new HashMap();
		
		for(int i=0;i<c.length;i++) {
			char x=c[i];
		     int sum=1;
		     for(int j=i+1;j<c.length;j++) {
		    	 if(c[j]==x) {
		    		 sum+=1;
		    	 }
		     }
		     
		     res.putIfAbsent(c[i],sum);
		}
	return res;
	}
	

}
