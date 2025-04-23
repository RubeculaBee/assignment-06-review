/*********************************************************************************
 *
 * File: Gamer.java
 * By: Robin Lane
 * Date: 04-22-2025
 *
 * Description: Subclass of the person class, additionally stores a favourite
 *              game, and has an overridden greet method,
 *
 *********************************************************************************/

public class Gamer extends Person
{
    private String favGame;

    public Gamer() {}

    public Gamer(String name, int ssn, String favGame)
    {
        super(name, ssn);
        this.favGame = favGame;
    }

    public String getFavGame()
    {
        return favGame;
    }
    public void setFavGame(String favGame)
    {
        this.favGame = favGame;
    }

    @Override
    public void greet()
    {
        System.out.printf("My name is %s and I LOVE playing games! My favourite is %s!\n", this.getName(), this.getFavGame());
    }
}
