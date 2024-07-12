import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class App {
    public static void main(String[] args) {
        List<String> employees = EmployeeDataReader.getEmployees();
        for (String employee : employees) {
            System.out.println(employee);
        }

        List<String> cleanEmployees;

        Set<String> prefixes = new HashSet<>();

        for (String employee : employees) {
            String[] splitString = employee.split(",");
            prefixes.add(splitString[1]);
        }

        for (String prefix : prefixes) {
            System.out.println(prefix);
        }
    }
}
