package Challenge1;

import javax.swing.*;

public class challenge1 {
    public static void main(String[] args) {

        JOptionPane popUp = new JOptionPane();

         JList list = new JList(new String[] {"Metre", "Centimetre", "Millimetre"});

        popUp.showMessageDialog(null, list, "Multi-Select Metric for ", JOptionPane.PLAIN_MESSAGE);
        String askLength = popUp.showInputDialog("Give length for calculation: ");
        String askWidth = popUp.showInputDialog("Give width for calculation: ");

        String metric = list.getSelectedValue().toString();

        enum Level{
            Metre,
            Centimetre,
            Millimetre
        }
        Level Metre = Level.Metre;
        Level Centimetre = Level.Centimetre;
        Level Millimetre = Level.Millimetre;

        String metreString = String.valueOf(Metre);
        String centimetreString = String.valueOf(Centimetre);
        String millimetreString = String.valueOf(Millimetre);

        try {
            Double length = Double.parseDouble(askLength);
            Double width = Double.parseDouble(askWidth);

            if (metric.equals(metreString)) {
                //Metre to centimetre
                Double metreToCentimetreLength = (double)(length * 100);
                Double metreToCentimetreWidth = (double)(width * 100);
                Double result = metreToCentimetreLength * metreToCentimetreWidth;
                popUp.showMessageDialog(null, (result + "cm²"));
            } else if (metric.equals(centimetreString)) {
                //Use Centimetre
                Double result = (double)(length * width);
                popUp.showMessageDialog(null,(result + "cm²"));
            } else if (metric.equals(millimetreString)){
                //Millimetre to Centimetre
                Double millimetreToCentimetreLength = (double)(length / 10);
                Double metreToCentimetreWidth = (double)(width / 10);
                Double result = millimetreToCentimetreLength * metreToCentimetreWidth;
                popUp.showMessageDialog(null,(result + "cm²"));
            }
        } catch (NumberFormatException e) {
            String error = "That's not a number or there was a problem";
            popUp.showMessageDialog(null, error);
        }
    }
}