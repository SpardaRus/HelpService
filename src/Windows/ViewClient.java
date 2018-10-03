package Windows;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import Work.JDBCMySQL;


import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import java.awt.GridLayout;
import java.awt.HeadlessException;

import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class ViewClient {
	private static JTextField textField;
	private static JTextField textField_1;
	public static int idclientred=1;

	/**
	 * @wbp.parser.entryPoint
	 */
	public static void go()
	{
		
		 
		
		 JFrame menu=new JFrame("???????? ?????????? ??????");
		 menu.getContentPane().setBackground(new Color(0, 255, 255));

         menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         menu.getContentPane().setLayout(new BorderLayout());
         menu.setSize(800,600);
         menu.setLocationRelativeTo(null);
         menu.setBackground(Color.ORANGE);
         menu.setResizable(false);
         
         JMenuBar menuBar = new JMenuBar();
         menu.getContentPane().add(menuBar, BorderLayout.NORTH);
         
         JMenu menu_1 = new JMenu("????");
         menuBar.add(menu_1);
         
         JMenuItem menuItem = new JMenuItem("?????????");
         menuItem.addActionListener(new ActionListener() {
         	public void actionPerformed(ActionEvent e) {
         		menu.dispose();
         		Settings.go();
         	}
         });
         menu_1.add(menuItem);
         
         JMenuItem menuItem_1 = new JMenuItem("?????");
         menuItem_1.addActionListener(new ActionListener() {
         	public void actionPerformed(ActionEvent e) {
         		System.exit(0);
         	}
         });
         menu_1.add(menuItem_1);
         
         JMenu menu_2 = new JMenu("??????");
         menuBar.add(menu_2);
         
         JMenuItem menuItem_2 = new JMenuItem("???????? ??????");
         menuItem_2.addActionListener(new ActionListener() {
         	public void actionPerformed(ActionEvent e) {
         		menu.dispose();
         		SavedClient.go();
         	}
         });
         menu_2.add(menuItem_2);
         
         JMenuItem menuItem_3 = new JMenuItem("???????? ???? ????????");
         menuItem_3.addActionListener(new ActionListener() {
         	public void actionPerformed(ActionEvent e) {
         		menu.dispose();
         		ViewClient.go();
         	}
         });
         menu_2.add(menuItem_3);
         
         JMenu menu_3 = new JMenu("\u041E\u0442\u0447\u0435\u0442\u044B");
         menuBar.add(menu_3);
         
         JMenuItem menuItem_4 = new JMenuItem("\u0421\u0442\u0430\u0442\u0443\u0441 \u0440\u0430\u0431\u043E\u0442");
         menuItem_4.addActionListener(new ActionListener() {
         	public void actionPerformed(ActionEvent arg0) {
         		menu.dispose();
         		StatRabClient.go();
         	}
         });
         menu_3.add(menuItem_4);
         
         JMenuItem menuItem_5 = new JMenuItem("\u041F\u0440\u0438\u0431\u044B\u043B\u044C");
         menuItem_5.addActionListener(new ActionListener() {
         	public void actionPerformed(ActionEvent e) {
         		menu.dispose();
         		StatSumm.go();
         	}
         });
         menu_3.add(menuItem_5);
         
         JPanel panel = new JPanel();
         panel.setBackground(new Color(0, 255, 255));
         menu.getContentPane().add(panel, BorderLayout.CENTER);
         panel.setLayout(new BorderLayout(0, 0));
         
         JPanel panel_1 = new JPanel();
         panel_1.setBackground(new Color(0, 255, 255));
         panel.add(panel_1, BorderLayout.SOUTH);
         panel_1.setLayout(new GridLayout(1, 3, 0, 0));
         
         JButton button_2 = new JButton("???????? ??????");
         button_2.addActionListener(new ActionListener() {
         	public void actionPerformed(ActionEvent e) {
         		menu.dispose();
         		SavedClient.go();
         	}
         });
         
         JPanel panel_5 = new JPanel();
         panel_5.setBackground(new Color(0, 255, 255));
         panel_1.add(panel_5);
         panel_5.setLayout(new GridLayout(0, 1, 0, 0));
         
         JLabel lblid = new JLabel("\u0412\u0432\u0435\u0434\u0438\u0442\u0435 \"id\" \u0434\u043B\u044F \u0443\u0434\u0430\u043B\u0435\u043D\u0438\u044F");
         lblid.setHorizontalAlignment(SwingConstants.CENTER);
         panel_5.add(lblid);
         
         textField = new JTextField();
         textField.setHorizontalAlignment(SwingConstants.CENTER);
         panel_5.add(textField);
         textField.setColumns(10);
         
         JButton button = new JButton("\u0423\u0434\u0430\u043B\u0438\u0442\u044C");
         button.addActionListener(new ActionListener() {
         	public void actionPerformed(ActionEvent e) {
         		
         		
         		try {
					if (!Work.JDBCMySQL.SelectInTable("id", textField.getText())){
						JOptionPane.showConfirmDialog(null, "?????? ?????? ?? ??????????", "???? ??????", JOptionPane.PLAIN_MESSAGE);
					}
					else{
					int del=Integer.parseInt(textField.getText());
					
					try {
						Work.JDBCMySQL.createDbUserTable("delete from hsc.view where id="+del);
						JOptionPane.showConfirmDialog(null, "???????? ????????", "???? ??????", JOptionPane.PLAIN_MESSAGE);
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					}
				} catch (NumberFormatException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (HeadlessException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
         		menu.dispose();
         		ViewClient.go();
         	}
         });
         panel_5.add(button);
         panel_1.add(button_2);
         
         JPanel panel_6 = new JPanel();
         panel_6.setBackground(Color.CYAN);
         panel_1.add(panel_6);
         panel_6.setLayout(new GridLayout(0, 1, 0, 0));
         
         JLabel lblid_1 = new JLabel("\u0412\u0432\u0435\u0434\u0438\u0442\u0435 \"id\" \u0434\u043B\u044F \u0440\u0435\u0434\u0430\u043A\u0442\u0438\u0440\u043E\u0432\u0430\u043D\u0438\u044F");
         lblid_1.setHorizontalAlignment(SwingConstants.CENTER);
         panel_6.add(lblid_1);
         
         textField_1 = new JTextField();
         textField_1.setHorizontalAlignment(SwingConstants.CENTER);
         textField_1.setColumns(10);
         
         
         panel_6.add(textField_1);
         
         JButton button_1 = new JButton("\u0420\u0435\u0434\u0430\u043A\u0442\u0438\u0440\u043E\u0432\u0430\u0442\u044C");
         button_1.addActionListener(new ActionListener() {
         	public void actionPerformed(ActionEvent e) {
         		try {
					if (textField_1.getText().equals("")||(Integer.parseInt(textField_1.getText())<=0)||(Integer.parseInt(textField_1.getText())>Work.JDBCMySQL.SelectIntLastTable("select * from hsc.view", "id"))||
							!Work.JDBCMySQL.SelectInTable("id", textField_1.getText())){
						
						JOptionPane.showConfirmDialog(null, "?????? ?????? ?? ??????????", "???? ??????", JOptionPane.PLAIN_MESSAGE);
					}else{
					idclientred=Integer.parseInt(textField_1.getText());
					menu.dispose();
					RedClient.go();}
				} catch (NumberFormatException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (HeadlessException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
         	}
         });
         panel_6.add(button_1);
         
         JLabel label = new JLabel("?????? ????????");
         label.setHorizontalAlignment(SwingConstants.CENTER);
         panel.add(label, BorderLayout.NORTH);
         
         JPanel panel_2 = new JPanel();
         panel_2.setBackground(new Color(0, 255, 255));
         panel.add(panel_2, BorderLayout.WEST);
         
         JPanel panel_3 = new JPanel();
         panel_3.setBackground(new Color(0, 255, 255));
         panel.add(panel_3, BorderLayout.EAST);
         
         JPanel panel_4 = new JPanel();
         panel_4.setBackground(new Color(0, 255, 255));
         panel.add(panel_4, BorderLayout.CENTER);
         
         String[] ar1={"id","name","model","defect","date","inj"};
         String[] ar={"id","?.?.?.","???????","?????????????","????","???????"};
         String [][] data =null;
         try {
 			
 			data = JDBCMySQL.SelectStringTable("Select * from hsc.view",ar1);
 			
 		} catch (SQLException e) {
 			// TODO Auto-generated catch block
 			e.printStackTrace();
 		}
panel_4.setLayout(new GridLayout(0, 1, 0, 0));
       
JTable table = new JTable(data, ar);

table.addMouseListener(new MouseAdapter() {
	@Override
	public void mouseClicked(MouseEvent e) {
	
		try {
			String [][] data =null;
			data = JDBCMySQL.SelectStringTable("Select * from hsc.view",ar1);
			String ss=data[table.getSelectedRow()][0];
			textField_1.setText(ss);
			textField.setText(ss);
		
		
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
});
table.getColumnModel().getColumn(0).setPreferredWidth(20);
table.getColumnModel().getColumn(1).setPreferredWidth(140);
table.getColumnModel().getColumn(2).setPreferredWidth(200);
table.getColumnModel().getColumn(3).setPreferredWidth(200);

table.setRowHeight(30);
JScrollPane scrollPane = new JScrollPane(table);


panel_4.add(scrollPane);
         
         
         menu.setVisible(true);
	}
}
