package IntroToHashMaps;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class LogSearch implements ActionListener{
  /* 
	 * Crate a HashMap of Integers for the keys and Strings for the values.
	 * Create a GUI with three buttons. 
	 * Button 1: Add Entry
	 * 				When this button is clicked, use an input dialog to ask the user to enter an ID number.
	 * 				After an ID is entered, use another input dialog to ask the user to enter a name.
	 * 				Add this information as a new entry to your HashMap.
	 * 
	 * Button 2: Search by ID
	 * 				When this button is clicked, use an input dialog to ask the user to enter an ID number.
	 * 				If that ID exists, display that name to the user.
	 * 				Otherwise, tell the user that that entry does not exist.
	 * 
	 * Button 3: View List
	 * 				When this button is clicked, display the entire list in a message dialog in the following format:
	 * 				ID: 123  Name: Harry Howard
	 * 				ID: 245  Name: Polly Powers
	 * 				ID: 433  Name: Oliver Ortega
	 * 				etc...
	 * 
	 * When this is complete, add a fourth button to your window.
	 * Button 4: Remove Entry
	 * 				When this button is clicked, prompt the user to enter an ID using an input dialog.
	 * 				If this ID exists in the HashMap, remove it. Otherwise, notify the user that the ID
	 * 				is not in the list. 
	 *
	 * */
	HashMap<Integer, String> log = new HashMap<>();
	
	JFrame frame = new JFrame("Log Search");
	JPanel panel = new JPanel();
	JButton addentry = new JButton("Add Entry");
	JButton searchID = new JButton("Search by ID");
	JButton viewlist = new JButton("View List");
	JButton remove = new JButton("Remove Entry");
	
	String ID;
	String name; 
	String search;
	
	public static void main(String[] args) {
		LogSearch logsearch = new LogSearch();
		logsearch.GUI();	
	}
	
	public void GUI() {	
		addentry.addActionListener(this);
		searchID.addActionListener(this);
		viewlist.addActionListener(this);
		remove.addActionListener(this);
		
		frame.add(panel);
		panel.add(addentry);
		panel.add(searchID);
		panel.add(viewlist);
		panel.add(remove);
		frame.pack();
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == addentry) {
			ID = JOptionPane.showInputDialog("Enter ID number:");
			name = JOptionPane.showInputDialog("Enter name:");
			
			int IDint = Integer.parseInt(ID);
			
			log.put(IDint, name);
		}
		if(e.getSource() == searchID) {
			search = JOptionPane.showInputDialog("Search by ID:");
			int searchint = Integer.parseInt(search);
			if(log.containsKey(searchint)) {
				JOptionPane.showMessageDialog(null, log.get(searchint));
			}
			else {
				JOptionPane.showMessageDialog(null, "That entry does not exist.");
			}
			
		}
		if(e.getSource() == viewlist) { //should put in for loop that goes through the hashmap
			JOptionPane.showMessageDialog(null, "\n ID: " );
			JOptionPane.showMessageDialog(null, "\n Name: ");
		}
		
	}
	
}
