public class Person {
    String firstName;

    String lastName;

    String streetAddress;

    String city;

    String state;

    int age;

    public String toString()
    {
        return String.format("First Name: %s, Last Name: %s, Street Address: %s, City: %s, State: %s, Age: %d\r\n", firstName, lastName, streetAddress, city, state, age);
    }
}
