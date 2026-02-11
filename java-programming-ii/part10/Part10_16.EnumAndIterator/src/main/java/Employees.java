import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class Employees {
    List<Person> employees;

    public Employees() {
        this.employees = new ArrayList<>();
    }

    public void add(Person personToAdd) {
        employees.add(personToAdd);
    }

    public void add(List<Person> peopleToAdd) {
        employees.addAll(peopleToAdd);
    }

    public void print() {
        employees.forEach(System.out::println);
    }

    public void print(Education education) {
        Iterator<Person> iterator = employees.iterator();

        while (iterator.hasNext()) {
            Person nextPerson = iterator.next();

            if (nextPerson.getEducation().equals(education)) {
                System.out.println(nextPerson);
            }
        }
    }

    public void fire(Education education) {
        Iterator<Person> iterator = employees.iterator();

        while (iterator.hasNext()) {
            Person nextPerson = iterator.next();

            if (nextPerson.getEducation().equals(education)) {
                iterator.remove();
            }
        }
    }
}
