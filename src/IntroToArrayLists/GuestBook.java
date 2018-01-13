package IntroToArrayLists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GuestBook implements ActionListener{
	
	JFrame frame = new JFrame("Guest Book");
	JPanel panel = new JPanel();
	JButton button1 = new JButton("Add Name");
	JButton button2 = new JButton("View Names");
	
	ArrayList<String> namelist = new ArrayList<>();
	
	public static void main(String[] args) {
		GuestBook book = new GuestBook();
		book.GUI();
	}
	
	public void GUI() {
		frame.add(panel);
		panel.add(button1);
		panel.add(button2);
		
		button1.addActionListener(this);
		button2.addActionListener(this);
		
		frame.pack();
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String username;
		int num = 1;
		String name = "";
		// TODO Auto-generated method stub
		if (e.getSource() == button1) {
			username = JOptionPane.showInputDialog("Add a name to your guest book:");
			namelist.add(username);
		}
		else {
			for (int i = 0; i < namelist.size(); i++) {
				name = name + "\n Guest #" + num + " " + namelist.get(i);
				num++;
			}
			JOptionPane.showMessageDialog(null, name);
		}
		
	}
	
	
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
}
