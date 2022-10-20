import java.util.ArrayList;

public class Employee {
    protected int id;
    protected static int nextId = 0;
    String name;
    String surname;

    String dept;
    double salary;

    ArrayList<Employee> subordinates;

    public Employee(){
        name = "";
        surname = "";
        dept = "";
        salary = 0;
    }

    public int getId(){
        return id;
    }

    public Employee(String name,String surname, double salary) throws FieldLengthLimitException, IncorrectSalaryException {
        nextId++;
        this.id = nextId;

        if(name.length()>15){
            throw new FieldLengthLimitException("Too much symbols in name!");
        }
        else{
            this.name = name;
        }

        if(surname.length()>25){
            throw new FieldLengthLimitException("Too much symbols in surname!");
        }
        else{
            this.surname = surname;
        }

        if(salary < 0){
            throw new IncorrectSalaryException("Salary cannot be less than zero!");
        }
        else{
            this.salary = salary;
        }
        this.subordinates = new ArrayList<Employee>();
    }

    public void addSubordinate(Employee emp) {
        subordinates.add(emp);
    }

    public void removeSubordinate(Employee emp) {
        subordinates.remove(emp);
    }

    public ArrayList<Employee> getSubordinates() {
        return subordinates;
    }

    void PrintEmployee(){
        System.out.println("ID:" + id + " Name: " + name + surname + " Salary: " + salary);
    }

}