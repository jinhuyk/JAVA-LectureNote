package greenjoa.week12.Event;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MyFrame extends JFrame{
	public MyFrame() {
		this("20000 홍길동");
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
		// TODO Auto-generated method stub
//		this.addWindowListener(new MyWindowListener(this));
//		this.addWindowListener(new MyWindowAdapter(this));
		this.addWindowListener(new MyWindowAdapter2());
		this.addWindowListener(new WindowAdapter() {
			public void WindowClosing(WindowEvent e) {
				super.windowClosing(e);
				System.exit(0);
			}
		});
	}

public class MyWindowAdapter2 extends WindowAdapter {

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub

		String name = JOptionPane.showInputDialog("your name?");
		setTitle(name + " welcome");
	}

}

	
}
