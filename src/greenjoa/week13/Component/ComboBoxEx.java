package greenjoa.week13.Component;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

@SuppressWarnings("serial")
public class ComboBoxEx extends JFrame implements ActionListener, ItemListener {

	Container frame =  this.getContentPane();
	int width;
	int height;
	JPanel panel1;
	String[] fname = {"바탕체","돋움체","굴림체","궁서체"};
		
	
	Integer[] fsize = {10,12,14,16,18,20,22};
	DefaultComboBoxModel<String> fnamemodel = new DefaultComboBoxModel<>(fname);
	DefaultComboBoxModel<Integer> fsizemodel = new DefaultComboBoxModel<>(fsize);

	JComboBox<String> fontname;
	JComboBox<Integer> fontsize;
	
	JCheckBox fsbold, fsitalic;
	JTextField str;
	
	JLabel labelstr;
	
	String name = "바탕체";
	int size=  12;
	boolean bold = false;
	boolean italic = false;
	
	Font font = new Font(name, Font.PLAIN, size);
	
	public ComboBoxEx(String title){
		super(title);
		Toolkit kit = Toolkit.getDefaultToolkit();
		this.width = kit.getScreenSize().width;
		this.height = kit.getScreenSize().height;
		Image img=kit.getImage("img/char1.png");
		this.setSize(500,500);
		this.setLocationRelativeTo(null);
		this.setIconImage(img);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		init();
		this.setVisible(true);
	}
	
	public void init() {
		panel1 = new JPanel();

		fontname = new JComboBox<>(fnamemodel);
		fontsize= new JComboBox<>(fsizemodel);
		fontsize.setSelectedIndex(1);
		fsbold = new JCheckBox("BOLD");
		fsitalic = new JCheckBox("ITALIC");
		str= new JTextField(20);
		panel1.add(fontname);
		panel1.add(fontsize);
		panel1.add(fsbold);
		panel1.add(fsitalic);
		panel1.add(str);
		frame.add(panel1, BorderLayout.NORTH);
		
		
		labelstr= new JLabel("202210748 문진혁",SwingConstants.CENTER);
		labelstr.setFont(font);
		
		frame.add(labelstr, BorderLayout.CENTER);
		
		initListener();
		fsizemodel.addElement(30);
	}
	
	private void initListener() {
		this.fontname.addActionListener(this);
		this.fontsize.addActionListener(this);
		this.fsbold.addItemListener(this);
		this.fsitalic.addItemListener(this);
		this.str.addActionListener(e->
			{
				labelstr.setText(str.getText());
				str.setText("");
			});
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ComboBoxEx("kim");
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == fsbold) {
			if(e.getStateChange() == ItemEvent.SELECTED) {
				bold = true;
			}
			else bold = false;
		}
		if(e.getSource() == fsitalic) {
			if(e.getStateChange() == ItemEvent.SELECTED) {
				italic = true;
			}
			else italic = false;
		}
		showNewFont();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == fontname) {
			this.name = fname[fontname.getSelectedIndex()];
			
		}
		else if(e.getSource() == fontsize) {
			//this.size = fsize[fontsize.getSelectedIndex()];
			size = (Integer)fontsize.getSelectedItem();
		}
		showNewFont();
	}

	private void showNewFont() {
		// TODO Auto-generated method stub
		if(bold && italic) {
			font = new Font(name,Font.BOLD|Font.ITALIC,size);
		}
		else if(bold==true && italic == false){
			font = new Font(name,Font.BOLD,size);
		}
		else if(bold==false && italic == true) {
			font = new Font(name,Font.ITALIC,size);
		}
		else {
			font = new Font(name,Font.PLAIN,size);
			
		}
		labelstr.setFont(font);
	}

}
