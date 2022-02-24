package myStrings;
import java.util.*;
public class Exercise1 {

	public static void main(String[] args) {
/*		// TODO Auto-generated method stub
		//String Tokenizer
		Scanner sc=new Scanner(System.in);
		String input=sc.next();
        StringTokenizer a=new StringTokenizer(input," ");
        while(a.hasMoreTokens()) {
        	System.out.println(a.nextToken()+" ");
        }
        */
		
		String s="1569";
		int sum=0;
		for(int i=0;i<s.length();i++) {
			System.out.print(s.charAt(i)+" ");
			sum=sum+Integer.parseInt(String.valueOf(s.charAt(i)));
		}
		System.out.println();
		System.out.println(sum);
	}

}
