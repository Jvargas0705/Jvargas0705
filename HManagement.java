package Booking;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JEditorPane;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.GridBagLayout;
import javax.swing.table.DefaultTableModel;

public class HManagement {

	private JFrame frame;
	private JTable JTable;
	private JTextField textCreditNum;
	private JTextField textFirstname;
	private JTextField textLastname;
	private JTextField textDateAR;
	private JTextField textDateLE;

	
	 
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HManagement window = new HManagement();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public HManagement() {
		initialize();
	}

	
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1370, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		frame.getContentPane().add(panel, BorderLayout.NORTH);
		panel.setLayout(new GridLayout(0, 1, 0, 0));
		
		JLabel lblNewLabel = new JLabel("Broadway's Hotel");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 50));
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		frame.getContentPane().add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new GridLayout(2, 1, 3, 3));
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_1.add(panel_2);
		panel_2.setLayout(new GridLayout(1, 3, 3, 3));
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_2.add(panel_4);
		panel_4.setLayout(new GridLayout(3, 3, 2, 2));
		
		JPanel panel_7 = new JPanel();
		panel_7.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_4.add(panel_7);
		panel_7.setLayout(null);
		
		JLabel lblTypeOfRoom = new JLabel("Type of Room");
		lblTypeOfRoom.setHorizontalAlignment(SwingConstants.CENTER);
		lblTypeOfRoom.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblTypeOfRoom.setBounds(0, 11, 145, 70);
		panel_7.add(lblTypeOfRoom);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_4.add(panel_8);
		panel_8.setLayout(null);
		
		JLabel lblDates = new JLabel("Date of Staying");
		lblDates.setHorizontalAlignment(SwingConstants.CENTER);
		lblDates.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblDates.setBounds(0, 11, 145, 70);
		panel_8.add(lblDates);
		
		JPanel panel_9 = new JPanel();
		panel_9.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_4.add(panel_9);
		panel_9.setLayout(null);
		
		JLabel lblAmountofBeds = new JLabel("how many beds?");
		lblAmountofBeds.setHorizontalAlignment(SwingConstants.CENTER);
		lblAmountofBeds.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblAmountofBeds.setBounds(0, 43, 145, 25);
		panel_9.add(lblAmountofBeds);
		
		JLabel lblRoomWith = new JLabel("Room with");
		lblRoomWith.setHorizontalAlignment(SwingConstants.CENTER);
		lblRoomWith.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblRoomWith.setBounds(0, 28, 145, 25);
		panel_9.add(lblRoomWith);
		
		JPanel panel_10 = new JPanel();
		panel_10.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_4.add(panel_10);
		panel_10.setLayout(new BorderLayout(0, 0));
		
		JRadioButton rdbtnLuxuryRoom = new JRadioButton("Luxury Room");
		panel_10.add(rdbtnLuxuryRoom, BorderLayout.CENTER);
		
		JPanel panel_11 = new JPanel();
		panel_11.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_4.add(panel_11);
		panel_11.setLayout(null);
		
		JLabel lblArriving = new JLabel("Arriving:");
		lblArriving.setBounds(1, 1, 143, 21);
		lblArriving.setHorizontalAlignment(SwingConstants.CENTER);
		lblArriving.setFont(new Font("Tahoma", Font.BOLD, 17));
		panel_11.add(lblArriving);
		
		textDateAR = new JTextField();
		textDateAR.setBounds(1, 33, 143, 28);
		panel_11.add(textDateAR);
		textDateAR.setColumns(10);
		
		JLabel lblMmddyy = new JLabel("MM/DD/YY");
		lblMmddyy.setHorizontalAlignment(SwingConstants.CENTER);
		lblMmddyy.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblMmddyy.setBounds(1, 60, 143, 21);
		panel_11.add(lblMmddyy);
		
		JPanel panel_12 = new JPanel();
		panel_12.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_4.add(panel_12);
		panel_12.setLayout(new BorderLayout(0, 0));
		
		JRadioButton rdbtnTwoBeds = new JRadioButton("Two Beds");
		panel_12.add(rdbtnTwoBeds, BorderLayout.CENTER);
		
		JPanel panel_13 = new JPanel();
		panel_13.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_4.add(panel_13);
		panel_13.setLayout(new BorderLayout(0, 0));
		
		JRadioButton rdbtnStandardRoom = new JRadioButton("Standard Room");
		panel_13.add(rdbtnStandardRoom, BorderLayout.CENTER);
		
		JPanel panel_14 = new JPanel();
		panel_14.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_4.add(panel_14);
		panel_14.setLayout(null);
		
		JLabel lblLeaving = new JLabel("Leaving:");
		lblLeaving.setBounds(1, 1, 143, 21);
		lblLeaving.setHorizontalAlignment(SwingConstants.CENTER);
		lblLeaving.setFont(new Font("Tahoma", Font.BOLD, 17));
		panel_14.add(lblLeaving);
		
		textDateLE = new JTextField();
		textDateLE.setColumns(10);
		textDateLE.setBounds(1, 34, 143, 28);
		panel_14.add(textDateLE);
		
		JLabel label = new JLabel("MM/DD/YY");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Tahoma", Font.BOLD, 17));
		label.setBounds(1, 60, 143, 21);
		panel_14.add(label);
		
		JPanel panel_15 = new JPanel();
		panel_15.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_4.add(panel_15);
		panel_15.setLayout(new BorderLayout(0, 0));
		
		JRadioButton rdbtnFourBeds = new JRadioButton("Four Beds");
		panel_15.add(rdbtnFourBeds, BorderLayout.CENTER);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_2.add(panel_5);
		panel_5.setLayout(new GridLayout(3, 3, 1, 1));
		
		JPanel panel_16 = new JPanel();
		panel_16.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_5.add(panel_16);
		panel_16.setLayout(null);
		
		JLabel lblCreditCard = new JLabel("Credit Card #:");
		lblCreditCard.setHorizontalAlignment(SwingConstants.LEFT);
		lblCreditCard.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblCreditCard.setBounds(0, 11, 145, 70);
		panel_16.add(lblCreditCard);
		
		JPanel panel_17 = new JPanel();
		panel_17.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_5.add(panel_17);
		panel_17.setLayout(null);
		
		textCreditNum = new JTextField();
		textCreditNum.setFont(new Font("Tahoma", Font.PLAIN, 17));
		textCreditNum.setHorizontalAlignment(SwingConstants.CENTER);
		textCreditNum.setBounds(0, 31, 145, 35);
		panel_17.add(textCreditNum);
		textCreditNum.setColumns(10);
		
		JPanel panel_18 = new JPanel();
		panel_18.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_5.add(panel_18);
		panel_18.setLayout(null);
		
		JComboBox LuxFlcomboBox = new JComboBox();
		LuxFlcomboBox.setModel(new DefaultComboBoxModel(new String[] {"", "F600", "F601", "F602", "F603", "F604", "F605", "F700", "F701", "F702", "F703", "F704", "F705", "F800", "F801", "F802", "F803", "F804", "F805", "F900", "F901", "F902", "F903", "F904", "F905", "F1000", "F1001", "F1002", "F1003", "F1004", "F1005"}));
		LuxFlcomboBox.setFont(new Font("Tahoma", Font.BOLD, 11));
		LuxFlcomboBox.setToolTipText("Floors");
		LuxFlcomboBox.setBounds(36, 45, 75, 36);
		panel_18.add(LuxFlcomboBox);
		
		JLabel lblLuXFloor = new JLabel("Luxury Floors:");
		lblLuXFloor.setHorizontalAlignment(SwingConstants.CENTER);
		lblLuXFloor.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblLuXFloor.setBounds(0, 0, 143, 21);
		panel_18.add(lblLuXFloor);
		
		JLabel Floors = new JLabel("Floors threw 6 & 10");
		Floors.setHorizontalAlignment(SwingConstants.CENTER);
		Floors.setFont(new Font("Tahoma", Font.BOLD, 13));
		Floors.setBounds(0, 15, 143, 21);
		panel_18.add(Floors);
		
		JPanel panel_19 = new JPanel();
		panel_19.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_5.add(panel_19);
		panel_19.setLayout(null);
		
		JLabel lblFirstName = new JLabel("First Name:");
		lblFirstName.setHorizontalAlignment(SwingConstants.LEFT);
		lblFirstName.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblFirstName.setBounds(0, 11, 125, 70);
		panel_19.add(lblFirstName);
		
		JPanel panel_20 = new JPanel();
		panel_20.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_5.add(panel_20);
		panel_20.setLayout(null);
		
		textFirstname = new JTextField();
		textFirstname.setFont(new Font("Tahoma", Font.BOLD, 17));
		textFirstname.setHorizontalAlignment(SwingConstants.CENTER);
		textFirstname.setColumns(10);
		textFirstname.setBounds(0, 30, 145, 35);
		panel_20.add(textFirstname);
		
		JPanel panel_21 = new JPanel();
		panel_21.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_5.add(panel_21);
		panel_21.setLayout(null);
		
		JLabel StandardFloors = new JLabel("Standard Floors:");
		StandardFloors.setHorizontalAlignment(SwingConstants.CENTER);
		StandardFloors.setFont(new Font("Tahoma", Font.BOLD, 17));
		StandardFloors.setBounds(0, 0, 143, 21);
		panel_21.add(StandardFloors);
		
		JLabel lblFloorsThrew = new JLabel("Floors threw 1 & 5");
		lblFloorsThrew.setHorizontalAlignment(SwingConstants.CENTER);
		lblFloorsThrew.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblFloorsThrew.setBounds(0, 15, 143, 21);
		panel_21.add(lblFloorsThrew);
		
		JComboBox StanFlcomboBox = new JComboBox();
		StanFlcomboBox.setModel(new DefaultComboBoxModel(new String[] {"", "F100", "F101", "F102", "F103", "F104", "F105", "F200", "F201", "F202", "F203", "F204", "F205", "F300", "F301", "F302", "F303", "F304", "F305", "F400", "F401", "F402", "F403", "F404", "F405", "F500", "F501", "F502", "F503", "F504", "F505"}));
		StanFlcomboBox.setBounds(36, 45, 75, 36);
		panel_21.add(StanFlcomboBox);
		
		JPanel panel_22 = new JPanel();
		panel_22.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_5.add(panel_22);
		panel_22.setLayout(null);
		
		JLabel lblLastName = new JLabel("Last Name:");
		lblLastName.setHorizontalAlignment(SwingConstants.LEFT);
		lblLastName.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblLastName.setBounds(0, 11, 125, 70);
		panel_22.add(lblLastName);
		
		JPanel panel_23 = new JPanel();
		panel_23.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_5.add(panel_23);
		panel_23.setLayout(null);
		
		textLastname = new JTextField();
		textLastname.setFont(new Font("Tahoma", Font.BOLD, 17));
		textLastname.setHorizontalAlignment(SwingConstants.CENTER);
		textLastname.setColumns(10);
		textLastname.setBounds(0, 29, 145, 35);
		panel_23.add(textLastname);
		
		JPanel panel_24 = new JPanel();
		panel_24.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_5.add(panel_24);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_2.add(panel_6);
		panel_6.setLayout(new GridLayout(4, 0, 0, 0));
		
		JButton btnConfirmBooking = new JButton("Confirm Booking");
		btnConfirmBooking.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 45));
		btnConfirmBooking.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				DefaultTableModel model = (DefaultTableModel) JTable.getModel();
						
						model.addRow(new Object[] { textDateAR.getText(),textDateLE.getText(),rdbtnLuxuryRoom.isSelected(),rdbtnStandardRoom.isSelected(),
							  rdbtnTwoBeds.isSelected(), rdbtnFourBeds.isSelected(), textCreditNum.getText(), 
							  textFirstname.getText(), textLastname.getText(), LuxFlcomboBox.getSelectedItem().toString(), 
							  StanFlcomboBox.getSelectedItem().toString(),});
				
			
			}
		});
		panel_6.add(btnConfirmBooking);
		
		JButton btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				JOptionPane.showMessageDialog(null, "Booking System Save " , " Booking System " , JOptionPane.OK_CANCEL_OPTION);
			}
		});
		btnSave.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 50));
		panel_6.add(btnSave);
		
		/*
		*JButton btnShowDetail = new JButton("Show Details");
		*btnShowDetail.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 50));
		*btnShowDetail.addActionListener(new ActionListener() {
			*public void actionPerformed(ActionEvent e) {
				
				*DefaultTableModel model = (DefaultTableModel) JTable.getModel();
				
				*model.addRow(new Object[] { textDateAR.getText(),textDateLE.getText(),rdbtnLuxuryRoom.isSelected(),rdbtnStandardRoom.isSelected(),
					  *rdbtnTwoBeds.isSelected(), rdbtnFourBeds.isSelected(), textCreditNum.getText(), 
					  *textFirstname.getText(), textLastname.getText(), LuxFlcomboBox.getSelectedItem().toString(), 
					 * StanFlcomboBox.getSelectedItem().toString(),});
				
			*}
		*});
		panel_6.add(btnShowDetail);*/
		
		JButton btnClear = new JButton("Clear");
		btnClear.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 50));
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				rdbtnLuxuryRoom.setSelected(false);
				rdbtnStandardRoom.setSelected(false);
				rdbtnTwoBeds.setSelected(false);
				rdbtnFourBeds.setSelected(false);
				
				textCreditNum.setText("");
				textFirstname.setText("");
				textLastname.setText("");
			}
		});
		panel_6.add(btnClear);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_1.add(panel_3);
		panel_3.setLayout(new GridLayout(2, 1, 1, 1));
		
		JPanel panel_26 = new JPanel();
		panel_26.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_3.add(panel_26);
		panel_26.setLayout(new BorderLayout(0, 0));
		
		JTable = new JTable();
		JTable.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		JTable.setFillsViewportHeight(true);
		JTable.setColumnSelectionAllowed(true);
		JTable.setCellSelectionEnabled(true);
		JTable.setModel(new DefaultTableModel(
			new Object[][] {
				{"Date Arriving", "Date Leaving", "Luxury Room", "Standard Room", "Two Beds", "Four Beds", "Credit card#", "First Name", "Last Name", "Luxury Room#", "Standard Room#"},
			},
			new String[] {
				"Date Arriving", "Date Leaving", "Luxury Room", "Standard Room", "Two Beds", "Four Beds", "Credit card#", "First Name", "Last Name", "Luxury Room#", "Standard Room#"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		JTable.setBounds(0,0,1340,139);
		panel_26.add(JTable, BorderLayout.CENTER);
		
		JPanel panel_25 = new JPanel();
		panel_25.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_3.add(panel_25);
		panel_25.setLayout(new GridLayout(1, 0, 0, 0));
		
		JButton btnDelete = new JButton("");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				DefaultTableModel model = (DefaultTableModel) JTable.getModel();
				
				if(JTable.getSelectedRow()==-1 );
					if(JTable.getRowCount()==0);
					
					JOptionPane.showMessageDialog(null, "No data to delete ", "Booking System", JOptionPane.OK_OPTION);
			/*else {
			*			JOptionPane.showMessageDialog(null, "Select a row to delete", "Booking System",JOptionPane.OK_OPTION);
			*		}
			else { model.removeRow(JTable.getSelectedRow());
			*/}
		});
		btnDelete.setFont(new Font("Tahoma", Font.BOLD, 50));
		panel_25.add(btnDelete);
		
		JButton btnUpdate = new JButton("");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				DefaultTableModel model = (DefaultTableModel) JTable.getModel();
				if(JTable.getSelectedRow()==-1) {
					if(JTable.getRowCount()==0) {
						JOptionPane.showConfirmDialog(null, "Booking System Update Confirmed ", "Booking System", JOptionPane.OK_OPTION);
					}
				}
				
			}
		});
		btnUpdate.setFont(new Font("Tahoma", Font.BOLD, 50));
		panel_25.add(btnUpdate);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rdbtnLuxuryRoom.setSelected(false);
				rdbtnStandardRoom.setSelected(false);
				rdbtnTwoBeds.setSelected(false);
				rdbtnFourBeds.setSelected(false);
				
				/*LuxFlcomboBox.setSelectedIndex(false);
				StanFlcomboBox.setSelectedIndex(false);*/
				textCreditNum.setText("");
				textFirstname.setText("");
				textLastname.setText("");
				textDateAR.setText("");
				textDateLE.setText("");
				
			}
		});
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 50));
		panel_25.add(btnReset);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frame = new JFrame("Exit");
				if(JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit", "Booking System",
					JOptionPane.YES_NO_OPTION)== JOptionPane.YES_NO_OPTION){
				System.exit(0);
				}
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 50));
		panel_25.add(btnExit);
	}
}
