package intro_to_array_lists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GuestBook implements ActionListener {
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
	ArrayList<String> arr = new ArrayList<String>();
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	
	JButton addName = new JButton();
	JButton viewName = new JButton();
	
	public static void main(String[] args) {
		new GuestBook().run();
	}
	
	public void run() {
		frame.setVisible(true);
		
		addName.setText("Add Name");
		addName.addActionListener(this);
		viewName.setText("View Names");
		viewName.addActionListener(this);
		
		panel.add(addName);
		panel.add(viewName);
		
		frame.add(panel);
		
		frame.pack();
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton buttonClicked = (JButton)e.getSource();
		
		if (buttonClicked.equals(addName)) {
			String name = JOptionPane.showInputDialog("Add name: ");
			arr.add(name);
		}
		else if (buttonClicked.equals(viewName)) {
			String nameList = "";
			for (int i = 0; i < arr.size(); i++) {
				nameList += "Guest #" + (i + 1) + ": " + arr.get(i) + "\n"; 
			}
			JOptionPane.showMessageDialog(null, nameList);
		}
	}
}
