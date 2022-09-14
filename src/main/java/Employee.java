public class Employee {
    private int id;
    private int nextId;
    String name;
    String surname;
    double salary;

    public Employee(String name){
        this.id=nextId++;
        this.name = name;
    }

    void PrintEmployee(){
        System.out.println("ID: "+id+"\nName: "+name);
    }

}
