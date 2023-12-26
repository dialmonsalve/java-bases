package gui;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;

public class FirstFrame {

	public static void main(String[] args) {
		MyFrame myFrame = new MyFrame();
		
		myFrame.setVisible(true);
		
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MyFrame extends JFrame {
	public MyFrame() {
		setTitle("Marco centrado");
		
		Toolkit myScreen = Toolkit.getDefaultToolkit();
		Dimension sizeScreen = myScreen.getScreenSize();
		int widthScreen = sizeScreen.width;
		int heightScreen = sizeScreen.height;
		// setSize(500, 300);
		// setLocation(500, 300);
		setBounds(widthScreen/4, heightScreen/4, widthScreen/2,heightScreen/2);
		
	}
}
