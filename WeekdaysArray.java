import java.util.Scanner;

public class WeekdaysArray {
    public static void main(String[] args) {
        String[] weekdays = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter day position (0-6): ");
            int index = scanner.nextInt();
            if (index < 0 || index > 6) {
                throw new ArrayIndexOutOfBoundsException("Invalid index! Enter a number between 0 and 6.");
            }
            System.out.println("Day: " + weekdays[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception: " + e.getMessage());
        }
        scanner.close();
    }
}
