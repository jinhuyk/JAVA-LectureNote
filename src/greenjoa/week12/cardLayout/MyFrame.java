package greenjoa.week12.cardLayout;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyFrame extends JFrame {
	int width;
	int height;
	
	JPanel panel1;
	JPanel panel2;
	Container frame = this.getContentPane();
	CardLayout cl = new CardLayout();
	JPanel[] card;
	String[] str= {"Red","Green","Blue","yellow","pink","gray"};
	Color[] color = {Color.RED,Color.GREEN,Color.BLUE,Color.YELLOW, Color.PINK, Color.GRAY};
	public MyFrame() {
		this("20000 홍길동");
	}
	public MyFrame(String title) {
		super(title);
		Toolkit kit = Toolkit.getDefaultToolkit();
		this.width = kit.getScreenSize().width;
		this.height = kit.getScreenSize().height;
		Image img=kit.getImage("img/char1.png");
		this.setSize(this.width/2,this.height/2);
		this.setLocationRelativeTo(null);
		this.setIconImage(img);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		init();
		this.setVisible(true);
		
	}
	public void init() {
		initPanel1();
		initPanel2();
	}
	private void initPanel1() {
		
		panel1 = new JPanel(new GridLayout(1,3,10,10));
		
		JButton btn1 = new JButton("<<");
		
		btn1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				cl.previous(panel2);
			}
			
		});
		JButton btn2 = new JButton("HOME");
		
		btn2.addActionListener(e->cl.show(panel2, "3"));
		JButton btn3 = new JButton(">>");
		btn3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				cl.next(panel2);
			}
			
		});
		panel1.add(btn1);
		panel1.add(btn2);
		panel1.add(btn3);
		
		
//		this.panel1 = new JPanel(new GridLayout(1,str.length,5,5));
//		for(int i =0;i<str.length;i++) {
//			JButton btn = new JButton(str[i]);
//			final int idx = i;
//			
//			btn.addActionListener(e->panel2.setBackground(color[idx]));
//			btn.addActionListener(new ActionListener() {
//				
//				@Override
//				public void actionPerformed(ActionEvent e) {
//					// TODO Auto-generated method stub
//					panel2.setBackground(color[idx]);
//				}
//				
////			});
//			this.panel1.add(btn);
//		}
		frame.add(this.panel1, BorderLayout.NORTH);
	 }
	
	private void  initPanel2() {
		this.panel2 = new JPanel(cl);
		this.card = new JPanel[color.length];
		for(int i =0;i<color.length;i++) {
			card[i] = new JPanel();
			card[i].setBackground(color[i]);
			panel2.add(card[i],String.valueOf(i));
		}
		
		frame.add(panel2,BorderLayout.CENTER);
		
//		this.panel2 = new JPanel();
//		this.panel2.setBackground(Color.BLUE);
//		frame.add(panel2,BorderLayout.CENTER);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//MyFrame frame = new MyFrame("홍길동");
		new MyFrame("홍길동");
	}

}
