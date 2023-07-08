import java.util.List;

public class Manager extends Employee {
    public Manager(String name, int age, double salary) {
        super(name, age, salary);
    }

    public static void increaseSalary(List<Employee> employees, double percentage) {
        for (Employee employee : employees) {
            if (!(employee instanceof Manager)) {
                employee.increaseSalary(percentage);
            }
        }
    }
}