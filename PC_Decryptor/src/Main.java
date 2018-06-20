import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;

public class Main {

	private JFrame frame;
	private JTextField inputField;
	private Key key;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
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
	public Main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		key = new Key();
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("KNME Decryptor");
		frame.getContentPane().setLayout(null);
		
		JLabel lblTypeHere = new JLabel("Type here:");
		lblTypeHere.setBounds(49, 70, 87, 14);
		frame.getContentPane().add(lblTypeHere);
		
		inputField = new JTextField();
		inputField.setBounds(146, 67, 278, 20);
		frame.getContentPane().add(inputField);
		inputField.setColumns(10);
	
		
		JTextArea outputField = new JTextArea();
		outputField.setEditable(false);
		outputField.setBounds(10, 170, 414, 80);
		frame.getContentPane().add(outputField);
		
		JButton btnDecrypt = new JButton("Decrypt!");
		btnDecrypt.setBounds(169, 119, 89, 23);
		frame.getContentPane().add(btnDecrypt);
		btnDecrypt.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				outputField.setText(decrypt(inputField.getText().toLowerCase()));
				System.out.println(decrypt(inputField.getText().toLowerCase()));
			}});
	}
	private String decrypt(String text) {
		String temp = "";
		String result = "";
		String finalResult = "";
		char[] symbols = new char[text.length()];
		symbols = text.toCharArray();
		for(int i = 0; i<text.length(); i++) {
			System.out.println(symbols[i]);
			if(temp == "-") {
				System.out.println("Got -");
				temp = temp + symbols[i];
				System.out.println("Temp " + temp);
				result = result + key.getValue(Integer.parseInt(temp));
				temp = "";
				System.out.println("Current result " + result);
			}
			else {
				
				
				
				if(temp.length()==2) {
					System.out.println("Got 2 symbols in temp. Current temp " + temp);
					result = result + key.getValue(Integer.parseInt(temp));
					temp = "" + symbols[i];
					System.out.println("Current result " + result);
				}
				else {
					temp = temp + symbols[i];
					System.out.println("Current temp1 " + temp);
				}
			}
		}
		result = result + key.getValue(Integer.parseInt(temp));
		for(int i = (result.length() - 1); i>=0; i--) {
			finalResult = finalResult + result.toCharArray()[i];
		}
		return finalResult;
		
	}
}
