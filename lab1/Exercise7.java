package flowControl;

public class Exercise7 {
	static boolean checkNumber(int n) {
		
		int current=n%10;
		boolean flag=true;
		n=n/10;
		while(n>0) {
			if(current<=n%10) {
				flag=false;
				break;
			}
			current=n%10;
			n=n/10;
		}
		return flag;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Program for Increasing Number
		
		int x=1289;
		int y=1243;
		
	    System.out.println(checkNumber(x));
	    System.out.println(checkNumber(y));
	    
	    
	    

	}

}
