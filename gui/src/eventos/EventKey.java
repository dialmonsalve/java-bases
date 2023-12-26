package eventos;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class EventKey {

	public static void main(String[] args) {
		MyFrameEventKey myFrame = new MyFrameEventKey();

		myFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);


	}

}


class MyFrameEventKey extends JFrame {
	public MyFrameEventKey() {
		setTitle("Botones y eventos");
		setBounds(400, 200, 500, 300);

		EventKeys myKey = new EventKeys();
		addKeyListener(myKey);
		
		setVisible(true);
	}
}

class EventKeys implements KeyListener {

	@Override
	public void keyPressed(KeyEvent e) {
		System.out.println(e.getKeyCode());
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
