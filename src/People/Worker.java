package People;

// Imports specifically the Person class from teh General package
import General.Person;
// Imports all classes from the Items package (Phone, Textbook, Tool)
import Items.*;

// Successfully extends person, it is a public class and it has been imported
class Worker extends Person
{
    Tool tool;
    // Success, the tool class is public and the class has been imported
}
