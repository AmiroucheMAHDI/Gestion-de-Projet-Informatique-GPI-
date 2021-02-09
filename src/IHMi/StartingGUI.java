package IHMi;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class StartingGUI extends JFrame implements ActionListener{
	
	private static final long serialVersionUID = 1L;
	private JFrame frame;
	private Cursor handCursor = new Cursor(Cursor.HAND_CURSOR);

	public static void main(String[] args) {
		new StartingGUI();
	}

	public StartingGUI() {
		super();
		initialize();
	}


	private void initialize() {
		frame = new JFrame("JEU");
		frame.setResizable(false);
		frame.getContentPane().setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		frame.setBounds(100, 100, 570, 310);
		frame.getContentPane().setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(frame.getParent());
		
		JButton buttonSelectPlayMode = new JButton("Start Game");
		buttonSelectPlayMode.setContentAreaFilled(false);
		buttonSelectPlayMode.setBorderPainted(false);
		buttonSelectPlayMode.setIcon(new ImageIcon(StartingGUI.class.getResource("/start.png")));
		buttonSelectPlayMode.addActionListener(this);
		buttonSelectPlayMode.setBounds(170,75, 240, 56);
		frame.getContentPane().add(buttonSelectPlayMode);
		buttonSelectPlayMode.addActionListener(this);
		
		JButton aide = new JButton("HELP");
		aide.setContentAreaFilled(false);
		aide.setBorderPainted(false);
		aide.setIcon(new ImageIcon(StartingGUI.class.getResource("/help.png")));
		aide.addActionListener(this);
		aide.setBounds(170, 150, 240, 56);
		frame.getContentPane().add(aide);
		aide.addActionListener(this);
		
		JLabel labelImage = new JLabel("");
		labelImage.setIcon(new ImageIcon(StartingGUI.class.getResource("/fond.jpg")));
		labelImage.setBounds(0, 0, 559, 274);
		frame.getContentPane().add(labelImage);
		frame.setVisible(true);
	}

public void actionPerformed(ActionEvent event) {
		
		
		if(event.getActionCommand().equals("Start Game")) {
			try {
				new FrameGameGUI("Game");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			frame.dispose();
		}else if(event.getActionCommand().equals("HELP")) {
			new JOptionPane();
		JOptionPane.showMessageDialog(null,"Des questions sur le jeu?\n"+"Contactez l'équipe:\n","Notice",JOptionPane.INFORMATION_MESSAGE);
		}
		
	}
}