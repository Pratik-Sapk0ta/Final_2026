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
    private JToggleButton toggleButton; //Switch from C to F
    private JButton resetButton;


    //getters
    public JButton getAddButton() {
        return addButton;
    }

    public JButton getRemoveButton() {
        return removeButton;
    }

    public JButton getCalcButton() {
        return calcButton;
    }

    public JButton getToggleButton() {
        return toggleButton;
    }

    public JButton getResetButton() {
        return resetButton;
    }

    public String getInputText() {
        return  inputField.getText();
    }

    public void clearInput() {
        inputField.setText("");
    }
    public void setToggleButton(JButton toggleButton) {
        this.toggleButton = toggleButton;
    }

    public WeatherGUI() {
        super("Weather Calculator");

        inputField = new JTextField(15);

        addButton = new JButton("Add");
        removeButton = new JButton("Remove");
        calcButton = new JButton("Calculate");
        toggleButton = new JButton("Switch Mood");
        resetButton = new JButton("Reset");

        setLayout (new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);

        gbc.gridx = 0; gbc.gridy = 0;
        add( new JLable("Enter Value:"), gbc);

        gbc.gridx = 1;
        add(inputField, gbc);

        gbc.gridx = 0;
        gbc.gridx = 1;
        add(addButton,gbc);

        gbc.gridx = 1;
        add(removeButton, gbc);

        gbc.gridx = 0;
        gbc.gridx = 2;
        add(calcButton, gbc);

        gbc.gridx = 1;
        add(toggleButton,gbc);

        gbc.gridx = 0;
        gbc.gridx = 3;
        gbc.gridwidth = 2;
        add(resetButton, gbc);
    }
}
