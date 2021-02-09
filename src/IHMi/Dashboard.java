package IHMi;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import Process.*;
import data.*;

public class Dashboard extends JPanel{

	private String modeScene = "winner";
	private String modePool = "match";
	private ImageIcon pics;
	private static Group A;
	private static Group B;
	private static Group C;
	private static Group D;
	WorldCup WC;
	private Font fonte = new Font(" ARIAL ",Font.BOLD,40);
	private Font font = new Font(" ARIAL ",Font.ITALIC,20);
	private Font font1 = new Font(" ARIAL ",Font.ITALIC,20);
	private Font win = new Font(" ARIAL ",Font.ITALIC,60);
	public Dashboard() throws InterruptedException {
		super();
		ArrayList<Team> team=new ArrayList<Team>();
		Team t1=EquipeProcess.EquipeProcess("Algerie");
		Team t2=EquipeProcess.EquipeProcess("Maroc");	
		Team t3=EquipeProcess.EquipeProcess("Tunisie");	
		Team t4=EquipeProcess.EquipeProcess("Egypte");	
		
		Team t5=EquipeProcess.EquipeProcess("France");
		Team t6=EquipeProcess.EquipeProcess("England");	
		Team t7=EquipeProcess.EquipeProcess("Allemagne");	
		Team t8=EquipeProcess.EquipeProcess("Espagne");
		
		Team t9=EquipeProcess.EquipeProcess("Pologne");
		Team t10=EquipeProcess.EquipeProcess("US");	
		Team t11=EquipeProcess.EquipeProcess("Brazil");	
		Team t12=EquipeProcess.EquipeProcess("Argentine");
		
		Team t13=EquipeProcess.EquipeProcess("Australie");
		Team t14=EquipeProcess.EquipeProcess("Canada");	
		Team t15=EquipeProcess.EquipeProcess("Finlande");	
		Team t16=EquipeProcess.EquipeProcess("Italie");
		
		team.add(t1);
		team.add(t2);
		team.add(t3);
		team.add(t4);
		team.add(t5);
		team.add(t6);
		team.add(t7);
		team.add(t8);
		team.add(t9);
		team.add(t10);
		team.add(t11);
		team.add(t12);
		team.add(t13);
		team.add(t14);
		team.add(t15);
		team.add(t16);
		
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");  
		LocalDateTime now = LocalDateTime.now();
		WC=new WorldCup(dtf.format(now),"Paris",team);
		//WC= WorldCupProcess.WorldCupProcess();
	}
	
	public void paintComponent(Graphics g) {
		setBorder(BorderFactory.createEtchedBorder());
		super.paintComponent(g);
		if (modeScene.equals("pool")) {
			paintPool(g,WC);
		} else if (modeScene.equals("competition")) {
			paintCompetition(g, WC);
		} else if(modeScene.equals("winner")){
			paintWinner(g);
		}
	
	}
	
	private void paintPool(Graphics g, WorldCup WC){
		Graphics g2 = (Graphics2D) g;
		drawGround(g2);
		if (modePool.equals("formation")) {
			drawPool("Groupe A",WC.getTeamInit(0).getName(),WC.getTeamInit(1).getName(),WC.getTeamInit(2).getName(),WC.getTeamInit(3).getName(),20,10,g);
			drawPool("Groupe B",WC.getTeamInit(4).getName(),WC.getTeamInit(5).getName(),WC.getTeamInit(6).getName(),WC.getTeamInit(7).getName(),20,250,g);
			drawPool("Groupe C",WC.getTeamInit(8).getName(),WC.getTeamInit(9).getName(),WC.getTeamInit(10).getName(),WC.getTeamInit(11).getName(),475,10,g);
			drawPool("Groupe D",WC.getTeamInit(12).getName(),WC.getTeamInit(13).getName(),WC.getTeamInit(14).getName(),WC.getTeamInit(15).getName(),475,250,g);
		} else if (modePool.equals("match")) {
			drawPoolMatch("Groupe A",WC.getTeamInit(0).getName(),WC.getTeamInit(1).getName(),WC.getTeamInit(2).getName(),WC.getTeamInit(3).getName(),20,10,g);
			drawPoolMatch("Groupe B",WC.getTeamInit(4).getName(),WC.getTeamInit(5).getName(),WC.getTeamInit(6).getName(),WC.getTeamInit(7).getName(),20,250,g);
			drawPoolMatch("Groupe C",WC.getTeamInit(8).getName(),WC.getTeamInit(9).getName(),WC.getTeamInit(10).getName(),WC.getTeamInit(11).getName(),475,10,g);
			drawPoolMatch("Groupe D",WC.getTeamInit(12).getName(),WC.getTeamInit(13).getName(),WC.getTeamInit(14).getName(),WC.getTeamInit(15).getName(),475,250,g);
		}else if (modePool.equals("result")) {
			//drawPool("Groupe A",a.getTeam1()+" "+a.getPoint1(),a.getTeam2()+" "+a.getPoint2(),a.getTeam3()+" "+a.getPoint3(),a.getTeam4()+" "+a.getPoint4(),20,10,g);
			drawPool("Groupe B","e","e","e","e",20,250,g);
			drawPool("Groupe C","e","e","e","e",475,10,g);
			drawPool("Groupe D","e","e","e","e",475,250,g);
		}
		
	}
	
	private void paintCompetition(Graphics g, WorldCup WC){
		Graphics g2 = (Graphics2D) g;
		drawGround(g2);
		drawCompetition("Equipe 1","0-0","Equipe 2",20,10,g);
		drawCompetition("Equipe 1","0-0","Equipe 2",20,130,g);
		drawCompetition("Equipe 1","0-0","Equipe 2",20,250,g);
		drawCompetition("Equipe 1","0-0","Equipe 2",20,370,g);
		drawCompetition("Equipe 1","0-0","Equipe 2",320,70,g);
		drawCompetition("Equipe 1","0-0","Equipe 2",320,310,g);
		drawCompetition("Equipe 1","0-0","Equipe 2",620,190,g);
	}
	
	private void paintWinner(Graphics g){
		pics = new ImageIcon(getClass().getResource("/cupp.png"));
		Image img = pics.getImage();
		g.drawImage(img,0,0,null);
		Color C = new Color(120,120,120,147);
		g.setColor(C);
        g.fillRect(70,115,770,250);
        g.setColor(new Color(255,255,255));
        g.setFont(win);
        g.drawString("The winner is :", 245, 200 );
        g.drawString("Equipe", 350, 280 );
		
	}
	
	public void drawGround(Graphics g) {
		pics = new ImageIcon(getClass().getResource("/7.jpg"));
		Image img = pics.getImage();
		g.drawImage(img,0,0,null);
	}
	
	public void drawPool(String pool,String e1,String e2,String e3,String e4,int x, int y ,Graphics g) {
		
		Color C = new Color(120,120,120,147);
		
		g.setColor(C);
        g.fillRect(x, y, 415,220);
        g.setColor(new Color(255,255,255));
        g.setFont(fonte);
        g.drawString(pool, x+125, y+30 );
        g.setFont(font);
        g.drawString("• "+e1, x+150, y+70 );
        g.setFont(font);
        g.drawString("• "+e2, x+150, y+110 );
        g.setFont(font);
        g.drawString("• "+e3, x+150, y+150 );
        g.setFont(font);
        g.drawString("• "+e4, x+150, y+190 );
	}
	
public void drawPoolMatch(String pool,String e1,String e2,String e3,String e4,int x, int y ,Graphics g) {
		
		Color C = new Color(120,120,120,147);
		
		g.setColor(C);
        g.fillRect(x, y, 415,220);
        g.setColor(new Color(255,255,255));
        g.setFont(fonte);
        g.drawString(pool, x+125, y+30 );
        g.setFont(font1);
        g.drawString("• "+e1+" VS "+e2, x+100, y+60 );
        g.setFont(font1);
        g.drawString("• "+e3+" VS "+e4, x+100, y+90 );
        g.setFont(font1);
        g.drawString("• "+e1+" VS "+e3, x+100, y+120 );
        g.setFont(font1);
        g.drawString("• "+e2+" VS "+e4, x+100, y+150 );
        g.setFont(font1);
        g.drawString("• "+e1+" VS "+e4, x+100, y+180 );
        g.setFont(font1);
        g.drawString("• "+e2+" VS "+e3, x+100, y+210 );
	}
	
	public void drawCompetition(String e1,String scr,String e2, int x,int y,Graphics g) {
		
		Color C = new Color(120,120,120,127);
		g.setColor(C);
        g.fillRect(x, y,260,100);
        g.setColor(new Color(255,255,255));
        g.setFont(font);
        g.drawString(e1, x+85, y+20 );
        g.setFont(font);
        g.drawString(scr, x+110, y+50 );
        g.setFont(font);
        g.drawString(e2, x+85, y+85 );
	}
}
