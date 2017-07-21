package com.bmpl.ims.users;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MyApplet extends JApplet {

	/**
	 * Create the applet.
	 */
	public MyApplet() {
		
		getContentPane().setLayout(null);
		
		JButton btnOk = new JButton("Ok");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(MyApplet.this, "U Click on OK");
			}
		});
		btnOk.setBounds(27, 95, 117, 29);
		getContentPane().add(btnOk);

	}
}
