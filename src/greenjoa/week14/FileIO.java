package greenjoa.week14;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.filechooser.FileNameExtensionFilter;

@SuppressWarnings("serial")
public class FileIO extends JFrame implements ActionListener{
	
	Container frame = this.getContentPane();
	
	
	JLabel label = new JLabel();
	
	
	

	FileIO(String title){
		super(title);
		this.setSize(500,500);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		init();
		this.setVisible(true);
	}
	
	private void init() {
		// TODO Auto-generated method stub
		frame.add(label);
		initMenu();
	}

	private void initMenu() {
		// TODO Auto-generated method stub
		JMenuBar mb = new JMenuBar();
		JMenu menu = new JMenu("다이얼로그");
		JMenuItem item1 = new JMenuItem("파일");
		JMenuItem item2 = new JMenuItem("색상");
		menu.add(item1);
		menu.add(item2);
		
		item1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JFileChooser filechooser = new JFileChooser();
				FileNameExtensionFilter filter = new FileNameExtensionFilter("JPG & GIF Images","jpg","gif");
				filechooser.setFileFilter(filter);
				int result = filechooser.showOpenDialog(FileIO.this);
				if(result == JFileChooser.APPROVE_OPTION) {
					String path = filechooser.getSelectedFile().getPath();
					label.setIcon(new ImageIcon(path));
					pack();
				}
				
			}

			
			
			
		});
		item2.addActionListener(e->{
			
			Color result = JColorChooser.showDialog(this, "color",Color.GREEN);
			if(result != null) {
				label.setOpaque(true);
				label.setBackground(result);
				
			}
			
			
			
		});
		mb.add(menu);
		this.setJMenuBar(mb);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new FileIO("200000 홍길동");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String cmd = e.getActionCommand();
		switch(cmd) {
		case "파일":
		case "색상":
		}
		
	}

}
