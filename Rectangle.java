import java.util.Scanner;

public class Rectangle {

  public static void main(String[] args) {

    var option = 1;

    if (option == 1) {
      Option1();
    } else if (option == 2) {
      Option2(args);
    }
  }

  public static void Option1() {
    Scanner scan = new Scanner(System.in);
    System.out.println("What is number 1: ");
    var num1 = scan.nextInt();
    System.out.println("What is number 2: ");
    var num2 = scan.nextInt();
    scan.close();

    var calc = num1 * num2;
    System.out.println("calc: " + num1 + " * " + num2 + " = " + calc);
  }

  public static void Option2(String[] args) {
    var num1 = Integer.parseInt(args[0]);
    var num2 = Integer.parseInt(args[1]);
    var calc = num1 * num2;
    System.out.println("calc: " + num1 + " * " + num2 + " = " + calc);
  }
}
