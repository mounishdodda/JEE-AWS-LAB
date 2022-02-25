package day9;
import java.util.*;
interface intf1{
	int getSquare(int n);
}

interface intf2{
	String getConcat(String s1,String s2);
}

interface intf3{
	void printArraylist(ArrayList a);
}

interface intf4{
	void getGreater50(ArrayList a);
}

interface intf5{
	void getEven(ArrayList a);
}

interface intf6{
	void getSort(ArrayList a);
}
public class MyLambda {

	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<>();
    	al.add(10);
    	al.add(40);
    	al.add(50);
    	al.add(70);
    	al.add(40);
    	al.add(80);
    	al.add(35);
    	al.add(35);
    	al.add(80);
     
		
		//Square of number
        intf1 i1=(int n)-> n*n;
        System.out.println(i1.getSquare(5));
        System.out.println(i1.getSquare(4));
        System.out.println();
		
        //Concatenate Strings
        
        intf2 i2=(String s1,String s2)-> s1+" "+s2;
        System.out.println(i2.getConcat("mounish", "Reddy"));
        System.out.println();
        
        //Interating array list
        intf3 i3=(ArrayList a) -> {
        	for(Object x:a) {
        		System.out.print(x+" ");
        	}
        };
        i3.printArraylist(al);
        System.out.println();
         
    	//Print numbers > 50
    	 intf4 i4=(ArrayList a)->{
    		for(Object x:a) {
    			if((Integer)x >50) {
    				System.out.print(x+" ");
    			}
    		}
    	};
    	i4.getGreater50(al);
    	System.out.println();
    	
    	//return even numbers
    	intf5 i5=(ArrayList a)->{
    		for(Object x:a) {
    			if(((Integer)x % 2) ==0) {
    				System.out.print(x+" ");
    			}
    		}
    	};    	
    	i5.getEven(al);
    	System.out.println();
    	
    	//min max  sort
    	intf6 i6=(ArrayList a)->{
    		Collections.sort(a);
    		System.out.println("sorted ArraList->"+a);
    		System.out.println("Min value is->"+a.get(0));
    		System.out.println("Max value is->"+a.get(a.size()-1));
    		
    	};  
    	i6.getSort(al);
    	
	}

}
