import java.time.Year;

public class Person {
    protected String name;
    protected String SSN;
    protected int yob; // Year of Birth (Năm sinh)

    public Person(String name, String SSN, int yob) {
        this.name = name;
        this.SSN = SSN;
        this.yob = yob;
    }

    public String getSSN() {
        return SSN;
    }

   public int getAge(){
        return Year.now().getValue() - yob;
   }

    public void change(String newValue) {
        this.name = newValue; // Giả sử `change()` dùng để cập nhật tên
    }

    public void display() {
        System.out.println("Name: " + name + ", SSN: " + SSN + ", Age: " + getAge());
    }
}