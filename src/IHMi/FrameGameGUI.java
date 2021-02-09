package IHMi;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;

import Process.GroupProcess;
import Process.WorldCupProcess;
import data.Group;
import data.WorldCup;




public class FrameGameGUI extends JFrame implements Runnable,MouseListener,KeyListener{

	private Dashboard dashboard ;
	private boolean stop = true;
	public FrameGameGUI(String title) throws InterruptedException {
		super(title);
		setFocusable(true);
		addKeyListener(this);
		dashboard = new Dashboard();
		init();
		launchGUI();
	}
	
	private void launchGUI() {
		stop = false;		
		Thread chronoThread = new Thread(this);
		chronoThread.start();
	}
	
	
	
	public void init() {
		
		new JFrame("Mouse Game");
		setResizable(false);
		setSize(1100,520);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);
	
		/*JButton nextTurnButton = new JButton("Next");
		nextTurnButton.setFocusable(false);
		nextTurnButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				updateGUI();
			}
		});*/
			
		JPanel statPanel = new JPanel();
		statPanel.setBounds(1002,5,190,480);
		add(statPanel);
		
		dashboard.setBounds(1,1,910,480);
		getContentPane().add(dashboard);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	

	public void updateGUI() {
		//dashboard.updateUI();
		//dashboard.repaint();
		
	}
	

	public void run() {
		while(!stop) {	
			updateGUI();
			try {
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
