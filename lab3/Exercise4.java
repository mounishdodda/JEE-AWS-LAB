package myStrings;

import java.util.*;
import java.lang.Math;
public class Exercise4 {
	
	static int modifyNumber(int x) {
		String s1=Integer.toString(x);
		StringBuffer sb=new StringBuffer();
		
		for(int i=0;i<s1.length()-1;i++) {
			int v1=Integer.parseInt(String.valueOf(s1.charAt(i)));
			int v2=Integer.parseInt(String.valueOf(s1.charAt(i+1)));
			sb.append(String.valueOf(Math.abs(v1-v2)));
		}
		sb.append(String.valueOf(s1.charAt(s1.length()-1)));
		String a=new String(sb);
		return Integer.parseInt(a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int res=modifyNumber(x);
		System.out.println(res);
		

	}

}
