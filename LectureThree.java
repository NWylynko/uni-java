import java.util.*;

public class LectureThree {
    public static void main(String[] args) {
        int a = -2, b = 10, c = 3;
        boolean red = false, brown = false, blue = true;

        System.out.println(red);
        System.out.println(a > c);
        System.out.println(red);
        System.out.println((b - a) == c);
        System.out.println(red || brown);
        System.out.println(!(red && brown));
        System.out.println((brown && red) != blue);
        System.out.println((a > c) && blue);
        System.out.println(!(!((b - a) == c)));
        System.out.println(blue && (b != c));
        System.exit(0);
    }
}
