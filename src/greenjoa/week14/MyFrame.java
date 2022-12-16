package greenjoa.week14;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class MyFrame extends JFrame {
	Container frame = this.getContentPane();
	JTextField tf = new JTextField(10);
	JButton btn = new JButton("modalDlg");
	JButton btn2 = new JButton("modallessDig");
	MyDialog2 dlg = null;
	public MyFrame(String title) {
		super(title);
		this.setSize(500,500);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		init();
		this.setVisible(true);
	}
	private void init() {
		// TODO Auto-generated method stub
		frame.setLayout(new FlowLayout());
		
		frame.add(tf);
		frame.add(btn);
		frame.add(btn2);
		
		btn.addActionListener(e->{
			MyDialog dlg = new MyDialog(MyFrame.this,"dialog",true);
			String str = dlg.tf.getText();
			if(str.length()!=0) {
				tf.setText(str);
			}else {
				JOptionPane.showMessageDialog(null, "no text");
			}
		});
		btn2.addActionListener(e->{
			if(dlg == null) {
				dlg = new MyDialog2(MyFrame.this, "modalless",false);
			}
			else {
				dlg.requestFocus();
			}
		});
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyFrame("hong");
	}

}
