import java.util.Scanner;

public class BMICalculator {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    double m;
    double kg;
    double bmi;

    System.out.print("Your height in m:");
    m = keyboard.nextDouble();

    System.out.print("Your height in kg:");
    kg = keyboard.nextDouble();

    bmi = kg / (m*m);

    System.out.println("Your BMI is " + bmi);
  }
}
