package gui;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Calculator {

	public static void main(String[] args) {

		FrameCalculator myFrame = new FrameCalculator();

		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class FrameCalculator extends JFrame {
	public FrameCalculator() {
		setTitle("Calculator");
		setBounds(500, 300, 230, 270);
		CalculatorTItle myLayout = new CalculatorTItle();

		add(myLayout);

		setVisible(true);
	}
}

class CalculatorTItle extends JPanel {
	private JButton btnScreen;
	private String[] tags = { "7", "8", "9", "/", "4", "5", "6", "*", "1", "2", "3", "-", "0", ".",
			"=", "+" };
	private JPanel buttonsZOne;
	private boolean init = true;
	private double result;
	private String lastOperation = "";

	public CalculatorTItle() {

		setLayout(new BorderLayout());

		btnScreen = new JButton("0");
		btnScreen.setEnabled(false);

		add(btnScreen, BorderLayout.NORTH);

		buttonsZOne = new JPanel();
		buttonsZOne.setLayout(new GridLayout(4, 4));

		for (String tag : tags) {
			JButton btn = new JButton(tag);

			if (tag.equals("+") || tag.equals("-") || tag.equals("=") || tag.equals(".")
					|| tag.equals("*") || tag.equals("/")) {
				btn.addActionListener(new Operations());
			} else {
				btn.addActionListener(new InsertNumber());
			}
			buttonsZOne.add(btn);
		}

		add(buttonsZOne, BorderLayout.CENTER);

	}

	private class InsertNumber implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			String entry = e.getActionCommand();
			if (init) {
				btnScreen.setText("");
				init = false;
			}
			btnScreen.setText(btnScreen.getText() + entry);
		}

	}

	private class Operations implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			String operation = e.getActionCommand();
			this.calculate(Double.parseDouble(btnScreen.getText()));
			lastOperation = operation;
			init = true;
		}

		public void calculate(Double number) {
			if (lastOperation.equals("+")) {
				result += number;
			} else if (lastOperation.equals("-")) {
				result -= number;
			} else if (lastOperation.equals("*")) {
				result *= number;
			} else if (lastOperation.equals("/")) {
				result /= number;
			} else if (lastOperation.equals("")) {
				result = number;
			}
			btnScreen.setText("" + result);
		}

	}

}