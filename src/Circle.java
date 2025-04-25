public class Circle implements Comparable<Object>
{
    private int radius;

    public Circle()
    {
    }

    public Circle(int radius)
    {
        this.radius = radius;
    }

    public int getRadius()
    {
        return radius;
    }

    public void setRadius(int radius)
    {
        this.radius = radius;
    }

    @Override
    public boolean equals(Object object)
    {
        if (this.getClass() != object.getClass())
            return false;

        return this.radius == ((Circle) object).radius;
    }

    @Override
    public int compareTo(Object object)
    {
        if(this.getClass() != object.getClass())
            throw new ClassCastException();

        return this.getRadius() - ((Circle) object).getRadius();
    }
}
