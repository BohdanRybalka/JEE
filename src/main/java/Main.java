public class Main {
    public static void main(String[] args) throws FieldLengthLimitException, IncorrectSalaryException, EmployeeInRegistryException {
        try {
            ManageEmployees employees = ManageEmployees.getRegistry();

            Employee qa_engineer_1 = new Employee("Alexey ", "Arestovych", 500);
            Employee qa_engineer_2 = new Employee("Bombi ", "Kalibi", 500);
            Employee qa_lead = new Employee("Bob ", "Marley", 1200);
            Manager manager = new Manager("John", "Talkie", 4000, 1200);

            employees.addEmployee(qa_engineer_1);
            employees.addEmployee(qa_engineer_2);
            employees.addEmployee(qa_lead);
            employees.addEmployee(manager);

            qa_lead.addSubordinate(qa_engineer_1);
            qa_lead.addSubordinate(qa_engineer_2);
            manager.addSubordinate(qa_lead);

            manager.PrintEmployee();

            for( Employee subordinate: manager.getSubordinates()){
                subordinate.PrintEmployee();
                for( Employee subordinate_2: subordinate.getSubordinates()){
                    subordinate_2.PrintEmployee();
                }
            }

            System.out.print("\n");

            qa_lead.removeSubordinate(qa_engineer_1);
            for( Employee subordinate: qa_lead.getSubordinates()){
                subordinate.PrintEmployee();
            }

        }catch(FieldLengthLimitException ex){

            System.out.println(ex.getMessage());

        }
        catch(IncorrectSalaryException ex){

            System.out.println(ex.getMessage());

        }
    }
}