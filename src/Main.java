import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add Person");
            System.out.println("2. Display People");
            System.out.println("3. Sort People by Name");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter person's name: ");
                    String name = scanner.next();
                    Person person = new Person(name);
                    people.add(person);
                    System.out.println("Person added successfully.");
                    break;

                case 2:
                    System.out.println("People List:");
                    for (Person p : people) {
                        System.out.println(p.getName());
                    }
                    break;

                case 3:
                    // TODO: Sort the people list by name
                    // Use the Collections.sort() method and a custom comparator
                    // Hint: Look into Comparator.comparing() method to specify the key to compare
                    Collections.sort(people, Comparator.comparing(Person::getName));
                    break;

                case 4:
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}


// Complete the next code
// In this example, the program allows you to add people, display the list of people, and sort the people list by name.
// Here's what you need to do:
// Implement the Comparator interface for sorting the people list by name in the case 3 block.
// Inside the case 3 block, use the Collections.sort() method along with a custom comparator to sort the people list.
// Use the Comparator.comparing() method to specify the key to compare, which in this case is the person's name.
// Feel free to remove any unnecessary code or add more functionality if desired. This exercise will give you hands-on practice with collections and sorting in Java.
