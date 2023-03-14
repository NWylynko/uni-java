import java.util.*;

public class LectureThreePartTwo {
    public static void main(String[] args) {
        int x = 3;
        int y = 123;
        int result = 0;

        result = x - y;

        if (result < 0) {
            System.out.println("Inside the IF-THEN Statement.");
            result = -result;
            System.out.println("Inside IF tHEN The value in result is: " + result);
        }
        int davidsAge = 124567;
        System.out.println("Outside the IF-THEN Statement.");
        System.out.println("The value in result is: " + result);
    }
}
