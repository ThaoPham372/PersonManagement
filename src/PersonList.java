import java.util.*;

public class PersonList {
    private List<Person> personList = new ArrayList<>();

    public void addNew(Person person) {
        personList.add(person);
    }

    public void update(String SSN, String newValue) {
        for (Person person : personList) {
            if (person.getSSN().equals(SSN)) {
                person.change(newValue);
                break;
            }
        }
    }

    public void delete(String SSN) {
        personList.removeIf(person -> person.getSSN().equals(SSN));
    }

    public void sortByAge() {
        personList.sort(Comparator.comparingInt(Person::getAge));
    }

    public double getMaxGPA() {
        double maxGPA = 0.0;
        for (Person person : personList) {
            if (person instanceof Student) {
                Student student = (Student) person;
                if (student.getGPA() > maxGPA) {
                    maxGPA = student.getGPA();
                }
            }
        }
        return maxGPA;
    }

    public void displayAll() {
        for (Person person : personList) {
            person.display();
        }
    }
}
