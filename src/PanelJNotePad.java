import javax.swing.JPanel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelJNotePad extends JPanel implements ActionListener {

	private JMenuBar menuBar;
	private JMenu menuFile, menuEdit, menuHelp;
	private JMenuItem menuItemNew, menuItemOpen, menuItemSave, menuItemExit;
	private JTextArea textArea;

	public PanelJNotePad() {

		this.setLayout(null);

		menuBar = new JMenuBar();
		this.setJMenuBar(menuBar);

		menuFile = new JMenu("File");
		menuBar.add(menuFile);


		menuEdit = new JMenu("Edit");
		menuBar.add(menuEdit);

		menuHelp = new JMenu("Help");
		menuBar.add(menuHelp);

		this.setBackground(new Color(102,0,153));
		this.setBounds(0,0,640,500);
		this.setVisible(true);


	}

	@Override
	public void actionPerformed(ActionEvent ae) {

	}

}
