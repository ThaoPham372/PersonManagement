public class Student extends Person {
    private String studentID;
    private String classID;
    private double GPA;

    public Student(String name, String SSN, int yob, String studentID, String classID, double GPA) {
        super(name, SSN, yob);
        this.studentID = studentID;
        this.classID = classID;
        this.GPA = GPA;
    }

    public double getGPA() {
        return GPA;
    }

    public void change(String newValue) {
        this.GPA = Double.parseDouble(newValue); // Cập nhật GPA
    }

    public int enrollYear() {
        return Integer.parseInt(studentID.substring(2,4)); // Lấy 2 số trong mã sinh viên làm năm nhập học
    }

    @Override
    public void display() {
        super.display();
        System.out.println("StudentID: " + studentID + ", ClassID: " + classID + ", GPA: " + GPA);
    }
}
