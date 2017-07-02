package com.bmpl.ims.users.views;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.border.LineBorder;

import com.bmpl.ims.users.dao.UserDAO;
import com.bmpl.ims.users.dto.UserDTO;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class UserView extends JFrame {

	private JPanel contentPane;
	private JTextField usertxt;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
					UserView frame = new UserView();
					frame.setVisible(true);
				
	}

	/**
	 * Create the frame.
	 */
	public UserView() {
		setTitle("IMS");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 525, 418);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		tabbedPane.setBounds(23, 21, 476, 350);
		contentPane.add(tabbedPane);
		
		JPanel loginpanel = new JPanel();
		tabbedPane.addTab("Login", null, loginpanel, null);
		loginpanel.setLayout(null);
		
		JLabel lblUserid = new JLabel("Userid");
		lblUserid.setFont(new Font("Lucida Grande", Font.BOLD, 16));
		lblUserid.setBounds(32, 66, 101, 25);
		loginpanel.add(lblUserid);
		
		usertxt = new JTextField();
		usertxt.setBounds(113, 66, 193, 26);
		loginpanel.add(usertxt);
		usertxt.setColumns(10);
		
		JLabel lblPwd = new JLabel("Password");
		lblPwd.setFont(new Font("Lucida Grande", Font.BOLD, 16));
		lblPwd.setBounds(32, 128, 101, 25);
		loginpanel.add(lblPwd);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(113, 128, 193, 26);
		loginpanel.add(passwordField);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				doLogin();
			}
		});
		btnLogin.setIcon(new ImageIcon(UserView.class.getResource("/com/bmpl/ims/users/views/login.png")));
		btnLogin.setBounds(28, 184, 117, 52);
		loginpanel.add(btnLogin);
		
		JButton btnClear = new JButton("Clear");
		btnClear.setIcon(new ImageIcon(UserView.class.getResource("/com/bmpl/ims/users/views/clear.png")));
		btnClear.setBounds(157, 184, 117, 52);
		loginpanel.add(btnClear);
		
		JPanel registerpanel = new JPanel();
		tabbedPane.addTab("Register", null, registerpanel, null);
	}
	private void doLogin(){
		String userid = usertxt.getText();
		String pwd = passwordField.getText();
		UserDAO userDAO= new UserDAO();
		UserDTO userDTO = new UserDTO(userid,pwd);
		try {
			if(userDAO.read(userDTO)){
				JOptionPane.showMessageDialog(this, "Welcome "+userid);
			}
			else
			{
				JOptionPane.showMessageDialog(this, "Invalid Userid or Password");
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
