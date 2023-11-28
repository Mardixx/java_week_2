package Challenge4;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.io.IOException;

public class challenge4 {

    public static void main(String[] args) {

        String filePath = "src/Challenge4/effects-of-covid19-on-trade.csv";
        try (Stream<String> lines = Files.lines(Paths.get(filePath))) {
            List<List<String>> values = lines.map(line -> Arrays.asList(line.split(","))).collect(Collectors.toList());
            for(int i = 0; i < values.size(); i++) {
                List<String> value = values.get(i);
                for(int j = 0; j < value.size(); j++) {

                    if(value.size() == 10) {
                        String yearString = value.get(1);
                        String yearValue = String.valueOf(yearString);
                        Object year = "2016";
                        if(year.equals(yearValue)) {
                            String measureString = value.get(7);
                            String measureValue = String.valueOf(measureString);
                            String money = value.get(8);
                            Integer moneyInt = Integer.parseInt(money);
                            moneyInt = (moneyInt / 100) * 85;
                            if(measureValue.equalsIgnoreCase("Tonnes")) {
                                List<String> listing = new ArrayList<String>();
                                listing.add(measureString);
                                System.out.println(listing);
                            } else {
                                HashMap<String, Integer> listing = new HashMap<>();
                                listing.put("€", moneyInt);
                                System.out.println(listing);
                            }
                        }
                    } else {
                        String yearString = value.get(1);
                        String yearValue = String.valueOf(yearString);
                        Object year = "2016";
                        if(year.equals(yearValue)) {
                            String measureString = value.get(9);
                            String measureValue = String.valueOf(measureString);
                            String money = value.get(10);
                            Integer moneyInt = Integer.parseInt(money);
                            moneyInt = (moneyInt / 100) * 85;
                            if(measureValue.equalsIgnoreCase("Tonnes")) {
                                List<String> listing = new ArrayList<String>();
                                listing.add(measureString);
                                System.out.println(listing);
                            } else {
                                HashMap<String, Integer> listing = new HashMap<>();
                                listing.put("€", moneyInt);
                                System.out.println(listing);
                            }
                        }
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
