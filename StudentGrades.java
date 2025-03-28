import java.util.HashMap;
import java.util.Scanner;

public class StudentGrades {
    private HashMap<String, Integer> studentGrades = new HashMap<>();

   
    public void addStudent(String name, int grade) {
        studentGrades.put(name, grade);
        System.out.println("Student added successfully.");
    }

    
    public void removeStudent(String name) {
        if (studentGrades.containsKey(name)) {
            studentGrades.remove(name);
            System.out.println("Student removed successfully.");
        } else {
            System.out.println("Student not found.");
        }
    }

   
    public void displayGrade(String name) {
        if (studentGrades.containsKey(name)) {
            System.out.println(name + "'s Grade: " + studentGrades.get(name));
        } else {
            System.out.println("Student not found.");
        }
    }

  
    public static void main(String[] args) {
        StudentGrades sg = new StudentGrades();
        Scanner scanner = new Scanner(System.in);

        sg.addStudent("John", 85);
        sg.addStudent("Alice", 90);
        sg.displayGrade("John");
        sg.removeStudent("Alice");
        sg.displayGrade("Alice");

        scanner.close();
    }
}
