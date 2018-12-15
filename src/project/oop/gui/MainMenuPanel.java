package project.oop.gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import project.oop.DrawUtil;
import project.oop.Game;

public class MainMenuPanel extends GuiPanel{
	
	private Font titleFont = Game.main.deriveFont(100f);
	private String title = "2048";
	private int buttonWidth = 220;
	private int spacing = 90;
	private int buttonHeight = 60;
	
	public MainMenuPanel() {
		super();
		
		GuiButton playButton = new GuiButton(Game.WIDTH / 2 - buttonWidth / 2, 220, buttonWidth, buttonHeight);
//		GuiButton scoresButton = new GuiButton(Game.WIDTH / 2 - buttonWidth / 2, playButton.getY()+spacing, buttonWidth, buttonHeight);
//		GuiButton quiteButton = new GuiButton(Game.WIDTH / 2 - buttonWidth / 2, scoresButton.getY()+spacing, buttonWidth, buttonHeight);
		GuiButton quiteButton = new GuiButton(Game.WIDTH / 2 - buttonWidth / 2, playButton.getY()+spacing, buttonWidth, buttonHeight);
		
		playButton.setText("Play");
//		scoresButton.setText("Scores");
		quiteButton.setText("Quit");
		
		playButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				GuiScreen.getInstance().setCurrentPanel("Play");
			}
			
		});
		
//		scoresButton.addActionListener(new ActionListener() {
//
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				GuiScreen.getInstance().setCurrentPanel("Leaderboards");
//			}
//		});	
		
		quiteButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
			
		});
		
		add(playButton);
//		add(scoresButton);
		add(quiteButton);
	}
	
	@Override
	public void render(Graphics2D g) {
		super.render(g);
		g.setFont(titleFont);
		g.setColor(Color.black);
		g.drawString(title, Game.WIDTH / 2 - DrawUtil.getMessageWidth(title, titleFont, g) / 2, 150);
	}
}
