package Testing.Generics;

import java.util.Stack;

public class testGenerics {

    public static void main(String[] args) {

        /*Printer<Integer> printer = new Printer<>(23); //Integer printer
        Printer<String> printerString = new Printer<>("Hello"); //String printer
        Printer<Double> printerDouble = new Printer<>(23.235); //Double printer
        printer.print();
        printerString.print();
        printerDouble.print();*/

        Cat<String> cats = new Cat("Generics are useful but suck");

        Stack<String> stack = new Stack<>();
        stack.push(cats.testThing);

        System.out.println(stack);

    }

}
