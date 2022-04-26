import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class HouseholdCounter {
    public static void summarizeHouseholds(ArrayList<Person> persons)
    {
        Map<String, List<Person>> personsGrouped = persons.stream().sorted(
            (p1, p2)->(p1.lastName + p1.firstName).compareTo(p2.lastName + p2.firstName)).collect(
            Collectors.groupingBy(
                        p -> p.streetAddress.replaceAll(
                            "\\.", "").replaceAll(
                                ",", "").trim().toLowerCase() 
                                + "," + p.city.toLowerCase() + "," 
                                + p.state.toLowerCase()));
        for(Map.Entry<String, List<Person>> entry : personsGrouped.entrySet())
        {
            System.out.println(String.format("Household Address: %s, # members: %d", entry.getKey(), entry.getValue().size()));
            for(Person p : entry.getValue())
            {
                if (p.age >= 18)
                {
                    System.out.print(p);                    
                }
            }
        }
    }
}
