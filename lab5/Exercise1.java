package lab5;

import java.util.*;

class MyAgeException extends Exception{
	
	MyAgeException(String s){
		super(s);
	}
	
}

public class Exercise1 {

	public static void main(String[] args) throws MyAgeException{
		
		Scanner sc=new Scanner(System.in);
		//Enter input
		int x=sc.nextInt();
		
		
		if(x<15){
			throw new MyAgeException("Age should be greater than 15");
		}
		else {
			System.out.println("Your age is->"+x);
		}
	}

}
