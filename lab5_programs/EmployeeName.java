package lab5_programs;

class Employee {
	private String firstName;
	private String lastName;
	
	public String getFname() {
		return firstName;
	}
	
	public String getLname() {
		return lastName;
	}
	
	public void setFname(String firstName) {
		this.firstName = firstName;
	}
	
	public void setLname(String lastName) {
		this.lastName = lastName;
	}
}

class InvalidNameException extends Exception {
	InvalidNameException(String s) {
		super(s);
	}
}



public class EmployeeName {
	
	void processName(String firstName, String lastName) throws InvalidNameException {
		if(firstName.isEmpty() && lastName.isEmpty()) {
			throw new InvalidNameException("Employee First & Last name missing");
		} else if(firstName.isEmpty()) {
			throw new InvalidNameException("Employee First name is missing");
		}
		else if(lastName.isEmpty()) {
			throw new InvalidNameException("Employee Last name is missing");
		}
	}
	
	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.setFname("");
		emp.setLname("Pattekar");
		
		EmployeeName ck = new EmployeeName();
		try {
			ck.processName(emp.getFname(), emp.getLname());
			System.out.println("Employee name is " +emp.getFname()+" "+emp.getLname());
		}
		catch(InvalidNameException e) {
			System.out.println("Invalid Name " +e.getMessage());
		}
	}

}
