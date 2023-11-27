import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {

        enum Level{
            m,
            cm,
            mm
        }
        Level metre = Level.m;

        System.out.println(metre);

        JOptionPane popUp = new JOptionPane();

        String askLength = popUp.showInputDialog("Give length for calculation: ");
        String askLengthMetric = popUp.showInputDialog("Give metric for length: ");
        String askWidth = popUp.showInputDialog("Give width for calculation: ");
        String askWidthMetric = popUp.showInputDialog("Give metric for width: ");


    }
}