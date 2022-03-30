package ro.itschool.employees;

import ro.itschool.io.Computer;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ObjectIO {


    public List<Employee> readEmployees() {
        File file = new File("E:\\io\\employees.txt");
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            List<Employee> employees = (List<Employee>) objectInputStream.readObject();
            return employees;
        } catch (FileNotFoundException e) {
            System.out.println("no employees yet");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return new ArrayList<>();
    }

    public void writeEmployee(List<Employee> employee) {

        File file = new File("E:\\io\\employees.txt");
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(employee);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
