import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class EmployeeDataReaderTest {

    @Mock
    private BufferedReader mockBufferedReader;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testGetEmployeeData() throws Exception {
        // Create mock data
        String headerLine = "ID,Name,Position";
        String employee1 = "1,John Doe,Developer";
        String employee2 = "2,Jane Smith,Designer";

        // Mock BufferedReader behavior
        when(mockBufferedReader.readLine())
                .thenReturn(headerLine)
                .thenReturn(employee1)
                .thenReturn(employee2)
                .thenReturn(null);

        // Mock FileReader to return the mocked BufferedReader
        FileReader fileReader = mock(FileReader.class);
        whenNew(FileReader.class).withArguments("src/main/resources/employees.csv").thenReturn(fileReader);
        when(fileReader.read()).thenReturn(mockBufferedReader);

        // Call the method under test
        List<String> employeeData = EmployeeDataReader.getEmployeeData();

        // Verify the result
        assertEquals(2, employeeData.size());
        assertEquals(employee1, employeeData.get(0));
        assertEquals(employee2, employeeData.get(1));
    }
}
