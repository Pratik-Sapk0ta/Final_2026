package viewer;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class WeatherGUI extends JFrame implements ActionListener{

    private private JTextField inputField;

    private JButton addButton;
    private JButton removeButton;
    private JButton calcButton;
    private JButton toggleButton; //Switch from C to F
    private JButton resetButton;

    public WeatherGUI() {
        super("Weather Calculator");

        inputField = new JTextField(15);

        addButton = new JButton("Add");
        removeButton = new JButton("Remove");
        calcButton = new JButton("Calculate");
        toggleButton = new JButton("Switch Mood");
        resetButton = new JButton("Reset");

        detLayout (new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);




    }


}
