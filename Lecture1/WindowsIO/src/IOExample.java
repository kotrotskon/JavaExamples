import javax.swing.JOptionPane;

public class IOExample {

	public static void main(String[] args) {
		
		int num1;
		int num2;
		int sum;
		
		num1 = Integer.valueOf(JOptionPane.showInputDialog("Give the first number: "));
		num2 = Integer.valueOf(JOptionPane.showInputDialog("Give the second number: "));
		
		sum = num1 + num2;
		
		JOptionPane.showMessageDialog(null, "The sum is: " + sum);
	}

}
