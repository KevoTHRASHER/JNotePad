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
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.BorderLayout;
import java.io.File;
import java.awt.Dimension;
import java.net.URL;

public class PanelJNotePad extends JPanel implements ActionListener {

	private static ImageIcon imageAboutAutor;
	private JMenuBar menuBar;
	private JMenu menuFile, menuEdit, menuHelp;
	private JMenuItem menuItemNew, menuItemOpen, menuItemSave, menuItemExit, menuItemCut, menuItemCopy, menuItemPaste, menuItemAbout;
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

		menuItemCut = new JMenuItem("Cut");
		menuItemCut.setBackground(new Color(102,0,153));
		menuItemCut.setForeground(Color.GREEN);
		menuItemCut.addActionListener(this);
		menuEdit.add(menuItemCut);

		menuItemCopy = new JMenuItem("Copy");
		menuItemCopy.setBackground(new Color(102,0,153));
		menuItemCopy.setForeground(Color.GREEN);
		menuItemCopy.addActionListener(this);
		menuEdit.add(menuItemCopy);

		menuItemPaste = new JMenuItem("Paste");
		menuItemPaste.setBackground(new Color(102,0,153));
		menuItemPaste.setForeground(Color.GREEN);
		menuItemPaste.addActionListener(this);
		menuEdit.add(menuItemPaste);

		menuItemAbout = new JMenuItem("About JNotePad");
		menuItemAbout.setBackground(new Color(102,0,153));
		menuItemAbout.setForeground(Color.GREEN);
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
			textArea.setText("");
			
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
				JOptionPane.showMessageDialog(this,e,"EXCPTION",JOptionPane.WARNING_MESSAGE);
			}

		}

		if(ae.getSource() == menuItemSave) {
			JFileChooser objFileChooser = new JFileChooser();
			objFileChooser.setCurrentDirectory(new File("."));
			//objFileChooser.showSaveDialog(textArea);
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
			if (JOptionPane.showConfirmDialog(this,"Do you want to EXIT?","EXIT JNotePad",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION){
				System.exit(0);
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
