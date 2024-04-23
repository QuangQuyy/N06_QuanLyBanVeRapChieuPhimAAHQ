package gui;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollBar;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;

public class GD_QuanLyHoaDon extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTable table;
	private JTextField textField;
	private JTable table_1;

	/**
	 * Launch the application.
	 */
	/**
	 * Create the frame.
	 */
	public GD_QuanLyHoaDon() {
		setBackground(new Color(217, 217, 217));
	    setSize(1140, 865);
		setBorder(new EmptyBorder(5, 5, 5, 5));
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Quản lí hóa đơn");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		lblNewLabel.setBounds(460, 28, 241, 45);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Danh sách hóa đơn");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 23));
		lblNewLabel_1.setBounds(96, 113, 291, 24);
		add(lblNewLabel_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(96, 168, 939, 241);
		add(scrollPane);
		
		
		table = new JTable();
		scrollPane.setViewportView(table);
		String header[]= {
				"Mã Hóa Đơn","Mã Nhân Viên", "Tên Khách Hàng", "Ngày Lập Hóa Đơn", "Số Lượng Vé","Số Điện Thoại", "Tổng Tiền"};
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},header
		));
		table.getTableHeader().setFont(new Font("Arial", Font.BOLD, 15));
      	table.setRowHeight(25);
      	table.setBackground(new Color(217,217,217));
      	
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Tìm kiếm theo tên", "Tìm kiếm theo ngày "}));
		comboBox.setBounds(96, 452, 169, 33);
		add(comboBox);
		
		textField = new JTextField();
		textField.setBounds(299, 452, 530, 33);
		add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Tìm");
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		btnNewButton.setBounds(909, 452, 126, 33);
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(Color.black);
		btnNewButton.setBorderPainted(false);
		add(btnNewButton);
		
		JLabel lblNewLabel_1_1 = new JLabel("Chi tiết hóa đơn");
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 23));
		lblNewLabel_1_1.setBounds(96, 513, 183, 24);
		add(lblNewLabel_1_1);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(96, 560, 937, 216);
		add(scrollPane_1);
		
		table_1 = new JTable();
		scrollPane_1.setViewportView(table_1);
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"M\u00E3 V\u00E9", "M\u00E3 H\u00F3a \u0110\u01A1n", "G\u00EDa V\u00E9"
			}
		));
		table_1.getTableHeader().setFont(new Font("Arial", Font.BOLD, 15));
      	table_1.setRowHeight(25);
      	table_1.setBackground(new Color(217,217,217));
	}
}