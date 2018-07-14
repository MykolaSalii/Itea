package myapp;

import java.io.File;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Picture extends JFrame {
	public Picture() {
		super("Picture");
		JPanel p1 = new JPanel();

		JLabel l1 = new JLabel();
		JLabel l2 = new JLabel();
		//File picture = new File("3316a6e58ac347b935962483cac6bab4.jpg");
		URL url = this.getClass().getClassLoader().getResource("3316a6e58ac347b935962483cac6bab4.jpg");
		l1.setIcon(new ImageIcon(url.getFile()));
		l2.setText(url.toString());
		
		p1.add(l1);
		p1.add(l2);
		add(p1);
		setResizable(true);
		setSize(850, 400);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new Picture();
	}

}
