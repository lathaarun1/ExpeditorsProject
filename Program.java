import java.util.ArrayList;

public class Program
{
    public static void main(String[] args)
    {
        ArrayList<Person> persons = CensusParser.parse("data/census.csv");
        HouseholdCounter.summarizeHouseholds(persons);
    }
}