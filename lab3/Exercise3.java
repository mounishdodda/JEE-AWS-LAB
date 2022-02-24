package myStrings;

public class Exercise3 {
	
	static String checkString(String s) {
		StringBuffer sb=new StringBuffer();
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || c=='A' || c=='E' || c=='I' || c=='O' || c=='U') {
				sb.append(c);
			}
			else {
				
				sb.append((char)(c+1));
			}
			
		}
		String res=new String(sb);
		return res;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String s="JAVA";
       String res=checkString(s);
		System.out.println(res);
		
	}

}
