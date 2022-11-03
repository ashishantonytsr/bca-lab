// AWT Application to implement a list box

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class MyList extends JFrame implements ActionListener{
	JList l1;
	JTextField t1;
	JButton b1, b2, b3;

	int ret;
	DefaultListModel listModel;

	MyList() {
		setTitle("Adding or Removing Items from the JList");
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		listModel = new DefaultListModel<>();
		listModel.addElement("Ronaldo");
		listModel.addElement("Messi");
		listModel.addElement("Mbappe");
		listModel.addElement("Neymar");
		
		// creating list
		l1 = new JList<>(listModel);
		
		// creating text field
		t1 = new JTextField(10);

		// creating buttons
		b1 = new JButton("ADD");
		b1.addActionListener(this);

		b2 = new JButton("REMOVE");
		b2.addActionListener(this);
		b2.setActionCommand("remove");
		
		b3 = new JButton("CLEAR ALL");
		b3.addActionListener(this);
		b3.setActionCommand("clear");

		// adding jlist to a scrollpane
		JScrollPane js = new JScrollPane(l1);
		js.setPreferredSize(new Dimension(300,100));

		add(js);
		add(t1);
		add(b1);
		add(b2);
		add(b3);

		setSize(700,500);
		setVisible(true);
	}

	public void actionPerformed(ActionEvent ae) {
		if ("clear".equals(ae.getActionCommand())) {
			listModel.removeAllElements();
		}
		else if ("remove".equals(ae.getActionCommand())) {
			ret = l1.getSelectedIndex();
			listModel.remove(ret);
		}
		else {
			String select = t1.getText();
			Object obj = select;
			listModel.add(0, obj);
		}
	}

	public static void main(String[] args) {
		MyList list = new MyList();
	}
}
