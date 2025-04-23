/*********************************************************************************
 *
 * File: Person.java
 * By: Robin Lane
 * Date: 04-22-2025
 *
 * Description: Simple class to represent a person that has a name, social
 *              security number, and can greet.
 *
 *********************************************************************************/

public class Person
{
    private String name; // The person's name
    private int ssn;     // The person's social security number

    // null-arg constructor
    public Person() {}

    public Person(String name, int ssn)
    {
        this.name = name;
        this.ssn = ssn;
    }

    // Name can be obtained and changed
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }

    // social can be obtained but not changed.
    public int getSsn()
    {
        return ssn;
    }

    public void greet()
    {
        System.out.printf("Hello, I am a non specific person, my name is %s\n", this.name);
    }
}
