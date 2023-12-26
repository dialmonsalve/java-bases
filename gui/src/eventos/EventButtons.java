package eventos;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class EventButtons {

	public static void main(String[] args) {
		MyFrameWhitButtons myFrame = new MyFrameWhitButtons();

		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MyFrameWhitButtons extends JFrame {
	public MyFrameWhitButtons() {
		setTitle("Botones y eventos");
		setBounds(400, 200, 500, 300);
		LayoutWithButtons myLayout = new LayoutWithButtons();
		
		add(myLayout);


		setVisible(true);
	}
}

class LayoutWithButtons extends JPanel {
	private JButton btnBlue = new JButton("Blue");
	private JButton btnRed = new JButton("Red");
	private JButton btnYellow = new JButton("Yellow");

	public LayoutWithButtons() {

		BackGroundColor yellow = new BackGroundColor(Color.yellow);
		BackGroundColor blue = new BackGroundColor(Color.blue);
		BackGroundColor red = new BackGroundColor(Color.red);

		this.btnBlue.addActionListener(blue);
		this.btnRed.addActionListener(red);
		this.btnYellow.addActionListener(yellow);

		add(btnBlue);
		add(btnRed);
		add(btnYellow);
	}

	/*
	 * @Override public void actionPerformed(ActionEvent e) {
	 * 
	 * Object btnPulsado = e.getSource();
	 * 
	 * if (btnPulsado == (this.btnBlue)) { setBackground(Color.blue); return; } if
	 * (btnPulsado == (this.btnYellow)) { setBackground(Color.yellow); return; }
	 * setBackground(Color.red);
	 * 
	 * }
	 */
	private class BackGroundColor implements ActionListener {
		private Color color;

		public BackGroundColor(Color color) {
			this.color = color;
		}

		public void actionPerformed(ActionEvent e) {
			setBackground(color);
		}

	}
}