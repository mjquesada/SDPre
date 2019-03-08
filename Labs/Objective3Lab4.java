import java.util.Scanner;

public class Objective3Lab4 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    String firstName;
    String lastName;
    int age;

    System.out.println("What is your first name?");
    firstName = input.next();

    System.out.println("What is your last name?");
    lastName = input.next();

    System.out.println("What is your age?");
    age = input.nextInt();

    System.out.println("First name: " + firstName + ", " + "Last Name: " +
                        lastName + ", " + "Age: " + age);

    input.close();
  }
}
