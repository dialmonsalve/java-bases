package gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class FirstPanel {

	public static void main(String[] args) {

		MyFrameWihPanel myFrame = new MyFrameWihPanel();

		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MyFrameWihPanel extends JFrame {
	public MyFrameWihPanel() {
		Toolkit myScreen = Toolkit.getDefaultToolkit();
		Dimension sizeScreen = myScreen.getScreenSize();
		int widthScreen = sizeScreen.width;
		int heightScreen = sizeScreen.height;
		setTitle("Marco centrado");

		// setSize(500, 300);
		// setLocation(500, 300);
		setBounds(widthScreen / 4, heightScreen / 4, widthScreen / 2, heightScreen / 2);

		Lamina myPanel = new Lamina();
		Color myColor = new Color(0, 0, 0, 95);
		myPanel.setBackground(myColor);

		add(myPanel);

		setVisible(true);
	}
}

class Lamina extends JPanel {
	@Override
	public void paintComponent(Graphics graf) {
		super.paintComponent(graf);
		graf.drawString("Aprendiendo Swing", 100, 100);

		graf.drawRect(50, 50, 200, 200);
	}
}
