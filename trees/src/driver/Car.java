package driver;

//add some details to the Car class so Car objects can be stored in our Tree!
public class Car implements Comparable<Car>
{
    private String color;
    private int mpg;

    public Car(String color, int mpg)
    {
        this.color = color;
        this.mpg = mpg;
    }

    public String getColor()
    {
        return color;
    }

    public int getMpg()
    {
        return mpg;
    }

    public String toString()
    {
        return color + " car, " + mpg + " mpg";
    }

    @Override
    public int compareTo(Car other)
    {
        return mpg - other.mpg;
    }
}
