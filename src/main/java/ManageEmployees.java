import java.util.ArrayList;

public class ManageEmployees {
    private static ManageEmployees instance = null;
    private final ArrayList<Employee> workers = new ArrayList<Employee>();
    private ManageEmployees() {

    }

    public static ManageEmployees getRegistry() {
        if (instance == null) {
            instance = new ManageEmployees();
        }

        return instance;
    }

    public void addEmployee(Employee employee) throws EmployeeInRegistryException {
        if (workers.size() == 0) {
            workers.add(employee);
        } else {
            for (Employee emp : workers) {
                if (emp.getId() == employee.getId()) {
                    throw new EmployeeInRegistryException("Employee has been already added!");
                }
            }
            workers.add(employee);
        }
    }

    public void printList() {
        if (workers.size() == 0) {
            System.out.println("No employees were hired");
        } else {
            System.out.println("Employees list:");
            for (Employee employee : workers) {
                employee.PrintEmployee();
            }
        }
    }
}