import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CharConverter {
  public static void main(String[] args) {
    var input = getInput();

    try {
      validateInput(input);
    } catch (Exception e) {
      System.out.println(e.getMessage());
      return;
    }

    int asciiValue = getAsciiValue(input);
    char lowerChar = getLowerChar(input);

    System.out.println("The ASCII value of '" + input + "' is: " + asciiValue);
    System.out.println("The lowercase value of '" + input + "' is: '" + lowerChar + "'");
  }

  public static String getInput() {
    System.out.print("Please enter an uppercase character: ");
    Scanner scan = new Scanner(System.in);
    String input = scan.nextLine();
    scan.close();
    return input;
  }

  public static void validateInput(String input) throws Exception {
    Pattern allowedChars = Pattern.compile("[A-Z]");
    Matcher match = allowedChars.matcher(input);

    if (!match.matches()) {
      throw new Exception("You need to enter a single, uppercase character");
    }
  }

  public static int getAsciiValue(String input) {
    char character = input.charAt(0);
    return (int) character;
  }

  public static char getLowerChar(String input) {
    int asciiValue = getAsciiValue(input);
    return (char) (asciiValue + 32);
  }
}
