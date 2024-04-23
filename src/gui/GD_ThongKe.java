package gui;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import com.toedter.calendar.JDateChooser;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import java.awt.Color;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GD_ThongKe extends JPanel {

	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public GD_ThongKe() {
		setSize(1140, 865);
		setLayout(null);
		setBackground(new Color(217, 217, 217));
		JLabel lblNewLabel_1 = new JLabel("Từ Ngày ");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		lblNewLabel_1.setBounds(114, 137, 90, 25);
		add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("Báo Cáo Thống Kê");
		lblNewLabel.setBounds(428, 32, 253, 33);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 30));
		add(lblNewLabel);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(239, 137, 197, 25);
		add(dateChooser);
		
		JLabel lblNewLabel_2 = new JLabel("Đến Ngày");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		lblNewLabel_2.setBounds(714, 137, 99, 25);
		add(lblNewLabel_2);
		
		JDateChooser dateChooser_1 = new JDateChooser();
		dateChooser_1.setBounds(846, 137, 197, 25);
		add(dateChooser_1);
		
		JButton btnNewButton = new JButton("Xem");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBackground(Color.black);
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnNewButton.setBounds(491, 194, 73, 25);
		btnNewButton.setBorderPainted(false);
		add(btnNewButton);
		
		JLabel lblNewLabel_3 = new JLabel("Tổng Doanh Thu");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_3.setBounds(114, 763, 166, 25);
		add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("100000000");
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_3_1.setBounds(877, 763, 166, 25);
		add(lblNewLabel_3_1);
		
		
		DefaultTableModel dataModel = new DefaultTableModel();
      	String headers[] = {"Tên Phim", "Số Suất Chiếu", "Số Vé Bán Ra", "Doanh Thu"};
      	dataModel = new DefaultTableModel(headers,0);
      	JTable table = new JTable(new DefaultTableModel(
      		new Object[][] {
      			{null, null, null, null},
      			{null, null, null, null},
      			{null, null, null, null},
      			{null, null, null, null},
      		},
      		new String[] {
      			"T\u00EAn Phim", "S\u1ED1 Su\u1EA5t Chi\u1EBFu", "S\u1ED1 V\u00E9 B\u00E1n Ra", "Doanh Thu"
      		}
      	));
      	table.getTableHeader().setFont(new Font("Arial", Font.BOLD, 20));
      	table.setRowHeight(25);
      	table.setBackground(new Color(217,217,217));
      	dataModel.addRow(new Object[]{"Phim Hài Hước", "10", "1200", "10000000"});
      	dataModel.addRow(new Object[]{"Phim Hành Động", "28", "4500", "40000000"});
        table.setModel(dataModel);
        JScrollPane scroll = new JScrollPane(table);
      	scroll.setBackground(new Color(217,217,217));
      	scroll.setBounds(114, 263, 929, 458);
      	add(scroll);
	}
}
