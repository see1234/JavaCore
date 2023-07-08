import java.util.Comparator;

class AgeComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee employee1, Employee employee2) {
        return Integer.compare(employee1.getAge(), employee2.getAge());
    }
}

class SalaryComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee employee1, Employee employee2) {
        return Double.compare(employee1.getSalary(), employee2.getSalary());
    }
}