import java.util.*;

public class LectureThreePartThree {
    public static void main(String[] args) {
        char status;
        status = 'G';
        String studentStatus;

        switch (status) {
            case 'G':
                studentStatus = new String("Good Standing");
                break;
            case 'C':
                studentStatus = new String("Conditional");
                break;
            case 'T':
                studentStatus = new String("Terminated");
                break;
            default:
                studentStatus = new String("No Status");
                break;
        }

        System.out.println("Student status is " + studentStatus);
        System.exit(0);
    }
}
