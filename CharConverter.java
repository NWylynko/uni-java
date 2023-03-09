import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CharConverter {
  public static void main(String[] args) {
    System.out.print("Please enter an uppercase character: ");
    Scanner scan = new Scanner(System.in);
    String input = scan.nextLine();
    scan.close();

    Pattern allowedChars = Pattern.compile("[A-Z]");
    Matcher match = allowedChars.matcher(input);

    if (!match.matches()) {
      System.out.println("You need to enter a single, uppercase character");
      return;
    }

    char character = input.charAt(0);
    int asciiValue = (int) character;
    char lowerChar = (char) (asciiValue + 32);

    System.out.println("The ASCII value of '" + input + "' is: " + asciiValue);
    System.out.println("The lowercase value of '" + input + "' is: '" + lowerChar + "'");
  }
}
