package lab4.com.cg.eis.service;

import lab4.com.cg.eis.bean.Employee;

public interface EmployeeService {
	
	public Employee getEmpDetails();
	public String insuranceScheme(String designation, double Salary);
	public void EmpDetails(Employee emp);

}
