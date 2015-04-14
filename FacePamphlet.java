/* 
 * File: FacePamphlet.java
 * -----------------------
 * When it is finished, this program will implement a basic social network
 * management system.
 */

import acm.program.*;
import acm.graphics.*;
import acm.util.*;
import java.awt.event.*;
import javax.swing.*;

// TODO: Remember to remove the Console after testing
public class FacePamphlet extends ConsoleProgram 
					implements FacePamphletConstants {
	
	JTextField nameTxtField = new JTextField(TEXT_FIELD_SIZE);
	JButton add = new JButton("Add");

	/**
	 * This method has the responsibility for initializing the 
	 * interactors in the application, and taking care of any other 
	 * initialization that needs to be performed.
	 */
	public void init() {
		addInteractors();
		addActionListeners();
    }
    
  
    private void addInteractors() {
		JLabel nameLabel = new JLabel ("Name");
		
		
		add(nameLabel,NORTH);
		add(nameTxtField, NORTH);
		add(add,NORTH);
	}


	/**
     * This class is responsible for detecting when the buttons are
     * clicked or interactors are used, so you will have to add code
     * to respond to these actions.
     */
    public void actionPerformed(ActionEvent e) {
		if (e.getSource() == add) {
			println ("Add: " + nameTxtField.getText());
		}
	}

}
