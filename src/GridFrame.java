import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

@SuppressWarnings("serial")
public class GridFrame extends JFrame {	
	
	public AutoCellThread thread;
	public static int gencount = 0;
	public static int trigger = -1;
	public static int hello = 5;
	public static JTextField gendisplaynum;
	
	public GridFrame() {
		
		//Change these dimensions later. Avoid hard coding width and height
		setSize(new Dimension(1000, 800));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setResizable(false);
		getContentPane().setLayout(null);
		validate();
		
		gendisplaynum = new JTextField();
		gendisplaynum.setBounds(845, 150, 110, 30);
		gendisplaynum.setEditable(false);
		getContentPane().add(gendisplaynum);
		
		
		JButton closeFrame = new JButton("Close Frame");
		closeFrame.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				gencount = 0;
				setVisible(false);
			}
		});
		closeFrame.setBounds(845,20,110,30);
		getContentPane().add(closeFrame);
		
		JButton newFrame = new JButton("Next Iteration");
		newFrame.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//setVisible(false);
				new CellStateChanges();
				SwingUtilities.updateComponentTreeUI(GridFrame.this);
				gencount++;
				gendisplaynum.setText(Integer.toString(gencount));
			}
		});
		newFrame.setBounds(845,70,110,30);
		getContentPane().add(newFrame);
		
		JButton autoFrame = new JButton("Auto Run/Stop");
		autoFrame.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
					trigger *= -1;
					
					if(trigger == 1){
						thread = new AutoCellThread(GridFrame.this);
						thread.start();
					}
					else{
						thread.stop();
					}
					
				}
		});
		autoFrame.setBounds(845,300,110,30);
		getContentPane().add(autoFrame);
		
		
		JLabel gencounterlbl = new JLabel("generation #: ");
		gencounterlbl.setBounds(845,120,110,30);
		getContentPane().add(gencounterlbl);
	
		
		
	}
	
	
	
	public int realHeight = this.getHeight() + 29;	
	
	public void paint(Graphics g) {
	
		super.paint(g);
		
		g.setColor(Color.LIGHT_GRAY);
		g.fillRect(10,30,800,760);
		
		g.setColor(Color.BLACK);
		for(int x = 40; x <= 800; x+= 10) {
			g.drawLine(10, x, 810, x); //draws the horizontal lines
		}
		for(int x = 10; x <= 810; x+= 10) {
			g.drawLine(x, 40, x, 790); //draws the vertical lines
		}
		
		
			 
		
		for(int r = 0; r < 75; r++) {
			for(int t = 0; t < 80; t++) {
				
				if(CellManipulation.focusedArray[r][t].state == true)
					g.setColor(Color.ORANGE);
				else if(CellManipulation.focusedArray[r][t].state == false)
					g.setColor(Color.LIGHT_GRAY);
				
				g.fillRect(CellManipulation.focusedArray[r][t].x, CellManipulation.focusedArray[r][t].y, 9, 9);
			}
		}
		
	}
}