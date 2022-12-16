package greenjoa.week14;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class MyDialog extends JDialog {
	Container dialog = this.getContentPane();
	JTextField tf = new JTextField(10);
	JButton btn = new JButton("OK");
	
	public MyDialog(MyFrame parent,String title,boolean modal) {
		super(parent,title,modal);
		this.setSize(500,500);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.setLocationRelativeTo(parent);
		init();
		this.setVisible(true);
	}

	private void init() {
		// TODO Auto-generated method stub
		dialog.setLayout(new FlowLayout());
		dialog.add(tf);
		dialog.add(btn);
		btn.addActionListener(e->{
			dispose();
		});
		
	}
	
}
