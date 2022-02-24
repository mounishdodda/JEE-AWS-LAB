package myArrays;

public class Exercise1 {
	
	static int getSecond(int[] a) {
		int temp=0;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[j]>a[i]) {
					temp=a[j];
					a[j]=a[i];
					a[i]=temp;
				}
			}
		}
		for(int x:a) {
			System.out.print(x+" ");
			}
		System.out.println();
		return a[1];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Program to sort the array
		int[] a= {77,52,1,105,500};
		int x=getSecond(a);
		System.out.println(x);
	}

}
