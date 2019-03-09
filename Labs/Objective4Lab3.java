import java.util.Scanner;

public class Objective4Lab3 {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int userNum;

      System.out.println("Please enter a number: ");
      userNum = input.nextInt();

      if (userNum > 0)
      System.out.println("This number is greater than 0");
      else if (userNum < 0)
      System.out.println("This number is smaller than 0");
      else if (userNum == 0)
      System.out.println("This number is equal to zero");
  }
}
