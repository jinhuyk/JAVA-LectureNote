package greenjoa.week12.Event;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JOptionPane;

public class MyWindowAdapter extends WindowAdapter {

	MyFrame frame;
	public MyWindowAdapter(MyFrame f) {
		this.frame = f;
		
	}
	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		if(frame!=null) {
			String name = JOptionPane.showInputDialog("your name?");
			frame.setTitle(name + " welcome");
		}
	}

}
