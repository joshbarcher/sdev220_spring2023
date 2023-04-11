package driver;

import objects.GenericHolder;
import objects.NumberHolder;
import objects.ObjectHolder;
import objects.StringHolder;

public class Main
{
    public static void main(String[] args)
    {
        //what's weird about this?
        GenericHolder<Integer> numHolder = new GenericHolder<>(10);
        GenericHolder<String> stringHolder = new GenericHolder<>("hello");
        GenericHolder<Boolean> boolHolder = new GenericHolder<>(true);

        String returnedString = stringHolder.getData();
        System.out.println(returnedString.toUpperCase());

        int number = numHolder.getData();
        System.out.println(number + 3);

        //auto-boxing and unboxing
        Integer object = Integer.valueOf(100);
        int primitive = object;
        Integer anotherObject = primitive;
    }
}

