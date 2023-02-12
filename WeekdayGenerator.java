import java.util.Scanner;

public class WeekdayGenerator {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int number = sc.nextInt();
    sc.close();
    int weekday = (number % 7);
    switch (weekday) {
      case 1:
        System.out.println("Sunday");
        break;
      case 2:
        System.out.println("Monday");
        break;
      case 3:
        System.out.println("Tuesday");
        break;
      case 4:
        System.out.println("Wednesday");
        break;
      case 5:
        System.out.println("Thursday");
        break;
      case 6:
        System.out.println("Friday");
        break;
      case 0:
        System.out.println("Saturday");
        break;
      default:
        System.out.println("Invalid weekday");
        break;
    }
  }
}
