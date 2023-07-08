import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Manager("John", 35, 50000));
        employees.add(new Employee("Peter", 28, 30000));
        employees.add(new Employee("Anna", 32, 40000));

        Manager.increaseSalary(employees, 10);

        for (Employee employee : employees) {
            System.out.println("Name: " + employee.getName());
            System.out.println("Age: " + employee.getAge());
            System.out.println("Salary: " + employee.getSalary());
            System.out.println();
        }
    }
}