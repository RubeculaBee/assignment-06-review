public class Person
{
    private String name; // The person's name
    private int ssn;     // The person's social security number

    // null-arg constructor
    Person() {}

    Person(String name, int ssn)
    {
        this.name = name;
        this.ssn = ssn;
    }

    // Name can be obtained and changed
    String getName()
    {
        return name;
    }
    void setName(String name)
    {
        this.name = name;
    }

    // social can be obtained but not changed.
    int getSsn()
    {
        return ssn;
    }

    void greet()
    {
        System.out.printf("Hello, I am a non specific person, my name is %s\n", this.name);
    }
}
