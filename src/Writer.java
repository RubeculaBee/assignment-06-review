/*********************************************************************************
 *
 * File: Writer.java
 * By: Robin Lane
 * Date: 04-22-2025
 *
 * Description: Subclass of the person class, additionally stores a favourite
 *              book, and has an overridden greet method,
 *
 *********************************************************************************/

public class Writer extends Person
{
    private String favBook;

    public Writer() {}

    public Writer(String name, int ssn, String favBook)
    {
        super(name, ssn);
        this.favBook = favBook;
    }

    public String getFavBook()
    {
        return favBook;
    }
    public void setFavBook(String favBook)
    {
        this.favBook = favBook;
    }

    @Override
    public void greet()
    {
        System.out.printf("Hello, you may call me %s. I consider myself to be a writer. My favourite book is %s.\n", this.getName(), this.getFavBook());
    }
}
