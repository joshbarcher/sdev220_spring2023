package cars;

public class Car implements Comparable<Car>
{
    private String makeModel;
    private String color;
    private int horsePower;
    private double miles;

    public Car(String makeModel, String color,
               int horsePower, double miles)
    {
        this.makeModel = makeModel;
        this.color = color;
        this.horsePower = horsePower;
        this.miles = miles;
    }

    @Override
    public int compareTo(Car other)
    {
        int compareColor = color.compareTo(other.color);
        if (compareColor == 0)
        {
            //the same color (sort by make model)
            return makeModel.compareTo(other.makeModel);
        }
        else
        {
            //different color
            return compareColor;
        }
    }

    public String getMakeModel() {
        return makeModel;
    }
    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public int getHorsePower() {
        return horsePower;
    }
    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }
    public double getMiles() {
        return miles;
    }
    public void setMiles(double miles) {
        this.miles = miles;
    }

    @Override
    public String toString()
    {
        return "A " + color + " " + makeModel + " " + horsePower + "hp " +
                miles + " miles";
    }
}

