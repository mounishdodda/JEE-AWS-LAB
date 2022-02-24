package flowControl;

public class Exercise8 {
	static boolean checkNumber(int n){
		if(n==0) 
			return false;
		while(n!=1){
			if(n%2!=0) 
				return false;
			 n=n/2;
			}	
		return true;
	 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Check number is power of two
		System.out.println(checkNumber(24));
		System.out.println(checkNumber(64));
		System.out.println(checkNumber(256));
	}

}
