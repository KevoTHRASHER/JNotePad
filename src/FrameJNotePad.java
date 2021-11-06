import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Dimension;

public class FrameJNotePad extends JFrame {

	public FrameJNotePad() {

		this.setLayout(null);
		this.getContentPane().setBackground(Color.BLACK);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setMinimumSize(new Dimension(360,420));
		this.setPreferredSize(new Dimension(420,540));
		this.setBounds(0,0,640,500);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
}
