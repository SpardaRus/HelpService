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

import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class StatRabClient {
	private static JTextField textField;
	private static JTextField textField_1;
	public static int idclientred=1;


	/**
	 * @wbp.parser.entryPoint
	 */
	public static void go()
	{
		
		 
		
		 JFrame menu=new JFrame("Помошник сервисного центра");
		 menu.getContentPane().setBackground(new Color(0, 255, 255));

         menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         menu.getContentPane().setLayout(new BorderLayout());
         menu.setSize(800,600);
         menu.setLocationRelativeTo(null);
         menu.setBackground(Color.ORANGE);
         menu.setResizable(false);
         
         JMenuBar menuBar = new JMenuBar();
         menu.getContentPane().add(menuBar, BorderLayout.NORTH);
         
         JMenu menu_1 = new JMenu("Файл");
         menuBar.add(menu_1);
         
         JMenuItem menuItem = new JMenuItem("Настройки");
         menuItem.addActionListener(new ActionListener() {
          	public void actionPerformed(ActionEvent e) {
          		menu.dispose();
          		Settings.go();
          	}
          });
         menu_1.add(menuItem);
         
         JMenuItem menuItem_1 = new JMenuItem("Выход");
         menuItem_1.addActionListener(new ActionListener() {
         	public void actionPerformed(ActionEvent e) {
         		System.exit(0);
         	}
         });
         menu_1.add(menuItem_1);
         
         JMenu menu_2 = new JMenu("Клиент");
         menuBar.add(menu_2);
         
         JMenuItem menuItem_2 = new JMenuItem("Добавить нового");
         menuItem_2.addActionListener(new ActionListener() {
         	public void actionPerformed(ActionEvent e) {
         		menu.dispose();
         		SavedClient.go();
         	}
         });
         menu_2.add(menuItem_2);
         
         JMenuItem menuItem_3 = new JMenuItem("Просмотр всех клиентов");
         menuItem_3.addActionListener(new ActionListener() {
         	public void actionPerformed(ActionEvent e) {
         		menu.dispose();
         		ViewClient.go();
         	}
         });
         menu_2.add(menuItem_3);
         
         JPanel panel = new JPanel();
         panel.setBackground(new Color(0, 255, 255));
         menu.getContentPane().add(panel, BorderLayout.CENTER);
         panel.setLayout(new BorderLayout(0, 0));
         
         JPanel panel_1 = new JPanel();
         panel_1.setBackground(new Color(0, 255, 255));
         panel.add(panel_1, BorderLayout.SOUTH);
         panel_1.setLayout(new GridLayout(1, 3, 0, 0));
         
         JButton button_2 = new JButton("Добавить нового");
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
         		menu.dispose();
         		
         		try {
					if (!Work.JDBCMySQL.SelectInTable("id", textField.getText())){
						JOptionPane.showConfirmDialog(null, "Данной записи не существует", "База данных", JOptionPane.PLAIN_MESSAGE);
					}
					else{
					int del=Integer.parseInt(textField.getText());
					
					try {
						Work.JDBCMySQL.createDbUserTable("delete from hsc.view where id="+del);
						JOptionPane.showConfirmDialog(null, "Успешное удаление", "База данных", JOptionPane.PLAIN_MESSAGE);
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
         		StatRabClient.go();
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
					if (!Work.JDBCMySQL.SelectInTable("id", textField_1.getText())){
						
						JOptionPane.showConfirmDialog(null, "Данной записи не существует", "База данных", JOptionPane.PLAIN_MESSAGE);
					}else{
						
						ViewClient.idclientred=Integer.parseInt(textField_1.getText());
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
         
         JLabel label = new JLabel("\u0421\u0442\u0430\u0442\u0443\u0441 \u0440\u0430\u0431\u043E\u0442 \u043D\u0430 \u0441\u043A\u043B\u0430\u0434\u0435");
         label.setFont(new Font("Tahoma", Font.BOLD, 17));
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
         panel_4.setLayout(new GridLayout(2, 0, 0, 0));
         
         JPanel panel_8 = new JPanel();
         panel_8.setBackground(new Color(0, 255, 255));
         panel_4.add(panel_8);
         panel_8.setLayout(new BorderLayout(0, 0));
         
        
panel_4.setLayout(new GridLayout(0, 1, 0, 0));
         
         JLabel label_1 = new JLabel("\u0412 \u0440\u0430\u0431\u043E\u0442\u0435");
         panel_8.add(label_1, BorderLayout.NORTH);
         label_1.setHorizontalAlignment(SwingConstants.CENTER);
         
         String[] ar1={"id","name","model","defect","date","inj"};
         String[] ar={"id","Ф.И.О.","Техника","Неисправность","Дата","Инженер"};
         String [][] data =null;
         try {
 			
 			data = JDBCMySQL.SelectStringTable("Select * from hsc.view where scladstat=0 and rstat=0",ar1);
 			
 		} catch (SQLException e) {
 			// TODO Auto-generated catch block
 			e.printStackTrace();
 		}
panel_4.setLayout(new GridLayout(0, 1, 0, 0));
       
JTable table_1 = new JTable(data, ar);
table_1.addMouseListener(new MouseAdapter() {
	@Override
	public void mouseClicked(MouseEvent e) {
		try {
			String [][] data =null;
			data = JDBCMySQL.SelectStringTable("Select * from hsc.view where scladstat=0 and rstat=0",ar1);
			String ss=data[table_1.getSelectedRow()][0];
			textField_1.setText(ss);
			textField.setText(ss);
		
		
	
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
});
table_1.setRowHeight(30);
table_1.getColumnModel().getColumn(0).setPreferredWidth(20);
table_1.getColumnModel().getColumn(1).setPreferredWidth(140);
table_1.getColumnModel().getColumn(2).setPreferredWidth(200);
table_1.getColumnModel().getColumn(3).setPreferredWidth(200);

JScrollPane scrollPane = new JScrollPane(table_1);
         panel_8.add(scrollPane, BorderLayout.CENTER);
         
         JPanel panel_7 = new JPanel();
         panel_7.setBackground(new Color(0, 255, 255));
         panel_4.add(panel_7);
         panel_7.setLayout(new BorderLayout(0, 0));
         
         JPanel panel_9 = new JPanel();
         panel_9.setBackground(Color.CYAN);
         panel_7.add(panel_9);
         panel_9.setLayout(new BorderLayout(0, 0));
         
         JLabel label_2 = new JLabel("\u0420\u0435\u043C\u043E\u043D\u0442 \u0437\u0430\u0432\u0435\u0440\u0448\u0435\u043D");
         label_2.setHorizontalAlignment(SwingConstants.CENTER);
         panel_9.add(label_2, BorderLayout.NORTH);
         
         
         String[] ar2={"id","name","model","defect","date","inj"};
         String[] ar3={"id","Ф.И.О.","Техника","Неисправность","Дата","Инженер"};
         String [][] data1 =null;
         try {
 			
 			data1 = JDBCMySQL.SelectStringTable("Select * from hsc.view where scladstat=0 and rstat=1",ar2);
 			
 		} catch (SQLException e) {
 			// TODO Auto-generated catch block
 			e.printStackTrace();
 		}
panel_4.setLayout(new GridLayout(0, 1, 0, 0));
       
JTable table_2 = new JTable(data1, ar3);
table_2.addMouseListener(new MouseAdapter() {
	@Override
	public void mouseClicked(MouseEvent e) {
		try {
			String [][] data =null;
			data = JDBCMySQL.SelectStringTable("Select * from hsc.view where scladstat=0 and rstat=1",ar1);
			String ss=data[table_2.getSelectedRow()][0];
			textField_1.setText(ss);
			textField.setText(ss);
		
		//textField_1.setText(""+data[0][table.getSelectedRow()]);
		
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
});
table_2.setRowHeight(30);
table_2.getColumnModel().getColumn(0).setPreferredWidth(20);
table_2.getColumnModel().getColumn(1).setPreferredWidth(140);
table_2.getColumnModel().getColumn(2).setPreferredWidth(200);
table_2.getColumnModel().getColumn(3).setPreferredWidth(200);

JScrollPane scrollPane1 = new JScrollPane(table_2);
         
         panel_9.add(scrollPane1, BorderLayout.CENTER);
         
panel_4.setLayout(new GridLayout(0, 1, 0, 0));
       

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
	public void actionPerformed(ActionEvent arg0) {
		
		menu.dispose();
		StatSumm.go();
	}
});


menu_3.add(menuItem_5);
         
         
         menu.setVisible(true);
	}
}
