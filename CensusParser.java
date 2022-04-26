import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import com.opencsv.*;
import com.opencsv.exceptions.CsvValidationException;

public class CensusParser {
    public static ArrayList<Person> parse(String censusFilePath)
    {
        ArrayList<Person> persons = new ArrayList<>();
        try   
        {
            FileReader filereader = new FileReader(censusFilePath);

            CSVReader csvReader = new CSVReader(filereader);
            String[] p;
            try {
                while ((p = csvReader.readNext()) != null) {
                    Person person = new Person();
                    person.firstName = p[0].replaceAll("\"", "");
                    person.lastName = p[1].replaceAll("\"", "");
                    person.streetAddress = p[2].replaceAll("\"", "");
                    person.city = p[3].replaceAll("\"", "");
                    person.state = p[4].replaceAll("\"", "");
                    person.age = Integer.parseInt(p[5].replaceAll("\"", ""));
                    persons.add(person);
                }
            } catch (CsvValidationException e) {
                e.printStackTrace();
            }
        }   
        catch (IOException e)   
        {  
            e.printStackTrace();  
        } 
        
        return persons;    
    }
}
