import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Dimension;

public class FrameJNotePad extends JFrame {

	PanelJNotePad objPanelJNotePad;

	public FrameJNotePad() {

		this.setLayout(null);

		objPanelJNotePad = new PanelJNotePad();

		this.add(objPanelJNotePad);
		this.getContentPane().setBackground(Color.BLACK);
		this.setTitle("JNotePad");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//this.setMinimumSize(new Dimension(360,420));
		//this.setPreferredSize(new Dimension(420,540));
		this.setBounds(0,0,640,500);
		this.setResizable(true);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		this.pack();
	}
}
