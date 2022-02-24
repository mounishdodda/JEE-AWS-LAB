package myArrays;
import java.util.*;
public class Exercise2 {
	
	//Sorting strings
	static void sortString(String[] s) {
		Arrays.sort(s);
		
		for(int i=0;i<s.length;i++) {
			if(i<=(s.length/2-1)) {
				s[i]=s[i].toUpperCase();
			}
			else {
				s[i]=s[i].toLowerCase();
			}
			
		}
		System.out.println(Arrays.toString(s));
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the array size->");
		int n=sc.nextInt();
		String[] s=new String[n];
		System.out.println("Enter the strings");
		for(int i=0;i<n;i++) {
			s[i]=sc.next();
		}
	Exercise2 a=new Exercise2();	
       a.sortString(s);
      //System.out.println("Resulting Array->");
    /*  for(String x:res) {
    	  System.out.print(x+" ");
      }
      */
	}

}
