import java.io.PrintStream;
import java.util.ArrayList;


import entities.Employee;
import entities.Person;
import entities.Student;
import entities.Payable;

public class Main {
    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();

        people.add(new Employee("Nurzhigit", "Zhunis", "Developer", 4334.4));
        people.add(new Student(1,"Jomart", "Qanat", 3.5));

        printData(people);
    }

    public static void printData(Iterable<Person> people) {
        for (Person person : people) {
            PrintStream printf = System.out.printf(String.valueOf(person), Payable.getPaymentAmount());
        }
    }
}