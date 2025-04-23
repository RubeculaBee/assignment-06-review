/*********************************************************************************
 *
 * File: SubclassSuperclassAccess.java
 * By: Robin Lane
 * Date: 04-22-2025
 *
 * Description: Simple test driver to demonstrate which methods
 *              subclasses/superclasses can access.
 *
 *********************************************************************************/

public class SubclassSuperclassAccess
{
    public static void main(String[] args)
    {
        System.out.println("------ Reference Type == Object Type ------");
        System.out.println("...           Creating Person           ...");
        Person person = new Person("Jerry", 101101);

        System.out.println("...           Creating Gamer            ...");
        Gamer gamer = new Gamer("Zach", 123432, "Valorant");

        System.out.println("...           Creating Writer           ...");
        Writer writer = new Writer("Reuben", 112358, "Wuthering Heights");

        System.out.println("...            greet() test             ...");
        person.greet();
        gamer.greet();
        writer.greet();

        System.out.println("------ Reference Type != Object Type ------");
        System.out.println("... Gamer Object with Person Reference  ...");
        Person gamerWithHat = new Gamer("Chet", 192837, "Overwatch");

        System.out.println("... Writer Object with Person Reference ...");
        Person writerWithHat = new Writer("Sarah", 777777, "Harry Potter");

        // System.out.println("... Person Object with Gamer Reference  ...");
        // Gamer personWrongHat = new Person();
        // Error: Cant assign Gamer reference to Person object

        // System.out.println("... Gamer Object with Writer Reference  ...");
        // Writer writerWrongHat = new Gamer();
        // Error: Cant assign Writer reference to Gamer object

        System.out.println("...       getName()/getSsn() test       ...");
        System.out.printf("%s: %d\n", gamerWithHat.getName(), gamerWithHat.getSsn());
        System.out.printf("%s: %d\n", writerWithHat.getName(), writerWithHat.getSsn());
        // Can still access Person methods

        // System.out.println("...   getFavGame()/getFavBook() test    ...");
        // System.out.printf("%s: %d\n", gamerWithHat.getName(), gamerWithHat.getFavGame());
        // System.out.printf("%s: %d\n", writerWithHat.getName(), writerWithHat.getFavBook());
        // Error: Can NOT access Gamer/Writer methods.

        System.out.println("...            greet() test             ...");
        gamerWithHat.greet();
        writerWithHat.greet();
        // Notice that they used their true type's greet() method!
    }
}
