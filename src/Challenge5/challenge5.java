package Challenge5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class challenge5 {

    public static void main(String[] args) {

        String filePath = "src/Challenge4/effects-of-covid19-on-trade.csv";
        try (Stream<String> lines = Files.lines(Paths.get(filePath))) {
            List<List<String>> values = lines.map(line -> Arrays.asList(line.split(","))).collect(Collectors.toList());
            values.stream()
                    .filter(value -> value.get(0).toString().equalsIgnoreCase("Imports") && value.get(1).toString().equalsIgnoreCase("2018") && value.get(4).toString().equalsIgnoreCase("ALL") && value.get(5).toString().equalsIgnoreCase("ALL") && value.get(6).toString().equalsIgnoreCase("ALL"))
                    .forEach(System.out::println);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
