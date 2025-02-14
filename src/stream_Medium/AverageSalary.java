package stream_Medium;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

import model.Employee;

public class AverageSalary {

	public static void main(String[] args) {
		// test
		List<Employee> listEmployee = new ArrayList<Employee>();

		Employee employee1 = new Employee("A", "1", "IT", 10000);
		Employee employee2 = new Employee("B", "1", "IT", 11000);
		Employee employee3 = new Employee("c", "2", "HR", 33000);
		Employee employee4 = new Employee("D", "2", "HR", 45000);
		Employee employee5 = new Employee("E", "3", "Finance", 22000);
		Employee employee6 = new Employee("F", "3", "Finance", 22000);
		Employee employee7 = new Employee("G", "3", "Finance", 25000);
		
		listEmployee.add(employee7);
		listEmployee.add(employee6);
		listEmployee.add(employee5);
		listEmployee.add(employee4);
		listEmployee.add(employee3);
		listEmployee.add(employee2);
		listEmployee.add(employee1);
		
		
		OptionalDouble result = listEmployee.stream()
				.mapToInt(Employee::getSalary).average();
		System.out.println(result);

		
		List<Employee> listEmployeeSalary = listEmployee.stream().sorted((a,b)-> Integer
				.compare(a.getSalary(), b.getSalary()))
		.collect(Collectors.toList());
		
			System.out.println(listEmployeeSalary);
		
		
			List<Integer> increaseSalary = listEmployee.stream()
					.sorted((a,b)-> Integer.compare(a.getSalary(), b.getSalary()))
					.map(i-> i.getSalary()+1000).collect(Collectors.toList());

			System.out.println(increaseSalary);
			
			
	}

}
