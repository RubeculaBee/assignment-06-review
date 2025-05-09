package General;

// Grants access to everything from the people package (Worker and Student)
import People.*;
// Grants access to specifically the Phone class from the people package.
import Items.Phone;

public class AccessAcrossPackages
{
    public static void main(String[] args)
    {
        Student mYStudent = new Student();
        // Success, Student class is imported from People package, and Student is public

        // Worker myWorker = new Worker();
        // Error, can not access Worker. Even though the People package has been imported, Worker class is not public

        Phone myPhone = new Phone();
        // Success, Phone class has been imported, and Phone is public.

        // Textbook myTextbook = new Textbook();
        // Error, can not access Textbook. Even though Textbook is public, the class has not been imported.
    }
}
