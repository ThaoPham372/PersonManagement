public class Employee extends Person {
    private double salary;

    public Employee(String name, String SSN, int yob, double salary) {
        super(name, SSN, yob);
        this.salary = salary;
    }

    public void change(String newValue) {
        double percentage = Double.parseDouble(newValue);
        this.salary += this.salary * percentage; // Tăng lương theo phần trăm
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Salary: " + salary);
    }
}
