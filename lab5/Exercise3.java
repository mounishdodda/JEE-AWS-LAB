package lab5;

class EmployeeException extends Exception{
	
	
	EmployeeException(String str){
		super(str);
		//System.out.println(str);
	}
	
	
}
public class Exercise3 {
	

	String name;
	double salary;
	
	Exercise3(String name,double salary){
		this.name=name;
		try {
		if(salary<3000) {
			throw new EmployeeException(this.name+" salary is less than 3000");
		}
		else {
		this.salary=salary;
		System.out.println(this.name+" Your salary "+this.salary+" is valid");
		}
		}
		catch(EmployeeException e) {
			e.printStackTrace();
		}
	}
	
	
	public static void main(String[] args) throws EmployeeException{
		
		
		Exercise3 e1=new Exercise3("Ram",4000);
		Exercise3 e2=new Exercise3("Mounish",2000); 
		Exercise3 e3=new Exercise3("Mahesh",5200); 
		Exercise3 e4=new Exercise3("Virat",1800); 
			
	}

}

