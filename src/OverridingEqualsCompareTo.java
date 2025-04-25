public class OverridingEqualsCompareTo
{
    public static void main(String[] args)
    {
        System.out.println("... Creating CircleS (radius 3) ...");
        Circle circleA = new Circle(3);
        System.out.println("... Creating CircleB (radius 3) ...");
        Circle circleB = new Circle(3);
        System.out.println("... Creating CircleC (radius 6) ...\n");
        Circle circleC = new Circle(6);

        System.out.printf("CircleA and CircleA are %s object(s) with %s radius.\n",
                circleA == circleA ? "the same" : "different", circleA.equals(circleA) ? "the same" : "different");

        System.out.printf("CircleA and CircleB are %s object(s) with %s radius.\n",
                circleA == circleB ? "the same" : "different", circleA.equals(circleB) ? "the same" : "different");

        System.out.printf("CircleB and CircleC are %s object(s) with %s radius.\n\n",
                circleB == circleC ? "the same" : "different", circleB.equals(circleC) ? "the same" : "different");

        System.out.printf("Difference in radius between CircleA and CircleB: %d\n", circleA.compareTo(circleB));
        System.out.printf("Difference in radius between CircleB and CircleC: %d\n", circleB.compareTo(circleC));
        System.out.printf("Difference in radius between CircleC and CircleA: %d\n", circleC.compareTo(circleA));
    }
}
