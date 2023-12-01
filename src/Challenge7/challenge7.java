package Challenge7;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Stream;

public class challenge7 {

    public static void main(String[] args) {

        String filePath = "src/Challenge2/effects-of-covid19-on-trade.csv";
        try (Stream<String> lines = Files.lines(Paths.get(filePath))) {
            List<List<String>> values = lines.map(line -> Arrays.asList(line.split(","))).toList();
            HashMap<String, String> year2019 = new HashMap<>();
            HashMap<String, String> year2020 = new HashMap<>();
            values.stream()
                    .filter(value -> value.get(0).equalsIgnoreCase("Exports")
                            && value.get(1).equalsIgnoreCase("2019")
                            && value.get(4).equalsIgnoreCase("European Union (27)"))
                    .forEach(value -> year2019.put("Key: " + value.get(2), "Value: " + value.get(8)));
            year2019.entrySet().stream()
                    .sorted(Map.Entry.comparingByValue())
                    .forEach(System.out::println);

            values.stream()
                    .filter(value -> value.get(0).equalsIgnoreCase("Exports")
                            && value.get(1).equalsIgnoreCase("2020")
                            && value.get(4).equalsIgnoreCase("European Union (27)"))
                    .forEach(value -> year2020.put("Key: " + value.get(2), "Value: " + value.get(8)));
            year2020.entrySet().stream()
                    .sorted(Map.Entry.comparingByValue())
                    .forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
