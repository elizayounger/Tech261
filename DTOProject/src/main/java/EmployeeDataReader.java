import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDataReader {

    public static List<String> getEmployeeData() {
        List<String> reader = new ArrayList<>();
        List<String> header = new ArrayList<>();
        try (BufferedReader file = new BufferedReader(new FileReader("src/main/resources/employees.csv"))) {
            String headerLine;
            if ((headerLine = file.readLine()) != null) {
                header.add(headerLine);
            }
            String line;
            while ((line = file.readLine()) != null) {
                reader.add(line);
            }
        } catch (FileNotFoundException e) {
            DTOLogger.logger.warning("FileNotFoundException thrown");
            e.printStackTrace();
        } catch (Exception e) {
            DTOLogger.logger.warning("Exception thrown");
            e.printStackTrace();
        }
        DTOLogger.logger.info("EmployeeData read from employees.csv and returned to App in List<String> format");
        return reader;
    }
}
