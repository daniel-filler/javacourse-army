package java8_examples;

import java.util.Arrays;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java8_examples.Seniority.*;

public class EmployeeUtils {
    public static int salariesSum(List<Employee> employeeList){
        return employeeList
                .stream()
                .mapToInt(Employee::getSalary)
                .sum();
    }

    public static String allNames(List<Employee> employeeList){
        return employeeList
                .stream()
                .map(Employee::getName)
                .reduce((employee1, employee2) -> employee1 + "," + employee2)
                .orElse("");
    }



    public static Map<Seniority, List<Employee>> getSeniorityMap(List<Employee> employees){
        return employees
                .stream()
                .collect(Collectors.groupingBy(Seniority::getSeniority));
    }
}
