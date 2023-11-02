package hw8.homework8;


import org.springframework.stereotype.Service;

import java.security.SecureRandom;
import java.util.*;

@Service
public class EmployeeService {
    private final Map<String, Employee> employeesMap;
    private int maxEmployees;

    public EmployeeService() {
        employeesMap = new HashMap<>();
    }

    public Employee add (String firstName, String secondName) {
        Employee employee = new Employee(firstName, secondName);
        if (employeesMap.containsKey(employee.getFullName())) {
            throw new EmployeeAlreadyAddedException("EmployeeAlreadyAddedException");
        }
        employeesMap.put(employee.getFullName(), employee);
        return employee;
    }

    public Employee remove (String firstName, String secondName) {
        Employee employee = new Employee(firstName, secondName);
        if (employeesMap.containsKey(employee.getFullName())) {
            employeesMap.remove(employee.getFullName());
            return employee;
        }
        throw new EmployeeAlreadyAddedException("");
    }

    public Employee find (String firstName, String secondName) {
        Employee employee = new Employee(firstName, secondName);
        if (employeesMap.containsKey(employee.getFullName())) {
            return employeesMap.get(employee.getFullName());
        }
        throw new EmployeeAlreadyAddedException("");
    }
    public Collection<Employee> findAll() {
        return Collections.unmodifiableCollection(employeesMap.values());
    }


}
