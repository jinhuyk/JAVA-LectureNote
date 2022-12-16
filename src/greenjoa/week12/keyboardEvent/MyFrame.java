package greenjoa.week12.keyboardEvent;

import java.awt.Color;
import java.awt.Point;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame  extends JFrame{
	String[] imgpath = {"img/Down.png","img/Left.png","img/Right.png","img/Up.png"};
	ImageIcon[] icons;
	JLabel player;
	int imgWidth, imgHeight;
	Point pos = new Point(100,100);
	
	public MyFrame() {
		this("200000 홍길동");
	}
	public MyFrame(String title) {
		super(title);
		this.setSize(500,500);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		init();
		this.setVisible(true);
		
	}
	public void init() {
		icons = new ImageIcon[imgpath.length];
		for(int i =0;i<icons.length;i++) {
			icons[i] = new ImageIcon(imgpath[i]);
			
		}
		player = new JLabel(icons[0]);
		imgWidth = icons[0].getIconWidth();
		imgHeight = icons[0].getIconHeight();
		
		this.setLayout(null);
		player.setSize(imgWidth,imgHeight);
		player.setLocation(pos);
		
		this.getContentPane().add(player);
		this.getContentPane().setBackground(Color.WHITE);
		initKeytListener();
		initMouseListener();
		
	}
	
	public void initMouseListener() {
		this.addMouseListener(new MyMouseListener());
	}
	
	class MyMouseListener extends MouseAdapter{

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			super.mouseEntered(e);
			setSize(500,500);
			getContentPane().setBackground(Color.GREEN);
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			super.mouseExited(e);
			setSize(300,300);
			getContentPane().setBackground(Color.ORANGE);
			
		}
		
	}
	
	
	public void initKeytListener() {
		this.addKeyListener(new KeyAdapter() {

			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				super.keyTyped(e);
				switch(e.getKeyChar()) {
				case'd':
					pos.x += 10;
					player.setIcon(icons[2]);
					break;
				case 'a':
					pos.x -= 10;
					player.setIcon(icons[1]);
					break;
				case 's':
					pos.y += 10;
					player.setIcon(icons[0]);
					break;
				case 'w':
					pos.y -= 10;
					player.setIcon(icons[3]);
					break;
					
				}
				player.setLocation(pos);
			}

			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				super.keyPressed(e);
				switch(e.getKeyCode()) {
				case KeyEvent.VK_DOWN:
					pos.y += 10;
					player.setIcon(icons[0]);
					break;
				case KeyEvent.VK_LEFT:
					pos.x -= 10;
					player.setIcon(icons[1]);
					break;
				case KeyEvent.VK_RIGHT:
					pos.x += 10;
					player.setIcon(icons[2]);
					break;
				case KeyEvent.VK_UP:
					pos.y -= 10;
					player.setIcon(icons[3]);
					break;
					
				}
				player.setLocation(pos);
			}
			
		});
	}
	
	
	
}
