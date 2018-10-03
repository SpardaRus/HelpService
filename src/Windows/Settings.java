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
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import Work.JDBCMySQL;

import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;


public class Settings {
	private static JTextField textField_1;
	private static JTextField textField_2;
	private static JTextField textField;
	private static JTextField textField_3;
	private static JTextField textField_4;

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
         
         JLabel label = new JLabel("\u041D\u0430\u0441\u0442\u0440\u043E\u0439\u043A\u0438");
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
         GridBagLayout gbl_panel_4 = new GridBagLayout();
         gbl_panel_4.columnWidths = new int[]{774, 0};
         gbl_panel_4.rowHeights = new int[] {100, 300};
         gbl_panel_4.columnWeights = new double[]{0.0, Double.MIN_VALUE};
         gbl_panel_4.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
         panel_4.setLayout(gbl_panel_4);
         JPanel panel_8 = new JPanel();
         panel_8.setBackground(new Color(0, 255, 255));
         String[] ar1={"id","name","procent"};
         String[] ar={"id","Имя","Процент"};
         String [][] data =null;
         try {
 			
 			data = JDBCMySQL.SelectStringTable("Select * from hsc.inj ",ar1);
 			
 		} catch (SQLException e) {
 			// TODO Auto-generated catch block
 			e.printStackTrace();
 		}
         panel_8.setLayout(new GridLayout(0, 1, 0, 0));
         
         JPanel panel_1 = new JPanel();
         panel_1.setBackground(new Color(0, 255, 255));
         GridBagConstraints gbc_panel_1 = new GridBagConstraints();
         gbc_panel_1.fill = GridBagConstraints.BOTH;
         gbc_panel_1.insets = new Insets(0, 0, 5, 0);
         gbc_panel_1.gridx = 0;
         gbc_panel_1.gridy = 0;
         panel_4.add(panel_1, gbc_panel_1);
         panel_1.setLayout(new GridLayout(0, 1, 0, 0));
         
         JPanel panel_6 = new JPanel();
         panel_6.setBackground(new Color(0, 255, 255));
         panel_1.add(panel_6);
         panel_6.setLayout(new BorderLayout(0, 0));
         
         JLabel label_2 = new JLabel("\u0414\u043E\u0431\u0430\u0432\u0438\u0442\u044C \u0438\u043D\u0436\u0435\u043D\u0435\u0440\u0430");
         label_2.setHorizontalAlignment(SwingConstants.CENTER);
         panel_6.add(label_2, BorderLayout.NORTH);
         
         JPanel panel_7 = new JPanel();
         panel_7.setBackground(new Color(0, 255, 255));
         panel_6.add(panel_7, BorderLayout.CENTER);
         panel_7.setLayout(new GridLayout(2, 2, 0, 0));
         
         JLabel label_3 = new JLabel("\u0418\u043C\u044F: ");
         label_3.setHorizontalAlignment(SwingConstants.CENTER);
         panel_7.add(label_3);
         
         textField_1 = new JTextField();
         panel_7.add(textField_1);
         textField_1.setColumns(10);
         
         JLabel label_4 = new JLabel("\u041F\u0440\u043E\u0446\u0435\u043D\u0442 \u0437\u0430\u0440\u0430\u0431\u043E\u0442\u043A\u0430: ");
         label_4.setHorizontalAlignment(SwingConstants.CENTER);
         panel_7.add(label_4);
         
         textField_2 = new JTextField();
         textField_2.setText("0");
         textField_2.setColumns(10);
         panel_7.add(textField_2);
         
         JButton button_1 = new JButton("\u0414\u043E\u0431\u0430\u0432\u0438\u0442\u044C");
         button_1.addActionListener(new ActionListener() {
         	public void actionPerformed(ActionEvent arg0) {
         		boolean psumm=true;
        		try {
        			Integer.parseInt(textField_2.getText());
        			psumm=true;
        			} catch (Exception e1) {
        				psumm=false;
        			}
	            
         		
         		if(psumm==false||Integer.parseInt(textField_2.getText())<0||Integer.parseInt(textField_2.getText())>100)
         		{JOptionPane.showConfirmDialog(null, "Некорректный ввод данных", "База данных", JOptionPane.PLAIN_MESSAGE);}
         		else
         		try {
         			int pp=Work.JDBCMySQL.SelectIntLastTable("select id from hsc.inj","id");
         			System.out.println("id= "+pp);         			
					Work.JDBCMySQL.createDbUserTable("insert into hsc.inj (id, name, procent) values("+(pp+1)+",'"+textField_1.getText()+"',"+ textField_2.getText()+")");
					JOptionPane.showConfirmDialog(null, "Успешное обновление данных", "База данных", JOptionPane.PLAIN_MESSAGE);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
         	menu.dispose();
         	Settings.go();
         	}
         });
         panel_6.add(button_1, BorderLayout.EAST);
         
           
           
           JPanel panel_11 = new JPanel();
           panel_11.setBackground(new Color(0, 255, 255));
           JTable table_1 = new JTable(data, ar);
           table_1.addMouseListener(new MouseAdapter() {
           	@Override
           	public void mouseClicked(MouseEvent arg0) {
           		try {
        			String [][] data =null;
        			data = JDBCMySQL.SelectStringTable("Select * from hsc.inj",ar1);
        			String ss=data[table_1.getSelectedRow()][0];
        			textField_3.setText(Work.JDBCMySQL.SelectSTable("select name from hsc.inj where id="+ Integer.parseInt(ss)));
        			textField_4.setText(Work.JDBCMySQL.SelectSTable("select procent from hsc.inj where id="+ Integer.parseInt(ss)));
        			textField.setText(ss);
        		
        		
        		
        		} catch (SQLException e1) {
        			// TODO Auto-generated catch block
        			e1.printStackTrace();
        		}
           	}
           });
           table_1.setRowHeight(30);
           table_1.getColumnModel().getColumn(0).setPreferredWidth(10);
           
            table_1.getColumnModel().getColumn(2).setPreferredWidth(10);
            

            JScrollPane scrollPane = new JScrollPane(table_1);
            panel_11.add(scrollPane);
            GridBagConstraints gbc_panel_11 = new GridBagConstraints();
            gbc_panel_11.fill = GridBagConstraints.BOTH;
            gbc_panel_11.gridx = 0;
            gbc_panel_11.gridy = 1;
            panel_4.add(panel_11, gbc_panel_11);
            panel_11.setLayout(new GridLayout(1, 0, 0, 0));
         
         JPanel panel_5 = new JPanel();
         panel_5.setBackground(Color.CYAN);
         panel.add(panel_5, BorderLayout.SOUTH);
         panel_5.setLayout(new GridLayout(1, 3, 0, 0));
         
         JPanel panel_9 = new JPanel();
         panel_9.setBackground(Color.CYAN);
         panel_5.add(panel_9);
         panel_9.setLayout(new GridLayout(0, 1, 0, 0));
         
         JLabel label_1 = new JLabel("\u0412\u0432\u0435\u0434\u0438\u0442\u0435 \"id\" \u0434\u043B\u044F \u0443\u0434\u0430\u043B\u0435\u043D\u0438\u044F");
         label_1.setHorizontalAlignment(SwingConstants.CENTER);
         panel_9.add(label_1);
         
         textField = new JTextField();
         textField.setHorizontalAlignment(SwingConstants.CENTER);
         textField.setColumns(10);
         panel_9.add(textField);
         
         JButton button = new JButton("\u0423\u0434\u0430\u043B\u0438\u0442\u044C");
         button.addActionListener(new ActionListener() {
         	public void actionPerformed(ActionEvent arg0) {

         		
         		try {
					if (!Work.JDBCMySQL.IfInTable("select id from hsc.inj", textField.getText())){
						JOptionPane.showConfirmDialog(null, "Данной записи не существует", "База данных", JOptionPane.PLAIN_MESSAGE);
					}
					else{
					int del=Integer.parseInt(textField.getText());
					
					try {
						Work.JDBCMySQL.createDbUserTable("delete from hsc.inj where id="+del);
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
         		menu.dispose();
         		Settings.go();
         	}
         });
         panel_9.add(button);
         
         JPanel panel_10 = new JPanel();
         panel_10.setBackground(Color.CYAN);
         panel_5.add(panel_10);
         panel_10.setLayout(new GridLayout(0, 1, 0, 0));
         
         textField_3 = new JTextField();
         textField_3.setHorizontalAlignment(SwingConstants.CENTER);
         textField_3.setColumns(10);
         panel_10.add(textField_3);
         
         textField_4 = new JTextField();
         textField_4.setHorizontalAlignment(SwingConstants.CENTER);
         panel_10.add(textField_4);
         textField_4.setColumns(10);
         
         JButton button_2 = new JButton("\u0420\u0435\u0434\u0430\u043A\u0442\u0438\u0440\u043E\u0432\u0430\u0442\u044C");
         button_2.addActionListener(new ActionListener() {
         	public void actionPerformed(ActionEvent arg0) {
         		
         		
         		try {
					Work.JDBCMySQL.UpdateTable("update hsc.inj set name='"+textField_3.getText()+"',procent='"+textField_4.getText()+"' where id="+textField.getText());
				menu.dispose();
				Settings.go();
         		} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
         		
         	}
         });
         panel_10.add(button_2);
         
        

       

JMenu menu_3 = new JMenu("\u041E\u0442\u0447\u0435\u0442\u044B");
menuBar.add(menu_3);

JMenuItem menuItem_4 = new JMenuItem("\u0421\u0442\u0430\u0442\u0443\u0441 \u0440\u0430\u0431\u043E\u0442");
menuItem_4.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
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
         
         
         menu.setVisible(true);
	}
}
