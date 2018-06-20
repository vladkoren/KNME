import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Main {

	private JFrame frmKnmeKrypt;
	private JTextField startTxtF;
	private JTextField resultTxtF;
	private Key key;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.frmKnmeKrypt.setVisible(true);
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
		frmKnmeKrypt = new JFrame();
		frmKnmeKrypt.setTitle("KNME Encryptor");
		frmKnmeKrypt.setBounds(150, 150, 500, 400);
		frmKnmeKrypt.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmKnmeKrypt.getContentPane().setLayout(null);
		
		JLabel lblEnterText = new JLabel("Enter text:");
		lblEnterText.setBounds(73, 70, 72, 14);
		frmKnmeKrypt.getContentPane().add(lblEnterText);
		
		startTxtF = new JTextField();
		startTxtF.setBounds(155, 67, 269, 20);
		frmKnmeKrypt.getContentPane().add(startTxtF);
		startTxtF.setColumns(10);
		
		JButton encryptBtn = new JButton("Encrypt!");
		encryptBtn.setBounds(155, 131, 89, 23);
		frmKnmeKrypt.getContentPane().add(encryptBtn);
		encryptBtn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				resultTxtF.setText(Encrypt(startTxtF.getText().toLowerCase()));
			}});
			
		
		
		resultTxtF = new JTextField();
		resultTxtF.setToolTipText("Result");
		resultTxtF.setEditable(false);
		resultTxtF.setBounds(20, 300, 450, 40);
		frmKnmeKrypt.getContentPane().add(resultTxtF);
		resultTxtF.setColumns(10);
	}
	
	private String Encrypt(String text) {
		String result = "";
		char [] textArray = text.toCharArray();
		for(int i = (textArray.length - 1); i>=0; i--) {
			System.out.println("Current symbol is : " + textArray[i]);
			result = result + key.getKey(textArray[i]);
		}
		
		return result;
		
	}
}
