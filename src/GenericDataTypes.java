import java.util.Arrays;

public class GenericDataTypes
{
    public static void main(String[] args)
    {
        System.out.println("Creating Bag...");
        LinkedBag<Integer> myBag = new LinkedBag<>();

        System.out.println("Is this bag empty? " + myBag.isEmpty());

        System.out.println("\nAdding data...");
        for(int i = 0; i < 10; i++)
        {
            myBag.add(i * i);
            System.out.println("Size: " + myBag.size());
        }

        System.out.println("\nIs this bag empty? " + myBag.isEmpty());

        System.out.println("\nBag contents:");
        for(int i = 0; i < myBag.size(); i++)
            System.out.println(myBag.get(i));

        System.out.println("Bag contains 13? " + myBag.contains(13));
        System.out.println("Bag contains 49? " + myBag.contains(49));

        System.out.println("\nGet by element test: " + myBag.get(Integer.valueOf(25)));
        System.out.println("Get by element test: " + myBag.get(Integer.valueOf(30)));

        System.out.println("\nAdding data at indices 0, 4, 8, 11:");
        myBag.add(0, 100000);
        myBag.add(4, 200000);
        myBag.add(8, 300000);
        myBag.add(11, 400000);
        System.out.println("Bag contents:");
        for(int i = 0; i < myBag.size(); i++)
            System.out.println(myBag.get(i));

        System.out.printf("\nRemoving last element (%s)...\n", myBag.remove());
        System.out.println("Bag contents:");
        for(int i = 0; i < myBag.size(); i++)
            System.out.println(myBag.get(i));

        System.out.printf("\nRemoving last element (%s)...\n", myBag.remove());
        System.out.printf("Removing last element (%s)...\n", myBag.remove());
        System.out.println("Bag contents:");
        for(int i = 0; i < myBag.size(); i++)
            System.out.println(myBag.get(i));

        System.out.printf("\nRemoving element (%s)...\n", myBag.remove(Integer.valueOf(4)));
        System.out.println("Bag contents:");
        for(int i = 0; i < myBag.size(); i++)
            System.out.println(myBag.get(i));

        System.out.printf("\nRemoving element (%s)...\n", myBag.remove(Integer.valueOf(16)));
        System.out.printf("Removing element (%s)...\n", myBag.remove(Integer.valueOf(36)));
        System.out.println("Bag contents:");
        for(int i = 0; i < myBag.size(); i++)
            System.out.println(myBag.get(i));

        System.out.println("\nRemoving data at indices 5, 3, 1:");
        myBag.remove(5);
        myBag.remove(3);
        myBag.remove(1);
        System.out.println("Bag contents:");
        for(int i = 0; i < myBag.size(); i++)
            System.out.println(myBag.get(i));

        System.out.printf("\nSetting data at index 1 (%s) to 10\n", myBag.set(1, 10));
        System.out.printf("Setting data at index 3 (%s) to 11\n", myBag.set(3, 11));
        System.out.printf("Setting data at index 4 (%s) to 12\n", myBag.set(4, 12));
        System.out.println("Bag contents:");
        for(int i = 0; i < myBag.size(); i++)
            System.out.println(myBag.get(i));

        System.out.println("\nConverting bag into array");
        Integer[] myArray = myBag.toArray();
        System.out.printf("Array contents:\n%s\n", Arrays.toString(myArray));

        System.out.println("\nEmptying bag...");
        myBag.clear();
        System.out.println("Is this bag empty? " + myBag.isEmpty());

        System.out.println("\nInitialising new bag from varargs constructor");
        myBag = new LinkedBag<>(1, 2, 8, 9, 5, 6, 4, 5, 3, 6, 1, 1, 2, 3, 9, 3, 5, 4);
        System.out.println("Bag contents:");
        for(int i = 0; i < myBag.size(); i++)
            System.out.println(myBag.get(i));

        System.out.println("\nDigit : First Index");
        for(int i = 0; i < 10; i++)
            System.out.printf("%5d : %d\n", i, myBag.indexOf(i));

        System.out.println("\nDigit : Last Index");
        for(int i = 0; i < 10; i++)
            System.out.printf("%5d : %d\n", i, myBag.lastIndexOf(i));

        System.out.println("\nDigit : Frequency");
        for(int i = 0; i < 10; i++)
            System.out.printf("%5d : %d\n", i, myBag.getFrequencyOf(i));

        System.out.println("\nCreating Sub-Bag from index 3 to 14");
        LinkedBag<Integer> newBag = myBag.subBag(3, 14);
        System.out.println("Sub-Bag contents:");
        for(int i = 0; i < newBag.size(); i++)
            System.out.println(newBag.get(i));
    }
}
