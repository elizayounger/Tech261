import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestEmployeeDataReader {

    // successfully returns List<String> of employees when called

    @DisplayName("Given csv file, returns the data as a List<String>")
    @ParameterizedTest
    @CsvSource({
            "293375,Mr.,Jarred,C,Dews,M,jarred.dews@gmail.com,12/20/1970,1/28/2009,183406",
            "707693,Hon.,Blake,X,Heredia,M,blake.heredia@gmail.com,1/23/1976,04/04/2005,148091",
            "784563,Mr.,Wally,F,Barbour,M,wally.barbour@gmail.com,05/12/1978,01/10/2010,121605",
            "538924,Mrs.,Hiroko,L,Gupta,F,hiroko.gupta@gmail.com,07/07/1977,09/09/2001,188357",
            "154258,Prof.,Marlon,Z,Ney,M,marlon.ney@yahoo.co.uk,6/19/1990,11/09/2011,136216",
            "173003,Mrs.,Willia,Q,Weigand,F,willia.weigand@gmail.com,10/20/1960,7/30/2005,158292",
            "133641,Mr.,Chas,F,Hurdle,M,chas.hurdle@gmail.com,4/20/1995,5/28/2016,45102"
    })
    public void givenCSVFileReturnsList() {
        String[] stringExpected = {
            "293375,Mr.,Jarred,C,Dews,M,jarred.dews@gmail.com,12/20/1970,1/28/2009,183406",
            "707693,Hon.,Blake,X,Heredia,M,blake.heredia@gmail.com,1/23/1976,04/04/2005,148091",
            "784563,Mr.,Wally,F,Barbour,M,wally.barbour@gmail.com,05/12/1978,01/10/2010,121605",
            "538924,Mrs.,Hiroko,L,Gupta,F,hiroko.gupta@gmail.com,07/07/1977,09/09/2001,188357",
            "154258,Prof.,Marlon,Z,Ney,M,marlon.ney@yahoo.co.uk,6/19/1990,11/09/2011,136216",
            "173003,Mrs.,Willia,Q,Weigand,F,willia.weigand@gmail.com,10/20/1960,7/30/2005,158292",
            "133641,Mr.,Chas,F,Hurdle,M,chas.hurdle@gmail.com,4/20/1995,5/28/2016,45102"
        };
        List<String> expected = new ArrayList<>(Arrays.asList(stringExpected));
        List<String> actual = EmployeeDataReader.getEmployees();
        Assertions.assertEquals(expected, actual);
    }

    // throws an exception if file empty
}






