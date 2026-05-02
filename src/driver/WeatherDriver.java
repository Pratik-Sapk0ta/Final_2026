package driver;
import javax.swing.JFrame;
import viewer.WeatherGUI;

public class WeatherDriver {

    public static void main(String[] args) {

        WeatherGUI myFrame = new WeatherGUI();


        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.pack();
        myFrame.setVisible(true);


    }
}