package Challenge2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class challenge2 {

    public static void main(String[] args) {

        String fileName = "src/Challenge2/effects-of-covid19-on-trade.csv";
        try (Stream<String> lines = Files.lines(Paths.get(fileName))) {
            List<List<String>> values = lines.map(line -> Arrays.asList(line.split(","))).collect(Collectors.toList());
            values.forEach(value -> System.out.println(value));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
