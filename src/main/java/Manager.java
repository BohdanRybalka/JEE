import java.util.ArrayList;

public class Manager extends Employee{
    private double bonus;

    public double getBonus(){
        return bonus;
    }

    public Manager(){
        bonus = 0;
    }

    public Manager(String name,String surname, double salary, double bonus) throws FieldLengthLimitException, IncorrectSalaryException {
        nextId++;
        this.id=nextId;
        this.bonus = bonus;

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

        if(salary < 0 || bonus < 0){
            throw new IncorrectSalaryException("Salary or bonus cannot be less than zero!");
        }
        else{
            this.salary = salary;
        }

        subordinates = new ArrayList<Employee>();
    }

    void PrintEmployee(){
        System.out.println("ID: " + id + " Name: " + name + surname + " Salary: " + salary + " Bonus: " + getBonus());
    }

}
