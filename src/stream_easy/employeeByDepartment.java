package stream_easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import model.Employee;

public class employeeByDepartment {

	public static void main(String[] args) {
		
		List<Employee> listEmployee = new ArrayList<Employee>();
		
		Employee employee1 = new Employee("A", "1", "IT", 10001);
		Employee employee2 = new Employee("B", "1", "IT", 100);
		Employee employee3 = new Employee("c", "2", "HR", 100011);
		Employee employee4 = new Employee("D", "2", "HR", 100);
		Employee employee5 = new Employee("E", "3", "Finance", 10099);
		Employee employee6 = new Employee("F", "3", "Finance", 10037);
		Employee employee7 = new Employee("G", "3", "Finance", 10002);
		
		listEmployee.add(employee7);
		listEmployee.add(employee6);
		listEmployee.add(employee5);
		listEmployee.add(employee4);
		listEmployee.add(employee3);
		listEmployee.add(employee2);
		listEmployee.add(employee1);
		
		
		 Map<String, Long> departmentCount = listEmployee.stream().collect(
				 Collectors.groupingBy(Employee::getDepartmentName,
						 Collectors.counting()));
		
		 departmentCount.forEach((department, count) -> 
		 System.out.println(department + " is " + count));
		 
		 List<String> ls = listEmployee.stream()
				 .sorted((a,b)-> Integer.compare(a.getSalary(), b.getSalary()))
				 .map(i-> i.getFirstName())
				 .collect(Collectors.toList());
		 
		 System.out.println(" ls " + ls);
		 
	}

}
