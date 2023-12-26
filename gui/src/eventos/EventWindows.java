package eventos;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.event.WindowStateListener;

import javax.swing.JFrame;


public class EventWindows {

	public static void main(String[] args) {
		MyFrameEventWindows myFrame = new MyFrameEventWindows();
		MyFrameEventWindows myFrame2 = new MyFrameEventWindows();

		myFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		myFrame2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

	}

}

class MyFrameEventWindows extends JFrame {
	public MyFrameEventWindows() {
		setTitle("Botones y eventos");
		setBounds(400, 200, 500, 300);

		MyWindow windowListener = new MyWindow();
		addWindowListener(windowListener);
		addWindowStateListener(windowListener);
		
		
		setVisible(true);
	}
}

class MyWindow implements WindowListener, WindowStateListener {

	@Override
	public void windowActivated(WindowEvent arg0) {
		//System.out.println("window is Activated");

	}

	@Override
	public void windowClosed(WindowEvent arg0) {
		//System.out.println("window is Closed");

	}

	@Override
	public void windowClosing(WindowEvent arg0) {
		//System.out.println("window is Closing");

	}

	@Override
	public void windowDeactivated(WindowEvent arg0) {
		//System.out.println("window is Deactivated");

	}

	@Override
	public void windowDeiconified(WindowEvent arg0) {
		System.out.println("window is Deiconified");

	}

	@Override
	public void windowIconified(WindowEvent arg0) {
		//System.out.println("window is Iconified");

	}

	@Override
	public void windowOpened(WindowEvent arg0) {
		//System.out.println("window is Opened");

	}

	@Override
	public void windowStateChanged(WindowEvent e) {
		System.out.println("window State is Changed");
		
		int newState = e.getNewState();
		
		if (newState == Frame.MAXIMIZED_BOTH) {
			System.out.println("Panalla completa");
		}
		
	}

}

class MyWindow2 extends WindowAdapter{

	@Override
	public void windowDeactivated(WindowEvent arg0) {
		System.out.println("window is Deactivated");

	}

}