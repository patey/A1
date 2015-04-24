package Lottery;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.Window;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JSeparator;
import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JCheckBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;

public class gui {

	
	private JFrame frame;
	private JTextField ID;
	private JTextField email;
	private JTextField pass;
	private JTextField name;
	private JTextField ID_2;
	private JTextField name_2;
	private JTextField email_2;
	private JTextField pass_2;
	private JTextField ID_3;
	private JTextField name_3;
	private JTextField email_3;
	private JTextField pass_3;
	private JTextField pass_4;
	private JTextField email_4;
	private JTextField name_4;
	private JTextField ID_4;
	private JTextField ID_5;
	private JSeparator separator_4;
	private JTextField name_5;
	private JTextField email_5;
	private JTextField pass_5;
	private JTextField ID_6;
	private JSeparator separator_5;
	private JTextField name_6;
	private JTextField email_6;
	private JTextField pass_6;
	private JTextField address;
	private JTextField port;
	private JTextField dbuser;
	private JTextField dbpass;
	private JTextField database;
	private JLabel label;
	private JTextField phone;
	private JTextField phone_2;
	private JTextField phone_3;
	private JTextField phone_4;
	private JTextField phone_5;
	private JTextField phone_6;
	private JTable employee_list;
	private JButton pickwin;
	private JPanel panel_4;
	/**
	 * @wbp.nonvisual location=591,119
	 */
	private final JPanel panel_5 = new JPanel();
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTable table;
	private JScrollPane scrollPane_1;
	private JScrollPane scrollPane_2;
	private JTable table_1;
	private JButton btnRefresh;
	private JButton btnRefreshTables;
	private JTable table_2;
	/**
	 * @wbp.nonvisual location=590,169
	 */


	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					//create config if it doesn't exist
					//to do- create/update list of employees+tickets on start as well
					Path path = Paths.get("config.xml");
					if (Files.notExists(path)) {
						Lottery.properties.newConfig();
						}
					gui window = new gui();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public gui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	@SuppressWarnings("serial")
	private void initialize() {
		@SuppressWarnings("unused")
		final JFrame editEmployee = null;
		
		final employees employees = new employees();
		
		@SuppressWarnings("unused")
		int row = 0;
		
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 570, 336);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 0, 564, 307);
		frame.getContentPane().add(tabbedPane);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("Add Employees", null, panel, null);
		panel.setLayout(null);
				
		JLabel lblEmployeeId = new JLabel("ID");
		lblEmployeeId.setBounds(30, 11, 21, 14);
		panel.add(lblEmployeeId);
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(101, 11, 46, 14);
		panel.add(lblName);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setBounds(225, 11, 46, 14);
		panel.add(lblEmail);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(341, 11, 66, 14);
		panel.add(lblPassword);
		
		ID = new JTextField();
		ID.setBounds(20, 36, 46, 20);
		panel.add(ID);
		ID.setColumns(10);
		
		email = new JTextField();
		email.setBounds(191, 36, 109, 20);
		panel.add(email);
		email.setColumns(10);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 60, 529, 2);
		panel.add(separator);
		
		pass = new JTextField();
		pass.setBounds(319, 36, 96, 20);
		panel.add(pass);
		pass.setColumns(10);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 90, 529, 2);
		panel.add(separator_1);
		
		name = new JTextField();
		name.setColumns(10);
		name.setBounds(86, 36, 86, 20);
		panel.add(name);
		
		ID_2 = new JTextField();
		ID_2.setColumns(10);
		ID_2.setBounds(20, 67, 46, 20);
		panel.add(ID_2);
		
		name_2 = new JTextField();
		name_2.setColumns(10);
		name_2.setBounds(86, 67, 86, 20);
		panel.add(name_2);
		
		email_2 = new JTextField();
		email_2.setColumns(10);
		email_2.setBounds(191, 67, 109, 20);
		panel.add(email_2);
		
		pass_2 = new JTextField();
		pass_2.setColumns(10);
		pass_2.setBounds(319, 67, 96, 20);
		panel.add(pass_2);
		
		ID_3 = new JTextField();
		ID_3.setColumns(10);
		ID_3.setBounds(20, 96, 46, 20);
		panel.add(ID_3);
		
		name_3 = new JTextField();
		name_3.setColumns(10);
		name_3.setBounds(86, 96, 86, 20);
		panel.add(name_3);
		
		email_3 = new JTextField();
		email_3.setColumns(10);
		email_3.setBounds(191, 96, 109, 20);
		panel.add(email_3);
		
		pass_3 = new JTextField();
		pass_3.setColumns(10);
		pass_3.setBounds(319, 96, 96, 20);
		panel.add(pass_3);
		
		pass_4 = new JTextField();
		pass_4.setColumns(10);
		pass_4.setBounds(319, 127, 96, 20);
		panel.add(pass_4);
		
		email_4 = new JTextField();
		email_4.setColumns(10);
		email_4.setBounds(191, 127, 109, 20);
		panel.add(email_4);
		
		name_4 = new JTextField();
		name_4.setColumns(10);
		name_4.setBounds(86, 127, 86, 20);
		panel.add(name_4);
		
		ID_4 = new JTextField();
		ID_4.setColumns(10);
		ID_4.setBounds(20, 127, 46, 20);
		panel.add(ID_4);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(10, 120, 529, 2);
		panel.add(separator_2);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setBounds(10, 150, 529, 2);
		panel.add(separator_3);
		
		ID_5 = new JTextField();
		ID_5.setColumns(10);
		ID_5.setBounds(20, 158, 46, 20);
		panel.add(ID_5);
		
		separator_4 = new JSeparator();
		separator_4.setBounds(10, 182, 529, 2);
		panel.add(separator_4);
		
		name_5 = new JTextField();
		name_5.setColumns(10);
		name_5.setBounds(86, 158, 86, 20);
		panel.add(name_5);
		
		email_5 = new JTextField();
		email_5.setColumns(10);
		email_5.setBounds(191, 158, 109, 20);
		panel.add(email_5);
		
		pass_5 = new JTextField();
		pass_5.setColumns(10);
		pass_5.setBounds(319, 158, 96, 20);
		panel.add(pass_5);
		
		ID_6 = new JTextField();
		ID_6.setColumns(10);
		ID_6.setBounds(20, 189, 46, 20);
		panel.add(ID_6);
		
		separator_5 = new JSeparator();
		separator_5.setBounds(10, 213, 529, 2);
		panel.add(separator_5);
		
		name_6 = new JTextField();
		name_6.setColumns(10);
		name_6.setBounds(86, 189, 86, 20);
		panel.add(name_6);
		
		email_6 = new JTextField();
		email_6.setColumns(10);
		email_6.setBounds(191, 189, 109, 20);
		panel.add(email_6);
		
		pass_6 = new JTextField();
		pass_6.setColumns(10);
		pass_6.setBounds(319, 189, 96, 20);
		panel.add(pass_6);
		
		final JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Employees", null, panel_1, null);
		panel_1.setLayout(null);
		
		final JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(6, 6, 552, 231);
		panel_1.add(scrollPane);
		
		employee_list = new JTable();
		scrollPane.setViewportView(employee_list);
		employee_list.setModel(new DefaultTableModel( employees.getEmployees(),
			new String[] {
				"ID", "Name", "Email", "Password", "Call?(yes/no)", "Phone Number"
			}
		) {
			Class[] columnTypes = new Class[] {
				Integer.class, String.class, String.class, String.class, String.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
			boolean[] columnEditables = new boolean[] {
				false, false, false, false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		
		btnRefresh = new JButton("Refresh");
		btnRefresh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				employee_list.setModel(new DefaultTableModel( employees.getEmployees(),
						new String[] {
							"ID", "Name", "Email", "Password", "Call?(yes/no)", "Phone Number"
						}
					) {
						Class[] columnTypes = new Class[] {
							Integer.class, String.class, String.class, String.class, String.class, String.class
						};
						public Class getColumnClass(int columnIndex) {
							return columnTypes[columnIndex];
						}
						boolean[] columnEditables = new boolean[] {
							false, false, false, false, false, false
						};
						public boolean isCellEditable(int row, int column) {
							return columnEditables[column];
						}
					});
			}
		});
		btnRefresh.setBounds(479, 243, 79, 28);
		panel_1.add(btnRefresh);
		
		
		employee_list.getColumnModel().getColumn(0).setResizable(false);
		employee_list.getColumnModel().getColumn(0).setPreferredWidth(36);
		employee_list.getColumnModel().getColumn(1).setResizable(false);
		employee_list.getColumnModel().getColumn(2).setResizable(false);
		employee_list.getColumnModel().getColumn(2).setPreferredWidth(117);
		employee_list.getColumnModel().getColumn(3).setResizable(false);
		employee_list.getColumnModel().getColumn(3).setPreferredWidth(99);
		employee_list.getColumnModel().getColumn(4).setResizable(false);
		employee_list.getColumnModel().getColumn(5).setResizable(false);
		employee_list.getColumnModel().getColumn(5).setPreferredWidth(81);
		
		employee_list.addMouseListener(new MouseAdapter() {
		    public void mousePressed(MouseEvent me) {
		    	Object[][] userList = employees.getEmployees();
		        JTable employee_list =(JTable) me.getSource();
		        Point p = me.getPoint();
		        final int row = employee_list.rowAtPoint(p);
		        if (me.getClickCount() == 2) {
		        	final JFrame editEmployee = new JFrame();

		    		panel_5.setLayout(null);
		    		
		    		textField = new JTextField();
		        	textField.setText(userList[row][0].toString());
		    		textField.setColumns(10);
		    		textField.setBounds(6, 28, 40, 28);
		    		panel_5.add(textField);
		    		
		    		textField_1 = new JTextField();
		        	textField_1.setText(userList[row][1].toString());
		        	textField_1.setEditable(false);
		    		textField_1.setColumns(10);
		    		textField_1.setBounds(54, 28, 80, 28);
		    		panel_5.add(textField_1);
		    		
		    		textField_2 = new JTextField();
		        	textField_2.setText(userList[row][2].toString());
		    		textField_2.setColumns(10);
		    		textField_2.setBounds(146, 28, 122, 28);
		    		panel_5.add(textField_2);
		    		
		    		textField_3 = new JTextField();
		    		final String oldPass = userList[row][3].toString();
		    		textField_3.setColumns(10);
		    		textField_3.setBounds(280, 28, 122, 28);
		    		panel_5.add(textField_3);
		    		
		    		textField_4 = new JTextField();
		    		textField_4.setText(userList[row][5].toString());
		    		textField_4.setColumns(10);
		    		textField_4.setBounds(436, 28, 122, 28);
		    		panel_5.add(textField_4);
		    		
		    		final JCheckBox checkBox_1 = new JCheckBox("");
		    		checkBox_1.setBounds(407, 33, 17, 18);

		    		panel_5.add(checkBox_1);
		    		
		    		JLabel label_1 = new JLabel("ID");
		    		label_1.setBounds(18, 6, 17, 16);
		    		panel_5.add(label_1);
		    		
		    		JLabel label_2 = new JLabel("Name");
		    		label_2.setBounds(73, 6, 40, 16);
		    		panel_5.add(label_2);
		    		
		    		JLabel label_3 = new JLabel("Email");
		    		label_3.setBounds(171, 6, 55, 16);
		    		panel_5.add(label_3);
		    		
		    		JLabel label_4 = new JLabel("New Password");
		    		label_4.setBounds(280, 3, 122, 10);
		    		panel_5.add(label_4);
		    		
		    		JLabel optional = new JLabel("Blank = no change");
		    		optional.setFont(new Font("SansSerif", Font.PLAIN, 10));
		    		optional.setBounds(280, 3, 122, 30);
		    		panel_5.add(optional);
		    		
		    		JLabel label_5 = new JLabel("Call?");
		    		label_5.setBounds(405, 6, 29, 16);
		    		panel_5.add(label_5);
		    		
		    		JLabel label_6 = new JLabel("Phone number");
		    		label_6.setBounds(446, 6, 94, 16);
		    		panel_5.add(label_6);
		    		
		    		JButton cancelNew = new JButton("Cancel");
		    		cancelNew.addActionListener(new ActionListener() {
		    			public void actionPerformed(ActionEvent arg0) {
		    				panel_5.removeAll();
		    				editEmployee.dispose();
		    			}
		    		});
		    		cancelNew.setBounds(382, 62, 90, 28);
		    		panel_5.add(cancelNew);
		    		
		    		JButton saveNew = new JButton("Save..");
		    		saveNew.addActionListener(new ActionListener() {
		    			public void actionPerformed(ActionEvent arg0) {
		    				List<String> user_arrayNew = new ArrayList<String>();
		    				
		    				if (!textField.getText().trim().equals("")){
		    					user_arrayNew.add(textField.getText().trim());
		    				}
		    				if (!textField_1.getText().trim().equals("")){
		    					user_arrayNew.add(textField_1.getText().trim());
		    				}
		    				if (!textField_2.getText().trim().equals("")){
		    					user_arrayNew.add(textField_2.getText().trim());
		    				}
		    				if (!textField_3.getText().trim().equals("")){
		    					user_arrayNew.add(textField_3.getText().trim());
		    					
		    				}else{
		    					user_arrayNew.add(oldPass);
		    				}
		    				if(checkBox_1.isSelected()){
		    					user_arrayNew.add("yes");
		    					if (!textField_4.getText().trim().equals("")){
		    					user_arrayNew.add(textField_4.getText().trim());
		    					}else{
		    						user_arrayNew.add("Number needed");
		    					}
		    				}else{
		    					user_arrayNew.add("no");
		    					user_arrayNew.add("N/A");
		    					
		    				}
		    				if(!user_arrayNew.isEmpty()){
		    					String[] userNew = user_arrayNew.toArray(new String[6]);
		    					if (!textField_3.getText().trim().equals("")){
		    					String input = userNew[3];
		    					 String hashpassNew = null;
		    					try {
		    						hashpassNew = Lottery.hashpass.sha1(input);
		    					} catch (NoSuchAlgorithmException e1) {
		    						// TODO Auto-generated catch block
		    						e1.printStackTrace();
		    					}
		    					 userNew[3] = hashpassNew;
		    					}else{
		    						userNew[3] = oldPass;
		    					}
		    						Lottery.employees.editEmployeeMysql(userNew);
				    				panel_5.removeAll();
				    				editEmployee.dispose();
		    					}
		    			}
		    		});
		    		saveNew.setBounds(468, 62, 90, 28);
		    		panel_5.add(saveNew);
		        	
		    		panel_5.validate();
		    		panel_5.repaint();
		    		  
		            System.out.println("test"+row);
		            editEmployee.setSize(564, 100);
		            editEmployee.getContentPane().add(panel_5);
		            centerWithinScreen(editEmployee);
		            editEmployee.setFocusable(true);
		            editEmployee.setUndecorated(true);
		            editEmployee.setVisible(true);
		            }
		    }
		});
		
		panel_4 = new JPanel();
		tabbedPane.addTab("Tickets", null, panel_4, null);
		panel_4.setLayout(null);
		
		final tickets tickets = new tickets();
		Object[][] ticketList = tickets.getTickets();
		
		JLabel lblExistingTickets = new JLabel("Existing Tickets");
		lblExistingTickets.setFont(new Font("SansSerif", Font.PLAIN, 14));
		lblExistingTickets.setBounds(51, 6, 106, 25);
		panel_4.add(lblExistingTickets);
		
		scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(6, 43, 158, 228);
		panel_4.add(scrollPane_1);
		table = new JTable();
		scrollPane_1.setViewportView(table);
		table.setModel(new DefaultTableModel(ticketList,
			new String[] {
				"Tickets", "Name"
			}
		) {
			Class[] columnTypes = new Class[] {
				Integer.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
			boolean[] columnEditables = new boolean[] {
				false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		table.getColumnModel().getColumn(0).setResizable(false);
		table.getColumnModel().getColumn(0).setPreferredWidth(50);
		table.getColumnModel().getColumn(1).setResizable(false);
		table.getColumnModel().getColumn(1).setPreferredWidth(80);
		
		scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(400, 43, 158, 228);
		panel_4.add(scrollPane_2);
		
		
		Object[][] requestedList = tickets.getRequested();
		table_1 = new JTable();
		table_1.setModel(new DefaultTableModel(requestedList,
			new String[] {
				"Amount", "Name"
			}
		) {
			Class[] columnTypes = new Class[] {
					Integer.class,String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
			boolean[] columnEditables = new boolean[] {
				false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		table_1.getColumnModel().getColumn(0).setResizable(false);
		table_1.getColumnModel().getColumn(0).setPreferredWidth(50);
		table_1.getColumnModel().getColumn(1).setResizable(false);
		table_1.getColumnModel().getColumn(1).setPreferredWidth(80);
		scrollPane_2.setViewportView(table_1);
		
		btnRefreshTables = new JButton("Refresh Tables");
		btnRefreshTables.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Object[][] requestedList = tickets.getRequested();
				table_1.setModel(new DefaultTableModel(requestedList,
						new String[] {
							"Amount", "Name"
						}
					) {
						Class[] columnTypes = new Class[] {
							Integer.class, String.class
						};
						public Class getColumnClass(int columnIndex) {
							return columnTypes[columnIndex];
						}
						boolean[] columnEditables = new boolean[] {
							false, false
						};
						public boolean isCellEditable(int row, int column) {
							return columnEditables[column];
						}
					});
				table_1.getColumnModel().getColumn(0).setResizable(false);
				table_1.getColumnModel().getColumn(0).setPreferredWidth(50);
				table_1.getColumnModel().getColumn(1).setResizable(false);
				table_1.getColumnModel().getColumn(1).setPreferredWidth(80);
				
				
				Object[][] ticketList = tickets.getTickets();
				table.setModel(new DefaultTableModel(ticketList,
						new String[] {
							"Tickets", "Name"
						}
					) {
						Class[] columnTypes = new Class[] {
								Integer.class,String.class
						};
						public Class getColumnClass(int columnIndex) {
							return columnTypes[columnIndex];
						}
						boolean[] columnEditables = new boolean[] {
							false, false
						};
						public boolean isCellEditable(int row, int column) {
							return columnEditables[column];
						}
					});
				table.getColumnModel().getColumn(0).setResizable(false);
				table.getColumnModel().getColumn(0).setPreferredWidth(50);
				table.getColumnModel().getColumn(1).setResizable(false);
				table.getColumnModel().getColumn(1).setPreferredWidth(80);
			}
		});
		btnRefreshTables.setBounds(213, 221, 145, 28);
		panel_4.add(btnRefreshTables);
		
		JButton btnIssueRequested = new JButton("Issue Requested ");
		btnIssueRequested.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				tickets.addRequested();
			}
		});
		btnIssueRequested.setBounds(213, 83, 145, 28);
		panel_4.add(btnIssueRequested);
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("Winners", null, panel_2, null);
		panel_2.setLayout(null);
		
		JButton pastwin = new JButton("Past winners");
		pastwin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				final JFrame winTable = new JFrame();
				
				final JPanel panel_6 = new JPanel();
				
				JScrollPane scrollPane_3 = new JScrollPane();
				scrollPane_3.setBounds(6, 6, 291, 211);
				panel_6.add(scrollPane_3);
				
	    		JButton closeWin = new JButton("Close");
	    		closeWin.addActionListener(new ActionListener() {
	    			public void actionPerformed(ActionEvent arg0) {
	    				panel_6.removeAll();
	    				winTable.dispose();
	    			}
	    		});
	    		closeWin.setBounds(382, 62, 90, 28);
	    		panel_6.add(closeWin);
				Object[][] winList = winners.getAll();
				table_2 = new JTable();
				table_2.setModel(new DefaultTableModel(winList,
					new String[] {
						"ID", "Name", "Date", "Ticket"
					}
				) {
					Class[] columnTypes = new Class[] {
						Integer.class, String.class, String.class, Integer.class
					};
					public Class getColumnClass(int columnIndex) {
						return columnTypes[columnIndex];
					}
					boolean[] columnEditables = new boolean[] {
						false, false, false, false
					};
					public boolean isCellEditable(int row, int column) {
						return columnEditables[column];
					}
				});
				table_2.getColumnModel().getColumn(0).setResizable(false);
				table_2.getColumnModel().getColumn(0).setPreferredWidth(28);
				table_2.getColumnModel().getColumn(1).setResizable(false);
				table_2.getColumnModel().getColumn(1).setPreferredWidth(83);
				table_2.getColumnModel().getColumn(2).setResizable(false);
				table_2.getColumnModel().getColumn(3).setResizable(false);
				table_2.getColumnModel().getColumn(3).setPreferredWidth(57);
				scrollPane_3.setViewportView(table_2);
				winTable.getContentPane().add(panel_6);
				winTable.setSize(500, 500);
	            centerWithinScreen(winTable);
	            winTable.setFocusable(true);
	            winTable.setUndecorated(true);
				winTable.setVisible(true);
			}
		});
		
		pastwin.setBounds(48, 185, 110, 23);
		panel_2.add(pastwin);
		
		winners winner = new winners();
		String currentWin = winner.getCurrent();
		
		final JLabel recentwin = new JLabel("<html>Most recent winner was "+currentWin+"</html>");
		recentwin.setFont(new Font("Serif", Font.PLAIN, 20));
		recentwin.setBounds(58, 39, 450, 134);
		panel_2.add(recentwin);
		
		pickwin = new JButton("Pick winner");
		pickwin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				winners winner = new winners();
				winner.pickWinner();
				winner.clearTickets();
				String currentWin = winner.getCurrent();
				recentwin.setText("Most recent winner was "+currentWin);
				recentwin.repaint();
			}
		});
		pickwin.setBounds(404, 185, 104, 23);
		panel_2.add(pickwin);
		
		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("Settings", null, panel_3, null);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Server Address");
		lblNewLabel.setBounds(10, 11, 75, 30);
		panel_3.add(lblNewLabel);
		
		JLabel lblServerPort = new JLabel("Server Port");
		lblServerPort.setBounds(10, 45, 75, 30);
		panel_3.add(lblServerPort);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setBounds(10, 86, 75, 30);
		panel_3.add(lblUsername);
		
		JLabel lblPassword_1 = new JLabel("Password");
		lblPassword_1.setBounds(10, 127, 75, 30);
		panel_3.add(lblPassword_1);
		
		JLabel lblDatabase = new JLabel("Database");
		lblDatabase.setBounds(10, 168, 75, 30);
		panel_3.add(lblDatabase);
		
		String[] xsettings = null;
		try {
			xsettings = Lottery.properties.readConfig();
		} catch (ParserConfigurationException | SAXException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		address = new JTextField();
		address.setText(xsettings[0]);
		address.setBounds(95, 16, 86, 20);
		panel_3.add(address);
		address.setColumns(10);
		
		port = new JTextField();
		port.setText(xsettings[1]);
		port.setBounds(95, 50, 86, 20);
		panel_3.add(port);
		port.setColumns(10);
		
		dbuser = new JTextField();
		dbuser.setText(xsettings[2]);
		dbuser.setBounds(95, 91, 86, 20);
		panel_3.add(dbuser);
		dbuser.setColumns(10);
		
		dbpass = new JTextField();
		dbpass.setText(xsettings[3]);
		dbpass.setBounds(95, 132, 86, 20);
		panel_3.add(dbpass);
		dbpass.setColumns(10);
		
		database = new JTextField();
		database.setText(xsettings[4]);
		database.setBounds(95, 173, 86, 20);
		panel_3.add(database);
		database.setColumns(10);
		
		JButton savec = new JButton("Save...");
		savec.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				List<String> settings = new ArrayList<String>();
				if (!address.getText().trim().equals("")){
					settings.add(address.getText().trim());
				}
				if (!port.getText().trim().equals("")){
					settings.add(port.getText().trim());
				}
				if (!dbuser.getText().trim().equals("")){
					settings.add(dbuser.getText().trim());
				}
				if (!dbpass.getText().trim().equals("")){
					settings.add(dbpass.getText().trim());
				}
				if (!database.getText().trim().equals("")){
					settings.add(database.getText().trim());
				}
				properties properties = new properties();
				properties.saveConfig(settings);
			}
		});
		savec.setBounds(371, 235, 89, 23);
		panel_3.add(savec);
		
		final JCheckBox checkBox = new JCheckBox("");
		checkBox.setBounds(425, 36, 21, 23);
		panel.add(checkBox);
		
		final JCheckBox checkBox_2 = new JCheckBox("");
		checkBox_2.setBounds(425, 65, 21, 23);
		panel.add(checkBox_2);
		
		final JCheckBox checkBox_3 = new JCheckBox("");
		checkBox_3.setBounds(425, 95, 21, 23);
		panel.add(checkBox_3);
		
		final JCheckBox checkBox_4 = new JCheckBox("");
		checkBox_4.setBounds(425, 126, 21, 23);
		panel.add(checkBox_4);
		
		final JCheckBox checkBox_5 = new JCheckBox("");
		checkBox_5.setBounds(425, 157, 21, 23);
		panel.add(checkBox_5);
		
		final JCheckBox checkBox_6 = new JCheckBox("");
		checkBox_6.setBounds(425, 188, 21, 23);
		panel.add(checkBox_6);
		
		phone = new JTextField();
		phone.setBounds(453, 36, 86, 20);
		panel.add(phone);
		phone.setColumns(10);
		
		phone_2 = new JTextField();
		phone_2.setColumns(10);
		phone_2.setBounds(453, 65, 86, 20);
		panel.add(phone_2);
		
		phone_3 = new JTextField();
		phone_3.setColumns(10);
		phone_3.setBounds(453, 95, 86, 20);
		panel.add(phone_3);
		
		phone_4 = new JTextField();
		phone_4.setColumns(10);
		phone_4.setBounds(453, 126, 86, 20);
		panel.add(phone_4);
		
		phone_5 = new JTextField();
		phone_5.setColumns(10);
		phone_5.setBounds(453, 157, 86, 20);
		panel.add(phone_5);
		
		phone_6 = new JTextField();
		phone_6.setColumns(10);
		phone_6.setBounds(453, 188, 86, 20);
		panel.add(phone_6);
		
		JButton btnadd = new JButton("Add");
		btnadd.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				List<String> user_array = new ArrayList<String>();
				List<String> user_array2 = new ArrayList<String>();
				List<String> user_array3 = new ArrayList<String>();
				List<String> user_array4 = new ArrayList<String>();
				List<String> user_array5 = new ArrayList<String>();
				List<String> user_array6 = new ArrayList<String>();
				if (!ID.getText().trim().equals("")){
					user_array.add(ID.getText().trim());
				}
				if (!email.getText().trim().equals("")){
					user_array.add(email.getText().trim());
				}
				if (!pass.getText().trim().equals("")){
					user_array.add( pass.getText().trim());
				}
				if (!name.getText().trim().equals("")){
					user_array.add(name.getText().trim());
				}
				if(checkBox.isSelected()){
					user_array.add("yes");
					if (!phone.getText().trim().equals("")){
					user_array.add(phone.getText().trim());
					}
				}
				if(!user_array.isEmpty()){
				if(!checkBox.isSelected()){
					user_array.add("no");
					user_array.add("N/A");
				}}
				if(!user_array.isEmpty()){
					String[] user = user_array.toArray(new String[6]);
					String input = user[2];
					 String hashpass = null;
					try {
						hashpass = Lottery.hashpass.sha1(input);
					} catch (NoSuchAlgorithmException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					 user[2] = hashpass;
						Lottery.employees.addEmployeeMysql(user);
					}
				if (!ID_2.getText().trim().equals("")){
					user_array2.add(ID_2.getText().trim());
				}
				if (!email_2.getText().trim().equals("")){
					user_array2.add(email_2.getText().trim());
				}
				if (!pass_2.getText().trim().equals("")){
					user_array2.add(pass_2.getText().trim());
				}
				if (!name_2.getText().trim().equals("")){
					user_array2.add(name_2.getText().trim());
				}
				if(checkBox_2.isSelected()){
					user_array2.add("yes");
					if (!phone_2.getText().trim().equals("")){
					user_array2.add(phone_2.getText().trim());
					}
				}
				if(!user_array2.isEmpty()){
				if(!checkBox_2.isSelected()){
					user_array2.add("no");
					user_array2.add("N/A");
				}}
				if(!user_array2.isEmpty()){
					String[] user2 = user_array2.toArray(new String[4]);
					String input = user2[2];
					 String hashpass2 = null;
					try {
						hashpass2 = Lottery.hashpass.sha1(input);
					} catch (NoSuchAlgorithmException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					 user2[2] = hashpass2;
						Lottery.employees.addEmployeeMysql2(user2);
					}
				if (!ID_3.getText().trim().equals("")){
					user_array3.add(ID_3.getText().trim());
				}
				if (!email_3.getText().trim().equals("")){
					user_array3.add(email_3.getText().trim());
				}
				if (!pass_3.getText().trim().equals("")){
					user_array3.add(pass_3.getText().trim());
				}
				if (!name_3.getText().trim().equals("")){
					user_array3.add(name_3.getText().trim());
				}
				if(checkBox_3.isSelected()){
					user_array3.add("yes");
					if (!phone_3.getText().trim().equals("")){
					user_array3.add(phone_3.getText().trim());
					}
				}
				if(!user_array3.isEmpty()){
				if(!checkBox_3.isSelected()){
					user_array3.add("no");
					user_array3.add("N/A");
				}}
				if(!user_array3.isEmpty())
				{
					String[] user3 = user_array3.toArray(new String[4]);
					String input = user3[2];
					 String hashpass3 = null;
					try {
						hashpass3 = Lottery.hashpass.sha1(input);
					} catch (NoSuchAlgorithmException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					 user3[2] = hashpass3;
						Lottery.employees.addEmployeeMysql3(user3);
					}
				if (!ID_4.getText().trim().equals("")){
					user_array4.add(ID_4.getText().trim());
				}
				if (!email_4.getText().trim().equals("")){
					user_array4.add(email_4.getText().trim());
				}
				if (!pass_4.getText().trim().equals("")){
					user_array4.add(pass_4.getText().trim());
				}
				if (!name_4.getText().trim().equals("")){
					user_array4.add(name_4.getText().trim());
				}
				if(checkBox_4.isSelected()){
					user_array4.add("yes");
					if (!phone_4.getText().trim().equals("")){
					user_array4.add(phone_4.getText().trim());
					}
				}
				if(!user_array4.isEmpty()){
				if(!checkBox_4.isSelected()){
					user_array4.add("no");
					user_array4.add("N/A");
				}}
				if(!user_array4.isEmpty())
				{
					String[] user4 = user_array4.toArray(new String[4]);
					String input = user4[2];
					 String hashpass4 = null;
					try {
						hashpass4 = Lottery.hashpass.sha1(input);
					} catch (NoSuchAlgorithmException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					 user4[2] = hashpass4;
						Lottery.employees.addEmployeeMysql4(user4);
					}
				if (!ID_5.getText().trim().equals("")){
					user_array5.add(ID_5.getText().trim());
				}
				if (!email_5.getText().trim().equals("")){
					user_array5.add(email_5.getText().trim());
				}
				if (!pass_5.getText().trim().equals("")){
					user_array5.add(pass_5.getText().trim());
				}
				if (!name_5.getText().trim().equals("")){
					user_array5.add(name_5.getText().trim());
				}
				if(checkBox_5.isSelected()){
					user_array5.add("yes");
					if (!phone_5.getText().trim().equals("")){
					user_array5.add(phone.getText().trim());
					}
				}
				if(!user_array5.isEmpty()){
				if(!checkBox_5.isSelected()){
					user_array5.add("no");
					user_array5.add("N/A");
				}}
				if(!user_array5.isEmpty())
				{
					String[] user5 = user_array5.toArray(new String[4]);
					String input = user5[2];
					 String hashpass5 = null;
					try {
						hashpass5 = Lottery.hashpass.sha1(input);
					} catch (NoSuchAlgorithmException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					 user5[2] = hashpass5;
						Lottery.employees.addEmployeeMysql5(user5);
					}
				if (!ID_6.getText().trim().equals("")){
					user_array6.add(ID_6.getText().trim());
				}
				if (!email_6.getText().trim().equals("")){
					user_array6.add(email_6.getText().trim());
				}
				if (!pass_6.getText().trim().equals("")){
					user_array6.add(pass_6.getText().trim());
				}
				if (!name_6.getText().trim().equals("")){
					user_array6.add(name_6.getText().trim());
				}
				if(checkBox_6.isSelected()){
					user_array6.add("yes");
					if (!phone_6.getText().trim().equals("")){
					user_array6.add(phone_6.getText().trim());
					}
				}
				if(!user_array6.isEmpty()){
				if(!checkBox_6.isSelected()){
					user_array6.add("no");
					user_array6.add("N/A");
				}}
				if(!user_array6.isEmpty())
				{
					String[] user6 = user_array6.toArray(new String[4]);
					String input = user6[2];
					 String hashpass6 = null;
					try {
						hashpass6 = Lottery.hashpass.sha1(input);
					} catch (NoSuchAlgorithmException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					 user6[2] = hashpass6;
						Lottery.employees.addEmployeeMysql6(user6);
					}
				}
		});
		btnadd.setBounds(483, 245, 56, 23);
		panel.add(btnadd);
		
		label = new JLabel("Call?");
		label.setBounds(426, 11, 34, 14);
		panel.add(label);
		
		JLabel lblnumber = new JLabel("(Number)");
		lblnumber.setBounds(470, 11, 46, 14);
		panel.add(lblnumber);
		
	}
	  public static void centerWithinScreen(Window wind) {
		    if (wind == null) {
		      throw new IllegalArgumentException("null Window passed");
		    }
		    final Toolkit toolKit = Toolkit.getDefaultToolkit();
		    final Rectangle rcScreen = new Rectangle(toolKit.getScreenSize());
		    final Dimension windSize = wind.getSize();
		    final Dimension parentSize = new Dimension(rcScreen.width, rcScreen.height);
		    if (windSize.height > parentSize.height) {
		      windSize.height = parentSize.height;
		    }
		    if (windSize.width > parentSize.width) {
		      windSize.width = parentSize.width;
		    }
		    center(wind, rcScreen);
		  }
	  private static void center(Component wind, Rectangle rect) {
		    if (wind == null || rect == null) {
		      throw new IllegalArgumentException("null Window or Rectangle passed");
		    }
		    Dimension windSize = wind.getSize();
		    int x = ((rect.width - windSize.width) / 2) + rect.x;
		    int y = ((rect.height - windSize.height) / 2) + rect.y;
		    if (y < rect.y) {
		      y = rect.y;
		    }
		    wind.setLocation(x, y);
		  }
		}
