package greenjoa.week14;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

@SuppressWarnings("serial")
public class Table extends JFrame {
	
	Container frame = this.getContentPane();
	JPanel panel;
	JButton btn;
	DefaultTableModel model;
	JTable table;
	String[] title = {"id","password","name"};
	MyDialog3 dlg = null;
	
	public Table(String title) {
		super(title);
		this.setSize(500,500);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		init();
		this.setVisible(true);
	}
	private void init() {
		// TODO Auto-generated method stub
		this.panel = new JPanel();
		this.btn = new JButton("정보입력");
		this.model = new DefaultTableModel(title,0);
		this.table = new JTable(model);
		
		this.panel.add(btn);
		frame.add(panel,BorderLayout.NORTH);
		frame.add(new JScrollPane(table),BorderLayout.CENTER);
		
		btn.addActionListener(e->{
			if(dlg == null) {
				dlg = new MyDialog3(Table.this, "INPUT",false);
			}else {
				dlg.requestFocus();
			}

			
			
			
		});
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Table("202210748");
	}

}
