package myInherPoli;

public class Account implements SavingAcc,CurrentAcc{
	
	long accNum;
	double balance;
	Person accHolder=new Person();
	
	Account(){};
	
	Account(long accNum,double balance,String name){
		this.accNum=accNum;
		this.balance=balance;
		this.accHolder.name=name;
	}
	
	void Deposit(double d1) {
		this.balance=this.balance+d1;
		System.out.println("Deposit done successfully");
	}
	
	void withDraw(double d2) {
		this.balance=this.balance-d2;
		System.out.println("Withdraw done successfully");
	}
	
	double getBalance() {
		System.out.println("The balance is->"+this.balance);
		return this.balance;
	}

	public long getAccNum() {
		return accNum;
	}

	public void setAccNum(long accNum) {
		this.accNum = accNum;
	}

	public Person getAccHolder() {
		return accHolder;
	}

	public void setAccHolder(Person accHolder) {
		this.accHolder = accHolder;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
	

}
