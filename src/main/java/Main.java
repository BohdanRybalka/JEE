public class Main {
    public static void main(String[] args) {
        try {
            Employee emp = new Employee("Alexey ", "Arestovych", 2500.0);
            emp.PrintEmployee();
        }catch(FieldLengthLimitException ex){
            System.out.println(ex.getMessage());
        }
        catch(IncorrectSalaryException ex){
            System.out.println(ex.getMessage());
        }
    }
}
