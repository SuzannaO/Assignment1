import java.util.Scanner;

public class ExamResults {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Write the grade level");
        char grade = input.next().charAt(0);
        switch (grade) {
            case 'A', 'B':
                System.out.println("Perfect! You are so clever!");
                break;
            case 'C':
                System.out.println("Good! But You can do better!");
                break;
            case 'D', 'E':
                System.out.println("It is not good! You should not study!");
                break;
            case 'F':
                System.out.println("Fail! You need to repeat the exam!");
                break;
            default:
                System.out.println("Please add the default case in the code!");
                break;
        }
    }
}
