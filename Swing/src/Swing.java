import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Swing extends JFrame {
	public Swing() {
		super("Hello World");
		setUndecorated(true);
		getContentPane().setLayout(new FlowLayout());
		JLabel label = new JLabel("잠와요 교수님");
		getContentPane().add(label);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(400, 400);
		setVisible(true);
	}
	public static void main(String[] args) {
		Swing app = new Swing();
	}
}
