package Testing.Generics;

public class Printer <T> //Type parameter convention calls it T (can be whatever)
{
    //Essentially replaces multiple files for doing the same things but with different values (String, Integer, Double, ...)
    T thingToPrint;

    public Printer(T thingToPrint)
    {
        this.thingToPrint = thingToPrint;
    }
    public void print()
    {
        System.out.println(thingToPrint);
    }

}
