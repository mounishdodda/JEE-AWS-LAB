package myStrings;

public class Exercise2 {
	
	static String getImage(String s) {
		StringBuffer sb=new StringBuffer(s);
		sb.reverse();
		return s+"|"+sb;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String s="EARTH";
       String res=getImage(s);
       //result is
       System.out.println(res);
      
	}

}
