import java.util.*;

public class LectureThreePartTwoB {
    public static void main(String[] args) {
        final double MYTOLERANCE = 0.000001;
        double low = 1.0988374;
        double high = 1.1;

        if ((high - low) < MYTOLERANCE) {
            System.out.println("Values are the same.");
        } else {
            System.out.println("Values are NOT too close but close enough.");
            if ((high - low) > 0.01) {
                System.out.println("Here");
            } else {
                System.out.println("There!!");
            }
        }
    }
}
