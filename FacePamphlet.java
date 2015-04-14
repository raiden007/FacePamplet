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

	
	FacePamphletDatabase database = new FacePamphletDatabase();
	FacePamphletProfile profile = new FacePamphletProfile("");
	


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
    	// Add button
		if (e.getSource() == add) {
			// If text field is empty return an error
			if (nameTxtField.getText().equals("")) {
				println ("Name Empty");
			} else {
				// If the profile is not in the database, add it.
				if (database.containsProfile(nameTxtField.getText()) == false) {
					profile = new FacePamphletProfile(nameTxtField.getText());
					database.addProfile(profile);
					println (profile.getName() + " was added!");
					// Else error profile already exists
				} else {
					println ("Profile already exists: " + profile.toString());
				}
			}
		} else if (e.getSource() == delete) {
			// If text field is empty return an error
			if (nameTxtField.getText().equals("")) {
				println ("Name Empty");
			} else {
				// If the profile is not in database return an error
				if (database.containsProfile(nameTxtField.getText()) == false) {
					println("Profile " + profile.getName() + " was not found!");
				}
			println ("Delete: " + nameTxtField.getText());
			}
		} else if (e.getSource() == lookup) {
			if (nameTxtField.getText().equals("")) {
				println ("Name Empty");
			} else {
			println ("Lookup: " + nameTxtField.getText());
			}
		} else if (e.getSource() == changeStatus || e.getSource() == statusTxtField) {
			if (statusTxtField.getText().equals("")) {
				println ("Status Empty");
			} else {
			println ("Change Status: " + statusTxtField.getText());
			}
		} else if (e.getSource() == changePicture || e.getSource() == pictureTxtField) {
			if (pictureTxtField.getText().equals("")) {
				println ("Picture Empty");
			} else {
			println ("Change Picture: " + pictureTxtField.getText());
			}
		} else if (e.getSource() == addFriend || e.getSource() == addFriendTxtField) {
			if (addFriendTxtField.getText().equals("")) {
				println ("Add Friend Empty");
			} else {
			println ("Add Friend: " + addFriendTxtField.getText());
			}	
		}
	}

}
