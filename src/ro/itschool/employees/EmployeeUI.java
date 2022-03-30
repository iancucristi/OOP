package ro.itschool.employees;

import java.util.Scanner;

public class EmployeeUI {
    public void startProgram() {
        Scanner scanner = new Scanner(System.in);
        EmployeeService employeeService = new EmployeeService();
        int optiune;
        do {
            System.out.println("0.exit");
            System.out.println("1.add employee");
            System.out.println("2.view employees");
            System.out.println("3.remove employee");
            System.out.println("4.change name");
            optiune = scanner.nextInt();
            scanner.nextLine();
            if (optiune == 1) {
                System.out.println("enter cnp");
                int cnp = scanner.nextInt();
                scanner.nextLine();
                System.out.println("enter last name");
                String lastName = scanner.nextLine();
                System.out.println("enter first name");
                String firstName = scanner.nextLine();
                System.out.println("enter position");
                String position = scanner.nextLine();
                Employee employee = new Employee();
                employee.setCnp(cnp);
                employee.setNume(lastName);
                employee.setPrenume(firstName);
                employee.setFunctie(position);
                employeeService.addEmployee(employee);
            } else if (optiune == 2) {
                employeeService.viewEmployee();
            }
            else if (optiune == 3) {
                System.out.println("enter cnp for employee you want to remove");
                int cnp = scanner.nextInt();
                scanner.nextLine();
                employeeService.removeEmployee(cnp);
            }
            else if(optiune == 4){
                System.out.println("enter cnp for employee you want the name to be changed");
                int cnp = scanner.nextInt();
                scanner.nextLine();
                System.out.println("enter new last name");
                String lastName = scanner.nextLine();
                System.out.println("enter new first name");
                String firstName = scanner.nextLine();
                employeeService.changeName(cnp,lastName,firstName);
            }
        } while (optiune != 0);
    }
}
