import java.util.Scanner;

public class CelsToFaren {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Please enter the Celcius: ");
    var cels = scan.nextInt();
    scan.close();

    var multiplier = 9.0 / 5.0;
    var faren = multiplier * cels + 32;

    System.out.println(cels + "º celcius is " + faren + "º fahrenheit");
  }
}
