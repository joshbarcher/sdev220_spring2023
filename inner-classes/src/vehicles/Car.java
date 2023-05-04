package vehicles;

//the outer class
public class Car
{
    private String make;
    private String model;
    private Engine engine;

    public Car(String make, String model)
    {
        this.make = make;
        this.model = model;
    }

    public void setEngine(Engine engine)
    {
        this.engine = engine;
    }

    public void replaceEngine()
    {
        engine = new Engine("Acme V6", 60);

        Engine[] engines = {
            new Engine("Acme V6", 60),
            new Engine("Acme V6", 60),
            new Engine("Acme V6", 60)
        };
        System.out.println("Engine replaced - " + engine.type);
    }

    public Engine getEngine()
    {
        return engine;
    }

    //the inner class
    private static class Engine
    {
        private String type;
        private int horsePower;

        public Engine(String type, int horsePower)
        {
            this.type = type;
            this.horsePower = horsePower;
        }

        public String toString()
        {
            return "A " + type + " engine";
                    //make + ", " + model;
        }
    }
}
