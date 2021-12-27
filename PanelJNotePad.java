import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JFileChooser;
import javax.swing.ImageIcon;
import javax.swing.KeyStroke;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.io.File;

public class PanelJNotePad extends JPanel implements ActionListener {

	private static ImageIcon imageAboutAutor;
	private JMenuBar menuBar;
	private JMenu menuFile, menuEdit, menuHelp;
	private JMenuItem menuItemNew, menuItemOpen, menuItemSave, menuItemPrint, menuItemExit, menuItemCut, menuItemCopy, menuItemPaste, menuItemSelectAll, menuItemAbout;
	private JTextArea textArea;
	private JScrollPane scrollPane;

	public PanelJNotePad() {

		this.setLayout(new BorderLayout());

		menuBar = new JMenuBar();
		menuBar.setBackground(new Color(102,0,153));
		menuBar.setForeground(Color.GREEN);
		this.add(menuBar, BorderLayout.NORTH);

		menuFile = new JMenu("File");
		menuFile.setForeground(Color.GREEN);
		menuFile.setMnemonic(KeyEvent.VK_F);
		menuBar.add(menuFile);

		menuEdit = new JMenu("Edit");
		menuEdit.setForeground(Color.GREEN);
		menuEdit.setMnemonic(KeyEvent.VK_E);
		menuBar.add(menuEdit);

		menuHelp = new JMenu("Help");
		menuHelp.setForeground(Color.GREEN);
		menuHelp.setMnemonic(KeyEvent.VK_H);
		menuBar.add(menuHelp);

		menuItemNew = new JMenuItem("New");
		menuItemNew.setBackground(new Color(102,0,153));
		menuItemNew.setForeground(Color.GREEN);
		menuItemNew.setMnemonic(KeyEvent.VK_N);
		menuItemNew.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, ActionEvent.CTRL_MASK));
		menuItemNew.addActionListener(this);
		menuFile.add(menuItemNew);

		menuItemOpen = new JMenuItem("Open");
		menuItemOpen.setBackground(new Color(102,0,153));
		menuItemOpen.setForeground(Color.GREEN);
		menuItemOpen.setMnemonic(KeyEvent.VK_O);
		menuItemOpen.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, ActionEvent.CTRL_MASK));
		menuItemOpen.addActionListener(this);
		menuFile.add(menuItemOpen);

		menuItemSave = new JMenuItem("Save");
		menuItemSave.setBackground(new Color(102,0,153));
		menuItemSave.setForeground(Color.GREEN);
		menuItemSave.setMnemonic(KeyEvent.VK_S);
		menuItemSave.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.CTRL_MASK));
		menuItemSave.addActionListener(this);
		menuFile.add(menuItemSave);

		menuItemPrint = new JMenuItem("Print");
		menuItemPrint.setBackground(new Color(102,0,153));
		menuItemPrint.setForeground(Color.GREEN);
		menuItemPrint.setMnemonic(KeyEvent.VK_P);
		menuItemPrint.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P, ActionEvent.CTRL_MASK));
		menuItemPrint.addActionListener(this);
		menuFile.add(menuItemPrint);

		menuFile.addSeparator();

		menuItemExit = new JMenuItem("Exit");
		menuItemExit.setBackground(new Color(102,0,153));
		menuItemExit.setForeground(Color.GREEN);
		menuItemExit.setMnemonic(KeyEvent.VK_Q);
		menuItemExit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0));
		menuItemExit.addActionListener(this);
		menuFile.add(menuItemExit);

		menuItemCut = new JMenuItem("Cut");
		menuItemCut.setBackground(new Color(102,0,153));
		menuItemCut.setForeground(Color.GREEN);
		menuItemCut.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, ActionEvent.CTRL_MASK));
		menuItemCut.addActionListener(this);
		menuEdit.add(menuItemCut);

		menuItemCopy = new JMenuItem("Copy");
		menuItemCopy.setBackground(new Color(102,0,153));
		menuItemCopy.setForeground(Color.GREEN);
		menuItemCopy.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, ActionEvent.CTRL_MASK));
		menuItemCopy.addActionListener(this);
		menuEdit.add(menuItemCopy);

		menuItemPaste = new JMenuItem("Paste");
		menuItemPaste.setBackground(new Color(102,0,153));
		menuItemPaste.setForeground(Color.GREEN);
		menuItemPaste.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P, ActionEvent.CTRL_MASK));
		menuItemPaste.addActionListener(this);
		menuEdit.add(menuItemPaste);

		menuEdit.addSeparator();

		menuItemSelectAll = new JMenuItem("Select All");
		menuItemSelectAll.setBackground(new Color(102,0,153));
		menuItemSelectAll.setForeground(Color.GREEN);
		menuItemSelectAll.setMnemonic(KeyEvent.VK_A);
		menuItemSelectAll.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A, ActionEvent.CTRL_MASK));
		menuItemSelectAll.addActionListener(this);
		menuEdit.add(menuItemSelectAll);

		menuItemAbout = new JMenuItem("About JNotePad");
		menuItemAbout.setBackground(new Color(102,0,153));
		menuItemAbout.setForeground(Color.GREEN);
		menuItemAbout.setMnemonic(KeyEvent.VK_F1);
		menuItemAbout.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F1, 0));
		menuItemAbout.addActionListener(this);
		menuHelp.add(menuItemAbout);

		imageAboutAutor = new ImageIcon("img/kevothrasher.png");

		textArea = new JTextArea("Write Something ...",25,80);
		textArea.setLineWrap(true);
		textArea.setWrapStyleWord(true);

		scrollPane = new JScrollPane(textArea);
		scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setVisible(true);
		scrollPane.setViewportView(textArea);
		this.add(scrollPane,BorderLayout.CENTER);

		this.setBackground(new Color(102,0,153));
		this.setPreferredSize(new Dimension(420,540));
		this.setMinimumSize(new Dimension(360,420));
		this.setBounds(0,0,630,500);
		this.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent ae) {

		if(ae.getSource() == menuItemNew) {
			try {
				textArea.setText("");
			} catch(Exception e) {
				JOptionPane.showMessageDialog(this,e,"EXCEPTION",JOptionPane.WARNING_MESSAGE);
			}
		}

		if(ae.getSource() == menuItemOpen) {
			JFileChooser objFileChooser = new JFileChooser();
			objFileChooser.setCurrentDirectory(new File("."));
			//objFileChooser.showOpenDialog(this);

			int responseOpenDialog = objFileChooser.showOpenDialog(textArea);

			try {
				if(responseOpenDialog == JFileChooser.APPROVE_OPTION) {
				System.out.println(JFileChooser.APPROVE_OPTION);
				File objFile = new File(objFileChooser.getSelectedFile().getAbsolutePath());
				System.out.println(objFile);
				//String textFileToString = Files.readString(objFileChooser.getSelectedFile().getAbsolutePath());
				}
			} catch(Exception e) {
				JOptionPane.showMessageDialog(this,e,"EXCEPTION",JOptionPane.WARNING_MESSAGE);
			}

		}

		if(ae.getSource() == menuItemSave) {
			JFileChooser objFileChooser = new JFileChooser();
			objFileChooser.setCurrentDirectory(new File("."));
			int responseSaveDialog = objFileChooser.showSaveDialog(textArea);

			try {
				if(responseSaveDialog == JFileChooser.APPROVE_OPTION) {
					File objFile = new File(objFileChooser.getSelectedFile().getAbsolutePath());
					System.out.println(objFile);
				}

			} catch(Exception e) {
				JOptionPane.showMessageDialog(this,e,"EXCPTION",JOptionPane.WARNING_MESSAGE);
			}
		}

		if(ae.getSource() == menuItemExit) {
			try {
				if (JOptionPane.showConfirmDialog(this,"Do you want to EXIT?","EXIT JNotePad",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION){
				System.exit(0);
				}
			} catch(Exception e) {
				JOptionPane.showMessageDialog(this,e,"EXCPTION",JOptionPane.WARNING_MESSAGE);
			}
		}

		if(ae.getSource() == menuItemAbout) {
			try {
				JOptionPane.showMessageDialog(this,"JNotePad Write in JAVA inspired by Neon Genesis EVANGELION\nDeveloped by Kevo.THRASHER\nhttps://github.com/KevoTHRASHER","About JNotePad & Autor",JOptionPane.INFORMATION_MESSAGE,imageAboutAutor);
			} catch(Exception e) {
				JOptionPane.showMessageDialog(this,e,"EXCPTION",JOptionPane.WARNING_MESSAGE);
			}
		}

	}

}
