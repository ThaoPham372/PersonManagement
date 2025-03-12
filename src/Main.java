public class Main {
    public static void main(String[] args) {
        PersonList personList = new PersonList();

        // Thêm Student và Employee vào danh sách
        personList.addNew(new Student("Thảo", "S123", 2005, "DE191234", "19A", 3.8));
        personList.addNew(new Student("Nam", "S124", 2004, "DE191235", "19B", 3.5));
        personList.addNew(new Employee("Linh", "E567", 1990, 5000.0));

        System.out.println("---- Danh sách ban đầu ----");
        personList.displayAll();

        // Cập nhật GPA của Thảo
        personList.update("S123", "4.0");

        // Xóa Nam khỏi danh sách
        personList.delete("S124");

        // Sắp xếp danh sách theo tuổi
        personList.sortByAge();

        // Lấy GPA cao nhất
        double maxGPA = personList.getMaxGPA();
        System.out.println("GPA cao nhất: " + maxGPA);

        System.out.println("===== Danh sách sau khi cập nhật =====");
        personList.displayAll();
    }
}