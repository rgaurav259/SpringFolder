package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@SpringBootApplication
public class EmployeedemostreamApplication {


	static List<Employee> employees = new ArrayList<>();

	static {
		employees.add(new Employee("gaurav","kumar",5000.0,List.of("project1","project2")));
		employees.add(new Employee("saurav","varma",8000.0,List.of("project2","project3")));
		employees.add(new Employee("abhishek","sharma",5000.0,List.of("project3","project4")));

	}

	public static void main(String[] args) {
		SpringApplication.run(EmployeedemostreamApplication.class, args);
		
		//increment salary employee and return listof employe
		List<Employee> increasedSalary = employees.stream()
				.map(employee -> new Employee(
						employee.getFirstName(),
						employee.getLastName(),
						employee.getSalary() * 1.10,
						employee.getProjects()
				)).collect(Collectors.toList());
		System.out.println("increasedSalary. = " + increasedSalary);


		//i want filter data .based on  whose employee sal is greater than 5000;
		List<Employee> collect1 = employees.stream()
				.filter(employee -> employee.getSalary() > 5000.0)
				.map(employee -> new Employee(
						employee.getFirstName(),
						employee.getLastName(),
						employee.getSalary() * 1.20,
						employee.getProjects()
				)).collect(Collectors.toList());
		System.out.println("only employee whose salary is  = " + collect1);

		//find first employee

		Employee collect2 = employees.stream()
				.filter(employee -> employee.getSalary() > 5000.0)
				.map(employee -> new Employee(
						employee.getFirstName(),
						employee.getLastName(),
						employee.getSalary() * 1.20,
						employee.getProjects()
				)).findFirst().orElse(null);
		System.out.println("find first employee is /.............  = " + collect2);



		//all the projets using flat map method reference
		String collect3 = employees.stream()
				.map(Employee::getProjects)
				.flatMap(Collection::stream)
				.collect(Collectors.joining(", "));
		System.out.println("collect3 = " + collect3);

		String collect4 = employees.stream()
				.map(employee1 -> employee1.getProjects())
				.flatMap(strings -> strings.stream())
				.collect(Collectors.joining(", "));
		System.out.println("collect3 = " + collect4);




		//short circuit operations

		List<Employee> shortcircuitsuing = employees.stream()
				.skip(1).
				limit(2).
				collect(Collectors.toList());
//limit 2 and rest of the elements skip directly
		System.out.println("shortcircuitsuing first is skip and limit is 1  = " + shortcircuitsuing);


		//finite data

		Stream.generate(Math::random)
				.limit(5)
				.forEach(value-> System.out.println(value));


		//sorting operation

		List<Employee> employeeListsortedbasedOnName = employees.stream()
				.sorted(((o1, o2) -> o1.getFirstName().
						compareToIgnoreCase(o2.getFirstName())))
				.collect(Collectors.toList());
		System.out.println("employeeListsortedbasedOnName = " + employeeListsortedbasedOnName);

		//min max salary

		Employee employee = employees.stream()
				.max(Comparator.comparing(Employee::getSalary))
				.orElseThrow(NoSuchElementException::new);
		System.out.println("maximum salary of employee = " + employee);



		Employee employeeeee = employees.stream()
				.min(Comparator.comparing(Employee::getSalary))
				.orElseThrow(NoSuchElementException::new);
		System.out.println("minimum salart of employee = " + employeeeee);

		//reduce  total sallary of all employee
		Double reduce = employees.stream()
				.map(employee1 -> employee1.getSalary())
				.reduce(0.0, Double::sum);
		System.out.println("reduce of total sallary = " + reduce);


		//there are  n number of ways to print the employee object

		//usinf for each stream
//		employees.stream()
//				.forEach(System.out::println);//uisng method reference
//
//		employees.stream()
//				.forEach(employee -> System.out.println(employee)); //using lambda
//
//
//
//		List<Employee> collect = new ArrayList<>();
//		for (Employee employee : employees) {
//			collect.add(employee);
//		}
//		System.out.println("collect = " + collect);
//
//		List<Employee> collectss = employees.stream()
//				.collect(Collectors.toList());
//		System.out.println("collect = " + collectss);
//
//
//		List<Employee> collects = new ArrayList<>(employees);
//		System.out.println("collect = " + collects);
//
//
//		for (Employee e : employees){
//			System.out.println("e = " + e);
//		}


		//uncomments code and show the execution
	}

}
