package Testing.Generics;

public class Cat <T>
{
    T testThing;
    public Cat(T testThing)
    {
        this.testThing = testThing;
    }
    public void testing()
    {
        System.out.println(testThing);
    }
}
