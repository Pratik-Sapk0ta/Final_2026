package driver;
import javax.swing.JFrame;
import viewer.WeatherGUI;

public class WeatherDriver {

    public static void main(String[] args) {

        WeatherGUI viewer = new WeatherGUI();
        Month model = new Month();
        TemperatureCalculator calc = new TemperatureCalculator();

        viewer.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        viewer.pack();
        viewer.setVisible(true);


    }
}