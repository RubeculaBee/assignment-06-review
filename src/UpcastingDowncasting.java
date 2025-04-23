public class UpcastingDowncasting
{
    public static void main(String[] args)
    {
        System.out.println("...      Creating Gamer Object with Gamer reference      ...");
        Gamer myGamer = new Gamer("Timmy", 129056, "GTA");

        System.out.println("...            getName: getFavGame             ...");
        System.out.printf("%s: ", myGamer.getName());
        System.out.printf("%s\n", myGamer.getFavGame());

        System.out.println("...  Upcasting from Gamer reference to Person Reference  ...");
        Person gamerSuper = (Person) myGamer;

        System.out.println("...                 getName: getFavGame                  ...");
        System.out.printf("%s: ", gamerSuper.getName());
        // System.out.printf("%s\n", gamerSuper.getFavGame());
        System.out.println();
        // Error: gamerSuper reference can not access getFavGame method

        System.out.println("... Downcasting from Person Reference to Gamer Reference ...");
        Gamer gamerSub = (Gamer) myGamer;

        System.out.println("...                 getName: getFavGame                  ...");
        System.out.printf("%s: ", gamerSub.getName());
        System.out.printf("%s\n", gamerSub.getFavGame());
        // It works again!
    }
}
