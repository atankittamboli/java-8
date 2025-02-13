package stream_Hard;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import model.Employee;

public class EmployeeObjectToNameList {

//	1:-Transform List of Employees: Given a list of Employee objects,
//	use map to create a list of their names.
	public static void main(String[] args) {
		
		List<Employee> listEmployee = new ArrayList<Employee>();
		
		Employee employee1 = new Employee("A", "1", "IT");
		Employee employee2 = new Employee("B", "1", "IT");
		Employee employee3 = new Employee("c", "2", "HR");
		Employee employee4 = new Employee("D", "2", "HR");
		Employee employee5 = new Employee("E", "3", "Finance");
		Employee employee6 = new Employee("F", "3", "Finance");
		Employee employee7 = new Employee("G", "3", "Finance");
		
		listEmployee.add(employee7);
		listEmployee.add(employee6);
		listEmployee.add(employee5);
		listEmployee.add(employee4);
		listEmployee.add(employee3);
		listEmployee.add(employee2);
		listEmployee.add(employee1);

		List<String> list = listEmployee.stream()
				.map(employee -> employee.firstName)
				.collect(Collectors.toList());
		
		System.out.println(list);
	}

}
