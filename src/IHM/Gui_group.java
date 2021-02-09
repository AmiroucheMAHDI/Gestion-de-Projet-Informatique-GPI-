package IHM;

import java.awt.*;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import Process.*;
import data.WorldCup;

public class Gui_group {
	
	private static JTextArea vainqueur=new JTextArea("Welcome to the new WC,\n select the new stage to starts the tournement");
	
	public static JTextArea getVainqueur() {
		return vainqueur;
	}
	public static void setVainqueur(JTextArea vainqueur) {
		Gui_group.vainqueur = vainqueur;
	}
	
	public static JFrame Gui_group(WorldCup WC) {
		
		
	
		JPanel container2 = new JPanel();
		JPanel container = new JPanel();
	    
	    
	   
	   BorderLayout windows=new BorderLayout(10,10);
	    
	    GridLayout a=new GridLayout (3,3,5,5);
	    JPanel combined=new JPanel(); 
	    combined.setLayout(a);
	    
	    GridLayout gridbag = new GridLayout(2,2,15,15);
	    
	    
	    container.setLayout(gridbag);
	    container2.setLayout(gridbag);
	    
	    JButton a1=new JButton(WC.getTeamInit(0).getName());
	    container.add(a1);
	   
	    JButton a2=new JButton(WC.getTeamInit(1).getName());
	    container.add(a2);
	    
	    JButton a3=new JButton(WC.getTeamInit(2).getName());
	    container.add(a3);
	    
	    JButton a4=new JButton(WC.getTeamInit(3).getName());
	    container.add(a4);
	    

		
		JPanel container4 = new JPanel();
		container4.setLayout(gridbag );
	    
	    JButton b1=new JButton(WC.getTeamInit(4).getName());
	    container2.add(b1);
	    
	    JButton b2=new JButton(WC.getTeamInit(5).getName());
	    container2.add(b2);
	    
	    JButton b3=new JButton(WC.getTeamInit(6).getName());
	    container2.add(b3);
	    
	    JButton b4=new JButton(WC.getTeamInit(7).getName());
	    container2.add(b4);
	    
	  
	   
		
		JPanel container7 = new JPanel();
		container7.setLayout(gridbag );
		
		JButton c1=new JButton(WC.getTeamInit(8).getName());
	    container7.add(c1);
	    
	    JButton c2=new JButton(WC.getTeamInit(9).getName());
	    container7.add(c2);
	    
	    JButton c3=new JButton(WC.getTeamInit(10).getName());
	    container7.add(c3);
	    
	    JButton c4=new JButton(WC.getTeamInit(11).getName());
	    container7.add(c4);
	    
	    JPanel container3 = new JPanel();
		container3.setLayout(gridbag );
		
	    JPanel container5 = new JPanel();
		container5.setLayout(gridbag );
		
		JPanel container6 = new JPanel();
		container6.setLayout(gridbag );
		
		JPanel container8 = new JPanel();
		container8.setLayout(gridbag );
		
		JPanel container9=new JPanel();
		container9.setLayout(gridbag);
		
		JButton d1=new JButton(WC.getTeamInit(12).getName());
	    container9.add(d1);
	    
	    JButton d2=new JButton(WC.getTeamInit(13).getName());
	    container9.add(d2);
	    
	    JButton d3=new JButton(WC.getTeamInit(14).getName());
	    container9.add(d3);
	    
	    JButton d4=new JButton(WC.getTeamInit(15).getName());
	    container9.add(d4);
	    
	    //add scoll bar to vainquer
	    JScrollPane scroll = new JScrollPane(vainqueur);
	    scroll.setSize( 100, 100 );;
	    
	    combined.add(container);
	    combined.add(container6);
	    combined.add(container7);
	    combined.add(container4);
	    combined.add(vainqueur);
	    combined.add(container5);
	    combined.add(container2);
	    combined.add(container8);
	    combined.add(container9);
	    
	    //partie info
	    
	    JButton info=new JButton("New Stage");
	    info.addActionListener(new ActionListener()
	    {
	    	  public void actionPerformed(ActionEvent e)
	    	  {
	    	    // display/center the jdialog when the button is pressed
	    	  }
	    	});
	    JButton info1=new JButton("info b");
	    JButton info2=new JButton("info c");
	    JButton info3=new JButton("info d");
	    
	    JPanel information=new JPanel();
	    GridLayout infor=new GridLayout(4,0,5,5);
	    information.setLayout(infor);
	    
	    information.add(info);
	    information.add(info1);
	    information.add(info2);
	    information.add(info3);
	    
	   
	    //end
	    
	   
	   
	    return null;
	}
	public static void setCommentaryGui(JFrame jf,String commentary) {
		JTextArea jt=getVainqueur();
		jt.append("\n");
		jt.append(commentary);
		jf.validate();

	}
}
