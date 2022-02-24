package myArrays;

public class Exercise4 {

	static int[] removeDupli(int[] arr) {
		int[] res=new int[arr.length];
		int cont=0;
		for(int i=0;i<arr.length;i++) {
			boolean flag=false;
			int x=arr[i];
			for(int j=i+1;j<arr.length;j++) {
				if(x==arr[j]) {
					flag=true;
					break;
				}
			}
			if(flag==false) {
			res[cont]=x;
			cont++;
			}
		}
		return res;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //Removing the duplicates from array
		int[] a= {1,5,8,5,12,18,8,20,1};
		int[] b=removeDupli(a);
		for(int x:b) {
			if(x!=0) {
			System.out.print(x+" ");
		}
	}
		}

}
