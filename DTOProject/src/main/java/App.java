import java.util.List;

public class App {
    public static void main(String[] args) {
        List<String> employees = EmployeeDataReader.getEmployeeData();

    }
}


//for (String employee : employees) {
//        System.out.println(employee);
//        }
//
//List<String> cleanEmployees;
//
//Set<String> prefixes = new HashSet<>();
//
//        for (String employee : employees) {
//String[] splitString = employee.split(",");
//            prefixes.add(splitString[1]);
//        }
//
//                for (String prefix : prefixes) {
//        System.out.println(prefix);
//        }