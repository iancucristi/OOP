package ro.itschool.employees;

import java.util.List;

public class EmployeeService {
    private ObjectIO objectIO = new ObjectIO();

    public void addEmployee(Employee employee) {
        List<Employee> existingEmployees = objectIO.readEmployees();
        existingEmployees.add(employee);
        objectIO.writeEmployee(existingEmployees);

    }

    public void viewEmployee() {
        List<Employee> employees = objectIO.readEmployees();
        for (Employee employee : employees) {
            System.out.println(employee.getCnp() + ", " + employee.getNume() + ", " + employee.getPrenume() + ", " + employee.getFunctie());
        }

    }

    public void removeEmployee(int cnp) {
        List<Employee> existingEmployees = objectIO.readEmployees();
        for (Employee employee : existingEmployees) {
            if (employee.getCnp() == cnp) {
                existingEmployees.remove(employee);
            }
            objectIO.writeEmployee(existingEmployees);
        }
    }

    public void changeName(int cnp, String lastName, String firstName) {
        List<Employee> existingEmployees = objectIO.readEmployees();
        for (Employee employee : existingEmployees) {
            if (employee.getCnp() == cnp) {
                employee.setNume(lastName);
                employee.setPrenume(firstName);
            }
        }
        objectIO.writeEmployee(existingEmployees);
    }
}


