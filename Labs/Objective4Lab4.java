import java.util.Scanner;

  public class Objective4Lab4 {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      int userInput = 0;

      System.out.println("Please enter a number: ");
      userInput = input.nextInt();

      if (userInput % 2 == 0)
      System.out.println("This number is even");
      else if (userInput % 1 == 0)
      System.out.println("This number is odd");
    }
  }
