public class Objective6Lab3 {
  public static void main(String[] args) {
    int counter = 1;

    while(counter <= 20) {
      System.out.println(counter);
      if (counter % 2 == 0) {
      System.out.println(counter + "is odd");
    }
      else if (counter % 1 == 0) {
      System.out.println(counter + "is even");
    }
      counter = counter + 1;
  }
}
