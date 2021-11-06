import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;
import javax.swing.JSeparator;
import javax.swing.JFileChooser;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.BorderLayout;
import java.io.File;

public class PanelJNotePad extends JPanel implements ActionListener {

	private JMenuBar menuBar;
	private JMenu menuFile, menuEdit, menuHelp;
	private JMenuItem menuItemNew, menuItemOpen, menuItemSave, menuItemExit, menuCut, menuCopy, menuPaste;
	private JTextArea textArea;

	public PanelJNotePad() {

		this.setLayout(new BorderLayout());

		menuBar = new JMenuBar();
		menuBar.setBackground(new Color(102,0,153));
		menuBar.setForeground(Color.GREEN);
		this.add(menuBar, BorderLayout.NORTH);

		menuFile = new JMenu("File");
		menuFile.setForeground(Color.GREEN);
		menuBar.add(menuFile);

		menuEdit = new JMenu("Edit");
		menuEdit.setForeground(Color.GREEN);
		menuBar.add(menuEdit);

		menuHelp = new JMenu("Help");
		menuHelp.setForeground(Color.GREEN);
		menuBar.add(menuHelp);

		menuItemNew = new JMenuItem("New");
		menuItemNew.setBackground(new Color(102,0,153));
		menuItemNew.setForeground(Color.GREEN);
		menuItemNew.addActionListener(this);
		menuFile.add(menuItemNew);

		menuItemOpen = new JMenuItem("Open");
		menuItemOpen.setBackground(new Color(102,0,153));
		menuItemOpen.setForeground(Color.GREEN);
		menuItemOpen.addActionListener(this);
		menuFile.add(menuItemOpen);

		menuItemSave = new JMenuItem("Save");
		menuItemSave.setBackground(new Color(102,0,153));
		menuItemSave.setForeground(Color.GREEN);
		menuItemSave.addActionListener(this);
		menuFile.add(menuItemSave);

		menuFile.addSeparator();

		menuItemExit = new JMenuItem("Exit");
		menuItemExit.setBackground(new Color(102,0,153));
		menuItemExit.setForeground(Color.GREEN);
		menuItemExit.addActionListener(this);
		menuFile.add(menuItemExit);

		menuCut = new JMenuItem("Cut");
		menuCut.setBackground(new Color(102,0,153));
		menuCut.setForeground(Color.GREEN);
		menuCut.addActionListener(this);
		menuEdit.add(menuCut);

		menuCopy = new JMenuItem("Copy");
		menuCopy.setBackground(new Color(102,0,153));
		menuCopy.setForeground(Color.GREEN);
		menuCopy.addActionListener(this);
		menuEdit.add(menuCopy);

		menuPaste = new JMenuItem("Paste");
		menuPaste.setBackground(new Color(102,0,153));
		menuPaste.setForeground(Color.GREEN);
		menuPaste.addActionListener(this);
		menuEdit.add(menuPaste);
	
		this.setBackground(new Color(102,0,153));
		this.setBounds(0,0,640,500);
		this.setVisible(true);


	}

	@Override
	public void actionPerformed(ActionEvent ae) {

		if(ae.getSource() == menuItemNew) {
			
		}

		if(ae.getSource() == menuItemOpen) {
			JFileChooser objFileChooser = new JFileChooser();
			objFileChooser.showOpenDialog(this);
		}

		if(ae.getSource() == menuItemSave) {
			JFileChooser objFileChooser = new JFileChooser();
			objFileChooser.showSaveDialog(this);
		}

		if(ae.getSource() == menuItemExit) {
			if (JOptionPane.showConfirmDialog(null,"Do you want to EXIT?","EXIT JNotePad",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION){
				System.exit(0);
			}
		}

	}

}
