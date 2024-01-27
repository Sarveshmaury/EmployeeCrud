package Employee.Crud;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;

public class EmployeeService {
	private static Map<Long,Employee> employees =new HashMap<>();
	private static Long index=5L;
	
	static {
		Employee employee1=new Employee(1L,"Sarvesh Maurya","9120683163",23400L);
		Employee employee2=new Employee(2L,"Akula Tejaswi","9120680003",43400L);
		Employee employee3=new Employee(3L,"Epshika Patnaik","9000683163",23400L);
		Employee employee4=new Employee(4L,"Bharat Chopale","9220683163",23400L);
		Employee employee5=new Employee(5L,"sujal Kumar","9120681113",23400L);
		
		employees.put(1L, employee1);
		employees.put(2L, employee2);
		employees.put(3L, employee3);
		employees.put(4L, employee4);
		employees.put(5L, employee5);
		
	}
	
	public static List<Employee> getAllEmployee(){
		return new ArrayList<>(employees.values());
	}
	
	public static Employee getEmployeeDetails(Long employeeId) {
		return employees.get(employeeId);
	}
	
	public static Employee addEmployee(Employee employee) {
		index+=1;
		employee.setId(index);
		employees.put(index, employee);
		return employee;
	}
	
	public static Employee updateEmployee(Long employeeId , Employee employee) {
		employee.setId(employeeId);
		employees.put(employeeId, employee);
		return employee;
	}
	public static Employee deleteEmployee(Long employeeId) {
		return employees.remove(employeeId);
	}

}
