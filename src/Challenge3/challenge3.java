package Challenge3;

import java.io.IOException;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class challenge3 {

    public static void main(String[] args) {

        String fileName = "src/Challenge3/effects-of-covid19-on-trade.csv";
        try (Stream<String> lines = Files.lines(Paths.get(fileName))) {
            List<List<String>> values = lines.map(line -> Arrays.asList(line.split(","))).collect(Collectors.toList());
            for (int i = 0; i < values.size(); i++) {
                List<String> value = values.get(i);
                for (int j = 0; j < value.size(); j++) {
                    String yearString = value.get(1);
                    String year = String.valueOf(yearString);
                    Object yearCompare = "2016";
                    String countryString = "ALL";
                    String country = value.get(4);
                    if (year.equals(yearCompare) ) {
                        if(country.equalsIgnoreCase(countryString)) {
                            System.out.println(values.get(i));
                        }
                    }
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
