package driver;

import vehicles.Car;

public class Main
{
    public static void main(String[] args)
    {
        Car myCar = new Car("Nissan", "Rogue");
        Car.Engine engine = myCar.new Engine("Acme V8", 120);
        myCar.setEngine(engine);

        myCar.replaceEngine();
    }
}