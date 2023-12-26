package eventos;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;

import javax.swing.*;

public class MultipleSource {

	public static void main(String[] args) {
		MyFrameWhitButtons2 myFrame = new MyFrameWhitButtons2();

		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MyFrameWhitButtons2 extends JFrame {
	public MyFrameWhitButtons2() {
		setTitle("Botones y eventos");
		setBounds(400, 200, 500, 300);
		LayoutWithButtons2 myLayout = new LayoutWithButtons2();
		
		myLayout.setLayout(new FlowLayout(FlowLayout.LEFT,40,40));

		add(myLayout);

		setVisible(true);
	}
}

class LayoutWithButtons2 extends JPanel {
	private JButton btnBlue;
	private JButton btnRed;
	private JButton btnYellow;

	public LayoutWithButtons2() {
		ActionColor actionYellow = new ActionColor("Yellow", new ImageIcon(""), Color.yellow);
		ActionColor actionBlue = new ActionColor("Blue", new ImageIcon(""), Color.blue);
		ActionColor actionRed = new ActionColor("Red", new ImageIcon(""), Color.red);
		
		
		btnBlue = new JButton(actionBlue);
		btnBlue.setSize(200, 200);		

		add(btnBlue);
		add(new JButton(actionRed));
		add(new JButton(actionYellow));
		InputMap entryMap = getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);

		KeyStroke keyYellow = KeyStroke.getKeyStroke("ctrl A");
		KeyStroke keyBlue = KeyStroke.getKeyStroke("ctrl B");
		KeyStroke keyRed = KeyStroke.getKeyStroke("ctrl R");

		entryMap.put(keyYellow, "backGroundYellow");
		entryMap.put(keyBlue, "backGroundBlue");
		entryMap.put(keyRed, "backGroundRed");

		ActionMap actionMap = getActionMap();
		actionMap.put("backGroundYellow", actionYellow);
		actionMap.put("backGroundBlue", actionBlue);
		actionMap.put("backGroundRed", actionRed);
	}

	private class ActionColor extends AbstractAction {

		public ActionColor(String name, Icon icon, Color colorBtn) {
			putValue(Action.NAME, name);
			putValue(Action.SMALL_ICON, icon);
			putValue(Action.SHORT_DESCRIPTION, "Poner la lamina del color " + name);
			putValue("color_de_fondo", colorBtn);

		}

		@Override
		public void actionPerformed(ActionEvent e) {
			Color c = (Color) getValue("color_de_fondo");
			setBackground(c);
		}

	}
}
