import java.util.Scanner;

public class Rectangle {

  public static void main(String[] args) {

    var option = "user";

    if (option == "user") {
      UserInputRectangle();
    } else if (option == "cli") {
      CliInputRectangle(args);
    }
  }

  public static void UserInputRectangle() {
    Scanner scan = new Scanner(System.in);
    System.out.println("What is number 1: ");
    var num1 = scan.nextInt();
    System.out.println("What is number 2: ");
    var num2 = scan.nextInt();
    scan.close();

    var calc = num1 * num2;
    System.out.println("calc: " + num1 + " * " + num2 + " = " + calc);
  }

  public static void CliInputRectangle(String[] args) {
    var num1 = Integer.parseInt(args[0]);
    var num2 = Integer.parseInt(args[1]);
    var calc = num1 * num2;
    System.out.println("calc: " + num1 + " * " + num2 + " = " + calc);
  }
}
