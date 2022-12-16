package greenjoa.week13.Component;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

@SuppressWarnings("serial")
public class RadioDynamic extends JFrame implements ItemListener{
	Container frame = this.getContentPane();
	
	ButtonGroup group = new ButtonGroup();
	
	JRadioButton [] radiobutton = new JRadioButton [3];
	String[] data= {"배","사과","포도"};
	JLabel[] labels =new JLabel[3];
	
	JPanel panel1, panel2;

	public RadioDynamic(String title) {
		super(title);
		this.setSize(500,500);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		init();
		this.setVisible(true);
	}
		
	private void init() {
		// TODO Auto-generated method stub
		initPanel1();
		intiPanel2();
	}
	
	private void initPanel1() {
		// TODO Auto-generated method stub
		panel1 = new JPanel();
		for(int i = 0; i<data.length;i++) {
			radiobutton[i] = new JRadioButton(data[i]);
			radiobutton[i].addItemListener(this);
			group.add(radiobutton[i]);
			panel1.add(radiobutton[i]);
		}
		frame.add(panel1,BorderLayout.NORTH);
		
	}


	private void intiPanel2() {
		// TODO Auto-generated method stub
		panel2 = new JPanel();
		for(int i = 0; i<data.length;i++) {
			labels[i] = new JLabel(data[i]);
			//labels[i].setVisible(false);
			//panel2.add(labels[i]);	
		}
		frame.add(panel2,BorderLayout.CENTER);
	}


	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		int idx = -1;
		for(int i = 0;i<data.length;i++) {
			if(e.getItem() == radiobutton[i])
			{
				idx = i;
				break;
			}
		}
		if(idx >= 0) {
			if(e.getStateChange() == ItemEvent.SELECTED) {
				panel2.add(labels[idx]);

			}else {
				panel2.remove(labels[idx]);
			}
			panel2.revalidate();
			panel2.repaint();

		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new RadioDynamic("202210748 문진혁");
	}




}
