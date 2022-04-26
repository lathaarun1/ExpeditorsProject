# Problem Statement
## Exercise Summary:
This Developer Design and Development exercise is used in the evaluation process for potential new hire candidates.  Please approach this exercise as you would approach a design and development project at work and include unit tests.  Any documentation or explanations about your approach and assumptions are helpful.  Please e-mail your completed exercise back to your recruiting contact at Expeditors when complete.

## Requirements:
Write a standalone executable or script using the language of your preference (Java is the primary dev language at Expeditors).  Given the provided input data, print the expected output to the console or write to a text file.

## Input data:
```
"Dave","Smith","123 main st.","seattle","wa","43"
"Alice","Smith","123 Main St.","Seattle","WA","45"
"Bob","Williams","234 2nd Ave.","Tacoma","WA","26"
"Carol","Johnson","234 2nd Ave","Seattle","WA","67"
"Eve","Smith","234 2nd Ave.","Tacoma","WA","25"
"Frank","Jones","234 2nd Ave.","Tacoma","FL","23"
"George","Brown","345 3rd Blvd., Apt. 200","Seattle","WA","18"
"Helen","Brown","345 3rd Blvd. Apt. 200","Seattle","WA","18"
"Ian","Smith","123 main st ","Seattle","Wa","18"
"Jane","Smith","123 Main St.","Seattle","WA","13"
```

## Expected output: 
Each household and number of occupants, followed by:
Each First Name, Last Name, Address and Age sorted by Last Name then First Name where the occupant(s) is older than 18

# Design and Development
## Assumptions
- The input is provided as a csv file under data folder, census.csv
- The addresses are case insensitive
- A unique household is identified based on Address (Street name, City and State)
- Occupants older than 18 includes 18 and above

## Design
- Create a type to represent each input row - Person
- Create a census.csv parser function that returns a collection of Person objects
- Create a function that takes the collection of Person objects and groups them by households using address, and prints output in desired format