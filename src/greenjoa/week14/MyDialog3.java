package greenjoa.week14;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class MyDialog3 extends JDialog {
	Container dialog = this.getContentPane();
	Table parent = null;
	
	JTextField uid = new JTextField(10);
	JPasswordField upasswd = new JPasswordField(10);
	JTextField uname = new JTextField(10);
	JButton ok = new JButton("OK");
	JButton cancel = new JButton("No");
	public MyDialog3(Table parent,String title,boolean modal) {
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
		dialog.setLayout(new GridLayout(4,2));
		dialog.add(new JLabel("ID"));
		dialog.add(uid);
		dialog.add(new JLabel("PASSWD"));
		dialog.add(upasswd);
		upasswd.setEchoChar('*');
		dialog.add(new JLabel("name"));
		dialog.add(uname);
		dialog.add(ok);
		dialog.add(cancel);
		
		ok.addActionListener(e->{
			String uid = this.uid.getText();
			if(uid.length() > 0) {
				String[] data = {this.uid.getText(), new String(upasswd.getPassword()),uname.getText()};
				parent.model.addRow(data);
			}else {
				JOptionPane.showMessageDialog(null, "err");
			}
			parent.dlg = null;
			dispose();
		});
		cancel.addActionListener(e->{
			uid.setText("");
			upasswd.setText("");
			uname.setText("");
			dispose();
		});
		
	}
	
}
