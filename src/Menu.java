import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Menu {

	private JFrame frame;
	static JTextField textField;
	public static JLabel invalidalert;
	public static JLabel invalidalerttwo;
	private JTextField refrate;

	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu window = new Menu();
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
	public Menu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setIconImage(new ImageIcon(Menu.class.getResource("/GOLICON.png")).getImage());
		frame.setBounds(100, 100, 696, 535);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblGowMainInterface = new JLabel("Main Menu");
		lblGowMainInterface.setFont(new Font("Consolas", Font.PLAIN, 50));
		lblGowMainInterface.setHorizontalAlignment(SwingConstants.CENTER);
		lblGowMainInterface.setBounds(56, 16, 561, 124);
		frame.getContentPane().add(lblGowMainInterface);
		
		JButton btnRunJframe = new JButton("Start");
		btnRunJframe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				invalidalert.setVisible(false);
				
				try {
					new CellManipulation();
					
					try {
						CellManipulation.refreshrate = Integer.parseInt(refrate.getText());
					}
					catch(Exception ex) {
						invalidalerttwo.setVisible(true);
						
					}
					
					new GridFrame();
				}
				catch(Exception ex) {
					invalidalert.setVisible(true);
				}
				

			}
		});
		btnRunJframe.setBounds(56, 363, 115, 29);
		frame.getContentPane().add(btnRunJframe);
		
		textField = new JTextField();
		textField.setBounds(66, 211, 346, 26);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		textField.setText("");
		
		JLabel lblEnterCoordinatesSeparated = new JLabel("Enter coordinates, separated by commas, alternating x and y values.");
		lblEnterCoordinatesSeparated.setBounds(66, 132, 530, 44);
		frame.getContentPane().add(lblEnterCoordinatesSeparated);
		
		JButton closethemenu = new JButton("Exit");
		closethemenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				System.exit(0);
			}
		});
		closethemenu.setBounds(186, 408, 115, 29);
		frame.getContentPane().add(closethemenu);
		
		JLabel lblEgABox = new JLabel("E.g. A box could be \"50,50,51,50,50,51,51,51\"");
		lblEgABox.setBounds(66, 175, 394, 20);
		frame.getContentPane().add(lblEgABox);
		
		JButton boxcode = new JButton("box");
		boxcode.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText("50,50,51,50,50,51,51,51");
			}
		});
		boxcode.setBounds(491, 228, 115, 29);
		frame.getContentPane().add(boxcode);
		
		JLabel lblPresets = new JLabel("Presets");
		lblPresets.setBounds(527, 192, 69, 20);
		frame.getContentPane().add(lblPresets);
		
		JButton glidercode = new JButton("glider");
		glidercode.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("50,50,50,51,50,52,49,52,48,51");
			}
		});
		glidercode.setBounds(491, 273, 115, 29);
		frame.getContentPane().add(glidercode);
		
		JButton explodercode = new JButton("exploder");
		explodercode.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("50,50,50,52,50,54,49,50,48,50,47,50,46,50,46,52,46,54,47,54,48,54,49,54");
			}
		});
		explodercode.setBounds(491, 318, 115, 29);
		frame.getContentPane().add(explodercode);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				refrate.setText("");
				invalidalert.setVisible(false);
				invalidalerttwo.setVisible(false);
			}
		});
		btnClear.setBounds(56, 408, 115, 29);
		frame.getContentPane().add(btnClear);
		
		JButton guncode = new JButton("Gosper gun");
		guncode.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("45,45,45,47,45,48,44,47,46,47,43,46,47,46,42,44,42,43,48,44,48,43,47,42,43,42,46,41,45,41,44,41,45,32,45,31,44,32,44,31,44,51,43,51,42,51,44,52,43,52,42,52,45,53,41,53,45,55,46,55,41,55,40,55,43,65,43,66,42,65,42,66");
			}
		});
		guncode.setBounds(491, 363, 115, 29);
		frame.getContentPane().add(guncode);
		
		invalidalert = new JLabel("Invalid Entry!");
		invalidalert.setForeground(Color.RED);
		invalidalert.setFont(new Font("Tahoma", Font.ITALIC, 17));
		invalidalert.setBounds(84, 253, 106, 20);
		invalidalert.setVisible(false);
		frame.getContentPane().add(invalidalert);
		
		invalidalerttwo = new JLabel("Invalid Entry!");
		invalidalerttwo.setForeground(Color.RED);
		invalidalerttwo.setFont(new Font("Tahoma", Font.ITALIC, 17));
		invalidalerttwo.setBounds(84, 313, 106, 20);
		invalidalerttwo.setVisible(false);
		frame.getContentPane().add(invalidalerttwo);
		
		refrate = new JTextField();
		refrate.setBounds(211, 282, 146, 26);
		frame.getContentPane().add(refrate);
		refrate.setColumns(10);
		
		
		JLabel lblAutoRefreshRate = new JLabel("Auto Refresh Rate: ");
		lblAutoRefreshRate.setBounds(66, 285, 139, 20);
		frame.getContentPane().add(lblAutoRefreshRate);
		
		JLabel lblDefaultsTo = new JLabel("Defaults to 500 if error occurs.");
		lblDefaultsTo.setVerticalAlignment(SwingConstants.TOP);
		lblDefaultsTo.setBounds(221, 314, 239, 29);
		frame.getContentPane().add(lblDefaultsTo);
	}
}
