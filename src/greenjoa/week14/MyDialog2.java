package greenjoa.week14;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class MyDialog2 extends JDialog {
	Container dialog = this.getContentPane();
	JTextField tf = new JTextField(10);
	JButton btn = new JButton("OK");
	MyFrame parent = null;
	public MyDialog2(MyFrame parent,String title,boolean modal) {
		super(parent,title,modal);
		
		this.parent = parent;
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
			String str = tf.getText();
			if(str.length()!=0) {
				parent.tf.setText(str);
			}else {
				JOptionPane.showMessageDialog(null, "no text");
			}
			parent.dlg = null;
			dispose();
		});
		this.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				super.windowClosing(e);
				parent.dlg = null;
				dispose();
			}
			
		});
	}
	
}
