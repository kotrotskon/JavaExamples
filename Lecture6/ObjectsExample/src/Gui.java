import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.BoxLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Gui {

	private JFrame frame;
	private JTextField textField_passengers;
	private JTextField textField_wheels;
	private JTextField textField_fuel;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JButton btnNewButton;
	
	Car car;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Gui window = new Gui();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Gui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		frame.getContentPane().setLayout(gridBagLayout);
		
		lblNewLabel = new JLabel("passengers");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 1;
		gbc_lblNewLabel.gridy = 1;
		frame.getContentPane().add(lblNewLabel, gbc_lblNewLabel);
		
		lblNewLabel_1 = new JLabel("fuel");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 2;
		gbc_lblNewLabel_1.gridy = 1;
		frame.getContentPane().add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("wheels");
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel_2.gridx = 3;
		gbc_lblNewLabel_2.gridy = 1;
		frame.getContentPane().add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		textField_passengers = new JTextField();
		GridBagConstraints gbc_textField_passengers = new GridBagConstraints();
		gbc_textField_passengers.insets = new Insets(0, 0, 5, 5);
		gbc_textField_passengers.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_passengers.gridx = 1;
		gbc_textField_passengers.gridy = 2;
		frame.getContentPane().add(textField_passengers, gbc_textField_passengers);
		textField_passengers.setColumns(10);
		
		textField_fuel = new JTextField();
		GridBagConstraints gbc_textField_fuel = new GridBagConstraints();
		gbc_textField_fuel.insets = new Insets(0, 0, 5, 5);
		gbc_textField_fuel.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_fuel.gridx = 2;
		gbc_textField_fuel.gridy = 2;
		frame.getContentPane().add(textField_fuel, gbc_textField_fuel);
		textField_fuel.setColumns(10);
		
		textField_wheels = new JTextField();
		GridBagConstraints gbc_textField_wheels = new GridBagConstraints();
		gbc_textField_wheels.insets = new Insets(0, 0, 5, 0);
		gbc_textField_wheels.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_wheels.gridx = 3;
		gbc_textField_wheels.gridy = 2;
		frame.getContentPane().add(textField_wheels, gbc_textField_wheels);
		textField_wheels.setColumns(10);
		
		btnNewButton = new JButton("Create Car");
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int passengers = Integer.valueOf(textField_passengers.getText());
				double fuel = Double.valueOf(textField_fuel.getText());
				car = new Car(passengers, fuel);
				JOptionPane.showMessageDialog(null, car.getFuel());
			}
		});
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton.gridx = 2;
		gbc_btnNewButton.gridy = 3;
		frame.getContentPane().add(btnNewButton, gbc_btnNewButton);
	}

}
