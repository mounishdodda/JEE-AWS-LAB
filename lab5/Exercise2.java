package lab5;

class UserNameException extends Exception{
	
	UserNameException(String str){
		super(str);
	}
	
}

public class Exercise2 {
	
	String firstname;
	String middlename;
	String lastname;
	
	 Exercise2(String firstname,String middlename,String lastname){
		try {
		
		if(firstname=="") {
			throw new UserNameException("Please enter the First name ");
		}
		else if(lastname=="") {
			throw new UserNameException("Please enter the Last name ");
		}
		else {
			this.firstname=firstname;
			this.middlename=middlename;
			this.lastname=lastname;
			
			System.out.println("user->"+firstname+middlename+lastname+" Valid user");
		}
		
	 }
	catch(UserNameException e) {
		e.printStackTrace();
	}
	}	

	public static void main(String[] args) {
		
		Exercise2 e1=new Exercise2("Mounish","Reddy","Dodda");
		Exercise2 e2=new Exercise2("siva","Kesava","");
		Exercise2 e3=new Exercise2("","Kumar","Dodda");
		Exercise2 e4=new Exercise2("Ravi","Reddy","challa");
	}

}
