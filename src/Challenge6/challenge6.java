package Challenge6;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class challenge6 {

    public static void main(String[] args) {

        String filePath = "src/Challenge2/effects-of-covid19-on-trade.csv";
        try (Stream<String> lines = Files.lines(Paths.get(filePath))) {
            List<List<String>> values = lines.map(line -> Arrays.asList(line.split(","))).collect(Collectors.toList());
            Optional<List<String>> maxNumber = values.stream()
                    .filter(value -> value.get(0).equalsIgnoreCase("Exports")
                            && value.get(1).toString().equalsIgnoreCase("2019")
                            && value.get(4).equalsIgnoreCase("China")
                            && value.get(5).equalsIgnoreCase("ALL")
                            && value.get(6).equalsIgnoreCase("ALL"))
                    .skip(1)
                    .max(Comparator.comparing(value -> value.get(8))); //Highest value
                    //.max(Comparator.comparing(value -> value.get(8)));//Highest Sum
            System.out.println(maxNumber.get());
            /*List<String> Test = Arrays.asList("100", "20300", "88002", "400000", "10");

            Optional<String> maxNumber = Test.stream()
                    .max((i, j) -> i.compareTo(j));

            System.out.println(maxNumber.get());*/


        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
