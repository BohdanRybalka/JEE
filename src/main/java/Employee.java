public class Employee {
    private int id;
    private int nextId;
    String name;
    String surname;
    double salary;

    public Employee(String name,String surname, double salary) throws FieldLengthLimitException, IncorrectSalaryException {
        this.id=nextId++;
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

    }

    void PrintEmployee(){
        System.out.println("ID: " + id + " Name: " + name + surname + " Salary: " + salary);
    }

}
