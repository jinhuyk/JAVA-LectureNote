package greenjoa.week13.Component;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JToolBar;

public class ToolBarEx extends JFrame implements ActionListener{
	Container frame = this.getContentPane();
	
	String[] color = {"RED","GREEN","BLUE"};	
	
	public ToolBarEx(String title){
		super(title);

		this.setSize(500,500);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		init();
		this.setVisible(true);
	}
	private void init() {
		// TODO Auto-generated method stub
		intiMenu();
		initToolBar();
	}
	private void initToolBar() {
		// TODO Auto-generated method stub
		JToolBar toolbar = new JToolBar("COLOR");
		for (int i = 0;i<color.length;i++) {
			JButton btn = new JButton(color[i]);
			btn.addActionListener(this);
			toolbar.add(btn);
		}
		JButton btn = new JButton(new ImageIcon("img/char1.png"));
		btn.setActionCommand("GREEN");
		btn.addActionListener(this);
		toolbar.add(btn);
		this.add(toolbar,BorderLayout.PAGE_START);
	}
	private void intiMenu() {
		// TODO Auto-generated method stub
		JMenuBar menubar = new JMenuBar();
		JMenu colorMenu = new JMenu("색상");
		for(String str : color) {
			JMenuItem menu = new JMenuItem(str);
			menu.addActionListener(this);
			colorMenu.add(menu);
		}
		menubar.add(colorMenu);
		
		JMenu Menu = new JMenu("기타색상");
		Menu.add(new JMenuItem("노랑색"));
		
		colorMenu.add(Menu);
		this.setJMenuBar(menubar);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ToolBarEx("a");
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String menu = e.getActionCommand();
		switch(menu) {
		case "RED": frame.setBackground(Color.RED); break;
		case "BLUE":frame.setBackground(Color.BLUE); break;
		case "GREEN":frame.setBackground(Color.GREEN); break;
			
		}
	}

}
