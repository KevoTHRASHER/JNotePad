import javax.swing.JFrame;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.BorderLayout;

public class FrameJNotePad extends JFrame {

	PanelJNotePad objPanelJNotePad;

	public FrameJNotePad() {

		this.setLayout(new BorderLayout());

		objPanelJNotePad = new PanelJNotePad();

		add(objPanelJNotePad, BorderLayout.CENTER);
		getContentPane().setBackground(Color.BLACK);
		setTitle("JNotePad");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//setMinimumSize(new Dimension(360,420));
		setPreferredSize(new Dimension(800,600));
		ImageIcon icon = new ImageIcon(getClass().getResource("img/eva-01.jpg"));
		setIconImage(icon.getImage());
		setBounds(0,0,800,600);
		setResizable(true);
		setLocationRelativeTo(null);
		setVisible(true);
		pack();
	}
}
