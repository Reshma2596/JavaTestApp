import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class StudentFilter {

	public static void main(String[] args) {
		List<String> students = Arrays.asList("Alice", "Bob", "Anna", "David", "Ava", "Charlie", "Andrew", "Sophia", "Alan", "James");

       
        List<String> filteredStudents = students.stream()
                                                .filter(name -> name.startsWith("A"))
                                                .collect(Collectors.toList());

        System.out.println("Students eligible for gifts: " + filteredStudents);
    }
}
