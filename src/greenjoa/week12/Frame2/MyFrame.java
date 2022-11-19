package greenjoa.week12.Frame2;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyFrame extends JFrame {
	int width;
	int height;
	
	JPanel panel1;
	JPanel panel2;
	Container frame = this.getContentPane();
	JLabel imgChar = new JLabel();
	ImageIcon img = new ImageIcon("img/char1.png");
	int xpos =100, ypos=100;
	public MyFrame() {
		this("20000 홍길동");
	}
	public MyFrame(String title) {
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
				if(xpos >=10) {
					xpos -= 10;
					imgChar.setBounds(xpos,ypos,img.getIconWidth(),img.getIconHeight());
				}

			}
			
		});
		JButton btn2 = new JButton("HOME");
		btn2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				xpos= 100;
				ypos= 100;
				imgChar.setBounds(xpos,ypos,img.getIconWidth(),img.getIconHeight());
			}
			
		});
		JButton btn3 = new JButton(">>");
		btn3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(xpos <=(panel2.getWidth()-img.getIconWidth()-10 )) {
					xpos += 10;
					imgChar.setBounds(xpos,ypos,img.getIconWidth(),img.getIconHeight());
				}

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
		panel2 = new JPanel();
		panel2.setBackground(Color.ORANGE);
		panel2.setLayout(null);
		imgChar.setIcon(img);
		imgChar.setOpaque(true);
		imgChar.setBackground(Color.CYAN);
		
		imgChar.setBounds(xpos,ypos,img.getIconWidth(),img.getIconHeight());
		panel2.add(imgChar);
		frame.add(panel2, BorderLayout.CENTER);
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
