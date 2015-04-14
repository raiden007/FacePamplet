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
	JButton delete = new JButton("Delete");
	JButton lookup = new JButton("Lookup");
	JTextField statusTxtField = new JTextField(TEXT_FIELD_SIZE);
	JButton changeStatus = new JButton("Change Status");
	JTextField pictureTxtField = new JTextField(TEXT_FIELD_SIZE);
	JButton changePicture = new JButton("Change Picture");
	JTextField addFriendTxtField = new JTextField(TEXT_FIELD_SIZE);
	JButton addFriend = new JButton("Add Friend");

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
		JLabel emptyLabel = new JLabel (EMPTY_LABEL_TEXT);
		JLabel emptyLabelTwo = new JLabel (EMPTY_LABEL_TEXT);
		
		add(nameLabel,NORTH);
		add(nameTxtField, NORTH);
		add(add,NORTH);
		add(delete,NORTH);
		add(lookup,NORTH);
		
		add(statusTxtField,WEST);
		add(changeStatus,WEST);
		add(emptyLabel,WEST);
		add(pictureTxtField,WEST);
		add(changePicture,WEST);
		add(emptyLabelTwo,WEST);
		add(addFriendTxtField,WEST);
		add(addFriend,WEST);
		
		statusTxtField.addActionListener(this);
		pictureTxtField.addActionListener(this);
		addFriendTxtField.addActionListener(this);
	}


	/**
     * This class is responsible for detecting when the buttons are
     * clicked or interactors are used, so you will have to add code
     * to respond to these actions.
     */
    public void actionPerformed(ActionEvent e) {
		if (e.getSource() == add) {
			if (nameTxtField.getText() == " ") {
				println ("Empty");
			} else {
			println ("Add: " + nameTxtField.getText());
			}
		} else if (e.getSource() == delete) {
			println ("Delete: " + nameTxtField.getText());
		} else if (e.getSource() == lookup) {
			println ("Lookup: " + nameTxtField.getText());
		} else if (e.getSource() == changeStatus || e.getSource() == statusTxtField) {
			println ("Change Status: " + statusTxtField.getText());
		} else if (e.getSource() == changePicture || e.getSource() == pictureTxtField) {
			println ("Change Picture: " + pictureTxtField.getText());
		} else if (e.getSource() == addFriend || e.getSource() == addFriendTxtField) {
			println ("Add Friend: " + addFriendTxtField.getText());
		}
	}

}
