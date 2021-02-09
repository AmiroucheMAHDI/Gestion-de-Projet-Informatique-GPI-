package IHM;

import java.awt.*;


import javax.swing.*;


public class Gui_Team extends JFrame {
	private JButton j1,j2,j3,j4=new JButton("test");
	
	public static ImageIcon background=new ImageIcon("src/image/terrain.png");
	public static ImageIcon joueur=new ImageIcon(new ImageIcon("src/image/joueur.jpg").getImage().getScaledInstance(150, 150, Image.SCALE_DEFAULT));
	
	public static JFrame Gui_Team(JFrame jf) {
		
			
		JPanel container = new JPanel();
		jf.add(new JLabel(background));
	    jf.setTitle("Grid Bag Layout");
	    jf.setSize(12024, 900);
	    jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    GridBagLayout gridbag = new GridBagLayout();
	    container.setLayout(gridbag);
	    jf.setLayout(gridbag);
	    
	    GridBagConstraints c = new GridBagConstraints();
	  
	    c.insets.top = 50;
	    c.insets.bottom = 50;
	    c.insets.left = 50;
	    c.insets.right = 50;
	    
	    c.weightx=50;
	    c.weighty=50;
	    
	    c.anchor=GridBagConstraints.CENTER;
	    
	    c.gridx = 0;
	    c.gridy = 0;
	    JButton a=new JButton(joueur);
	    gridbag.setConstraints(a, c);
	    container.add(a);
	    c.gridx = 0;
	    c.gridy = 2;
	    JButton b=new JButton(joueur);
	    gridbag.setConstraints(b, c);
	    container.add(b);
	    c.gridx = 0;
	    c.gridy = 4;

	    JButton cc=new JButton(joueur);
	    gridbag.setConstraints(cc, c);
	    container.add(cc);
	    c.gridx = 0;
	    c.gridy = 6;
	    JButton d=new JButton(joueur);
	    gridbag.setConstraints(d, c);
	    container.add(d);	    
	    c.gridx = 2;
	    c.gridy = 0;
	    JButton f=new JButton(joueur);
	    gridbag.setConstraints(f, c);
	    container.add(f);
	    c.gridx = 2;
	    c.gridy = 2;
	    JButton g=new JButton(joueur);
	    gridbag.setConstraints(g, c);
	    container.add(g);
	    c.gridx = 2;
	    c.gridy = 4;
	    JButton h=new JButton(joueur);
	    gridbag.setConstraints(h, c);
	    container.add(h);
	    c.gridx = 2;
	    c.gridy = 6;
	    JButton i=new JButton(joueur);
	    gridbag.setConstraints(i, c);
	    container.add(i);
	    c.gridx = 4;
	    c.gridy = 4;
	    JButton j=new JButton(joueur);
	    gridbag.setConstraints(j, c);
	    container.add(j);
	    c.gridx = 4;
	    c.gridy = 2;
	    JButton l=new JButton(joueur);
	    gridbag.setConstraints(l, c);
	    container.add(l);
	    
	    jf.pack();
	    jf.setContentPane(container);
	    jf.setVisible(true);
	   
	    return jf;
			
	}
}
