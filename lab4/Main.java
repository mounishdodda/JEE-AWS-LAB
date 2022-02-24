package myInherPoli;

public class Main {

	public static void main(String[] args) {
		
		//step a
		Account smith=new Account(1,2000,"smith");
		Account kathy=new Account(2,3000,"kathy");
		
		//step b
		smith.Deposit(2000);
		
		//step c
		kathy.withDraw(2000);
		
		//step d
		smith.getBalance();
		kathy.getBalance();
		

	}

}
