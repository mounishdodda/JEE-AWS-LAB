package myStrings;

public class Exercise8 {
	
	static boolean checkString(String s) {
		boolean flag=true;
		for(int i=0;i<s.length()-1;i++) {
			if(Character.compare(s.charAt(i), s.charAt(i+1))>0) {
				flag=false;
				break;
			}
		}
		return flag;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Positive String
		String s="abcdef";
		boolean res=checkString(s);
		
               System.out.println(res);
	}

}
