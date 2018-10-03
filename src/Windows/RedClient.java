package Windows;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.Calendar;

public class RedClient {
	





	
		private static JTextField textField_2;
		private static JTextField textField_5;
		private static JTextField textField;
		private static JTextField textField_7;
		private static JTextField textField_8;
		private static JTextField textField_9;
		static Calendar c=Calendar.getInstance(); 

		static int year=c.get(Calendar.YEAR); 
		static int month=c.get(Calendar.MONTH)+1; 
		static int day=c.get(Calendar.DAY_OF_MONTH); 
		private static JTextField textField_3;
		private static JTextField textField_4;
		private static JTextField textField_1;

	        /**
	         * @wbp.parser.entryPoint
	         */
	        public static void go() {

	        	
	        	
	        	int n=ViewClient.idclientred;
	        	
	            JFrame menu=new JFrame("Помошник сервисного центра");

	            menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	            menu.getContentPane().setLayout(new BorderLayout());
	            menu.setSize(800,600);
	            menu.setLocationRelativeTo(null);
	            menu.setBackground(Color.ORANGE);
	            menu.setResizable(false);

	            JPanel panel=new JPanel();
	            panel.setBackground(new Color(0, 255, 255));
	            menu.getContentPane().add(panel, BorderLayout.CENTER);
	            panel.setLayout(new BorderLayout(0, 0));
	            
	            JLabel label = new JLabel("\u0420\u0435\u0434\u0430\u043A\u0442\u0438\u0440\u043E\u0432\u0430\u043D\u0438\u0435 \u0434\u0430\u043D\u043D\u044B\u0445");
	            label.setBackground(new Color(0, 255, 255));
	            label.setFont(new Font("Arial", Font.BOLD, 24));
	            label.setHorizontalAlignment(SwingConstants.CENTER);
	            panel.add(label, BorderLayout.NORTH);
	            
	            JPanel panel_1 = new JPanel();
	            panel_1.setBackground(new Color(0, 255, 255));
	            panel.add(panel_1, BorderLayout.SOUTH);
	            panel_1.setLayout(new GridLayout(0, 3, 0, 0));
	            
	           
	            
	            JButton button_1 = new JButton("\u0421\u043E\u0445\u0440\u0430\u043D\u0438\u0442\u044C \u0438\u0437\u043C\u0435\u043D\u0435\u043D\u0438\u044F");
	            
	            panel_1.add(button_1);
	            
	            JButton button_2 = new JButton("Просмотр всех клиентов");
	            button_2.addActionListener(new ActionListener() {
	            	public void actionPerformed(ActionEvent arg0) {
	            		
	            		menu.dispose();
	            		ViewClient.go();
	            		
	            	}
	            });
	            panel_1.add(button_2);
	            
	            JButton btnNewButton = new JButton("\u041F\u0435\u0447\u0430\u0442\u044C \u0441\u043E\u0445\u0440\u0430\u043D\u043A\u0438");
	            btnNewButton.addActionListener(new ActionListener() {
	            	public void actionPerformed(ActionEvent e) {
	            		
	            			
	            		
	                    		String path="C://Windows/Temp/SaveNote.txt";
	                    		Work.Print.print(path,textField_2.getText(),textField_5.getText(),
	                    				textField_7.getText(),textField_8.getText(),textField_9.getText(),textField.getText(),textField_1.getText(),n);
	                    
	            	}
	            });
	            panel_1.add(btnNewButton);
	            
	            JPanel panel_2 = new JPanel();
	            panel_2.setBackground(new Color(0, 255, 255));
	            panel.add(panel_2, BorderLayout.CENTER);
	            panel_2.setLayout(new GridLayout(2, 2, 0, 0));
	            
	            JPanel panel_3 = new JPanel();
	            panel_3.setBackground(new Color(0, 255, 255));
	            panel_2.add(panel_3);
	            panel_3.setLayout(new BorderLayout(0, 0));
	            
	            JLabel label_3;
				
					label_3 = new JLabel("Клиент №"+n);
				
	            label_3.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
	            label_3.setHorizontalAlignment(SwingConstants.CENTER);
	            panel_3.add(label_3, BorderLayout.NORTH);
	           
	            
	            JPanel panel_7 = new JPanel();
	            panel_7.setBackground(new Color(0, 255, 255));
	            panel_3.add(panel_7, BorderLayout.CENTER);
	            panel_7.setLayout(new GridLayout(4, 2, 0, 0));
	            
	            JLabel label_4 = new JLabel("\u0424.\u0418.\u041E.");
	            label_4.setHorizontalAlignment(SwingConstants.CENTER);
	            panel_7.add(label_4);
	            
	            textField_2 = new JTextField();
	            try {
					textField_2.setText(Work.JDBCMySQL.SelectSTable("select * from view","name",n));
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
	            panel_7.add(textField_2);
	            textField_2.setColumns(10);
	            
	            JLabel label_6 = new JLabel("Телефон");
	            
	            label_6.setHorizontalAlignment(SwingConstants.CENTER);
	            panel_7.add(label_6);
	            
	            textField_5 = new JTextField();
	            try {
					textField_5.setText(Work.JDBCMySQL.SelectSTable("select * from view","tel",n));
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();}
	            panel_7.add(textField_5);
	            textField_5.setColumns(10);
	           
	            
	            JPanel panel_4 = new JPanel();
	            panel_4.setBackground(new Color(0, 255, 255));
	            panel_2.add(panel_4);
	            panel_4.setLayout(new BorderLayout(0, 0));
	            
	            JLabel label_7 = new JLabel("Техника");
	            label_7.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
	            label_7.setHorizontalAlignment(SwingConstants.CENTER);
	            panel_4.add(label_7, BorderLayout.NORTH);
	            
	            JPanel panel_8 = new JPanel();
	            panel_8.setBackground(new Color(0, 255, 255));
	            panel_4.add(panel_8, BorderLayout.CENTER);
	            panel_8.setLayout(new GridLayout(3, 2, 0, 0));
	            
	            JLabel label_9 = new JLabel("Модель: ");
	            label_9.setHorizontalAlignment(SwingConstants.RIGHT);
	            panel_8.add(label_9);
	            
	            textField_7 = new JTextField();
	            try {
					textField_7.setText(Work.JDBCMySQL.SelectSTable("select * from view","model",n));
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();}
	            textField_7.setColumns(10);
	            panel_8.add(textField_7);
	            
	            JLabel lblSn = new JLabel("S/N: ");
	            lblSn.setHorizontalAlignment(SwingConstants.RIGHT);
	            panel_8.add(lblSn);
	            
	            textField_8 = new JTextField();
	            try {
					textField_8.setText(Work.JDBCMySQL.SelectSTable("select * from view","sn",n));
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();}
	            textField_8.setColumns(10);
	            panel_8.add(textField_8);
	            
	            JLabel label_11 = new JLabel("Комплектация: ");
	            label_11.setHorizontalAlignment(SwingConstants.RIGHT);
	            panel_8.add(label_11);
	            
	            textField_9 = new JTextField();
	            try {
					textField_9.setText(Work.JDBCMySQL.SelectSTable("select * from view","komplekt",n));
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();}
	            textField_9.setColumns(10);
	            panel_8.add(textField_9);
	            
	            JPanel panel_5 = new JPanel();
	            panel_5.setBackground(new Color(0, 255, 255));
	            panel_2.add(panel_5);
	            panel_5.setLayout(new GridLayout(3, 2, 0, 0));
	            
	            JLabel label_1 = new JLabel("Неисправность");
	            label_1.setHorizontalAlignment(SwingConstants.CENTER);
	            panel_5.add(label_1);
	            
	            textField = new JTextField();
	            try {
					textField.setText(Work.JDBCMySQL.SelectSTable("select * from view","defect",n));
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();}
	            panel_5.add(textField);
	            textField.setColumns(10);
	            
	            JPanel panel_11 = new JPanel();
	            panel_11.setBackground(Color.CYAN);
	            panel_5.add(panel_11);
	            panel_11.setLayout(new GridLayout(4, 1, 0, 0));
	            
	            JLabel label_5 = new JLabel("\u0421\u0443\u043C\u043C\u0430 \u0440\u0430\u0431\u043E\u0442");
	            label_5.setHorizontalAlignment(SwingConstants.CENTER);
	            panel_11.add(label_5);
	            
	            textField_3 = new JTextField();
	            textField_3.setText("");
	            try {
					textField_3.setText(Work.JDBCMySQL.SelectSTable("select * from view","summ",n));
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();}
	            textField_3.setColumns(10);
	            panel_11.add(textField_3);
	            
	            JLabel label_12 = new JLabel("\u0420\u0430\u0441\u0445\u043E\u0434\u044B \u043D\u0430 \u0440\u0430\u0431\u043E\u0442\u0443");
	            label_12.setHorizontalAlignment(SwingConstants.CENTER);
	            panel_11.add(label_12);
	            
	            textField_4 = new JTextField();
	            textField_4.setText("");
	            try {
					textField_4.setText(Work.JDBCMySQL.SelectSTable("select * from view","ras",n));
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();}
	            textField_4.setColumns(10);
	            panel_11.add(textField_4);
	            
	            JPanel panel_6 = new JPanel();
	            panel_6.setBackground(new Color(0, 255, 255));
	            panel_2.add(panel_6);
	            panel_6.setLayout(new GridLayout(3, 1, 0, 0));
	           
	            
	            JLabel label_2 = new JLabel("\u041F\u0440\u0438\u043C\u0435\u0447\u0430\u043D\u0438\u044F");
	            panel_6.add(label_2);
	            label_2.setHorizontalAlignment(SwingConstants.CENTER);
	            
	            textField_1 = new JTextField();
	            panel_6.add(textField_1);
	            textField_1.setText("");
	            try {
					textField_1.setText(Work.JDBCMySQL.SelectSTable("select * from view","prim",n));
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();}
	            textField_1.setColumns(10);
	            
	            JPanel panel_12 = new JPanel();
	            panel_12.setBackground(new Color(0, 255, 255));
	            panel_6.add(panel_12);
	            panel_12.setLayout(new GridLayout(1, 3, 0, 0));
	            
	            JPanel panel_13 = new JPanel();
	            panel_13.setBackground(new Color(0, 255, 255));
	            panel_12.add(panel_13);
	            panel_13.setLayout(new GridLayout(2, 1, 0, 0));
	            
	            JLabel label_8 = new JLabel("\u0420\u0435\u043C\u043E\u043D\u0442 \u0437\u0430\u0432\u0435\u0440\u0448\u0435\u043D?");
	            
	            label_8.setHorizontalAlignment(SwingConstants.CENTER);
	            panel_13.add(label_8);
	            
	            JPanel panel_14 = new JPanel();
	            panel_14.setBackground(new Color(0, 255, 255));
	            panel_13.add(panel_14);
	            panel_14.setLayout(new GridLayout(1, 2, 0, 0));
	            
	            JRadioButton radioButton_1 = new JRadioButton("\u041D\u0435\u0442");
	            JRadioButton radioButton = new JRadioButton("\u0414\u0430");
	            radioButton.addActionListener(new ActionListener() {
	            	public void actionPerformed(ActionEvent arg0) {
	            		radioButton.setSelected(true);
	            		radioButton_1.setSelected(false);
	            		
	            	}
	            });
	            radioButton_1.addActionListener(new ActionListener() {
	            	public void actionPerformed(ActionEvent arg0) {
	            		radioButton_1.setSelected(true);
	            		radioButton.setSelected(false);
	            	}
	            });
	            radioButton.setHorizontalAlignment(SwingConstants.CENTER);
	          
	           try {
					if (Work.JDBCMySQL.SelectSTable("select * from view","rstat",n).equals("1")){
					radioButton.setSelected(true);}
					else radioButton.setSelected(false);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
	            panel_14.add(radioButton);
	            
	            
	            radioButton_1.setHorizontalAlignment(SwingConstants.CENTER);
	           try {
					if (Work.JDBCMySQL.SelectSTable("select * from view","rstat",n).equals("0")){
					radioButton_1.setSelected(true);}
					else radioButton_1.setSelected(false);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
	            panel_14.add(radioButton_1);
	            
	            JPanel panel_15 = new JPanel();
	            panel_15.setBackground(Color.CYAN);
	            panel_12.add(panel_15);
	            panel_15.setLayout(new GridLayout(2, 1, 0, 0));
	            
	            JLabel label_10 = new JLabel("\u041E\u0442\u0434\u0430\u043B\u0438 \u0442\u0435\u0445\u043D\u0438\u043A\u0443?");
	            label_10.setHorizontalAlignment(SwingConstants.CENTER);
	            panel_15.add(label_10);
	            
	            JPanel panel_16 = new JPanel();
	            panel_16.setBackground(Color.CYAN);
	            panel_15.add(panel_16);
	            panel_16.setLayout(new GridLayout(1, 2, 0, 0));
	            
	            JRadioButton radioButton_3 = new JRadioButton("\u041D\u0435\u0442");
	            JRadioButton radioButton_2 = new JRadioButton("\u0414\u0430");
	            radioButton_3.addActionListener(new ActionListener() {
	            	public void actionPerformed(ActionEvent arg0) {
	            		radioButton_3.setSelected(true);
	            		radioButton_2.setSelected(false);
	            	}
	            });
	            radioButton_2.addActionListener(new ActionListener() {
	            	public void actionPerformed(ActionEvent arg0) {
	            		radioButton_2.setSelected(true);
	            		radioButton_3.setSelected(false);
	            	}
	            });
	            radioButton_2.setHorizontalAlignment(SwingConstants.CENTER);
	            try {
					if (Work.JDBCMySQL.SelectSTable("select * from view","scladstat",n).equals("1")){
					radioButton_2.setSelected(true);}
					else radioButton_2.setSelected(false);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
	            panel_16.add(radioButton_2);
	            
	            
	            radioButton_3.setHorizontalAlignment(SwingConstants.CENTER);
	            try {
					if (Work.JDBCMySQL.SelectSTable("select * from view","scladstat",n).equals("0")){
					radioButton_3.setSelected(true);}
					else radioButton_3.setSelected(false);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
	            panel_16.add(radioButton_3);
	            
	            JPanel panel_17 = new JPanel();
	            panel_17.setBackground(new Color(0, 255, 255));
	            panel_12.add(panel_17);
	            panel_17.setLayout(new BorderLayout(0, 0));
	            
	            JLabel label_13 = new JLabel("\u0418\u043D\u0436\u0435\u043D\u0435\u0440");
	            label_13.setHorizontalAlignment(SwingConstants.CENTER);
	            panel_17.add(label_13, BorderLayout.NORTH);
	            
	          String [] injs={"Инженер"};
	           
				try {
					injs=Work.JDBCMySQL.SelectSdTable("select name from hsc.inj");
				} catch (SQLException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}
				
	          
	            
	           
				JComboBox comboBox = new JComboBox(injs);
				try {
										
					comboBox.setSelectedItem(Work.JDBCMySQL.SelectSsSTable("select inj from hsc.view where id="+n));
				} catch (SQLException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				} 

	            

	            panel_17.add(comboBox, BorderLayout.CENTER);
	            
	            JPanel panel_9 = new JPanel();
	            panel_9.setBackground(new Color(0, 255, 255));
	            panel.add(panel_9, BorderLayout.WEST);
	            
	            JPanel panel_10 = new JPanel();
	            panel_10.setBackground(new Color(0, 255, 255));
	            panel.add(panel_10, BorderLayout.EAST);
	            
	            JMenuBar menuBar = new JMenuBar();
	            menu.setJMenuBar(menuBar);
	            
	            JMenu menu_1 = new JMenu("Файл");
	            menuBar.add(menu_1);
	            
	            JMenuItem menuItem_1 = new JMenuItem("Настройки");
	            menuItem_1.addActionListener(new ActionListener() {
	            	public void actionPerformed(ActionEvent e) {
	            		menu.dispose();
	             		Settings.go();
	            	}
	            });
	            menu_1.add(menuItem_1);
	            
	            JMenuItem menuItem = new JMenuItem("Выход");
	            menuItem.addActionListener(new ActionListener() {
	            	public void actionPerformed(ActionEvent e) {
	            		System.exit(0);
	            	}
	            });
	            menu_1.add(menuItem);
	            
	            JMenu menu_2 = new JMenu("Клиент");
	            menuBar.add(menu_2);
	            
	            JMenuItem menuItem_3 = new JMenuItem("Добавить нового");
	            menuItem_3.addActionListener(new ActionListener() {
	            	public void actionPerformed(ActionEvent arg0) {
	            		menu.dispose();
	            		SavedClient.go();
	            	}
	            });
	            menu_2.add(menuItem_3);
	            
	            JMenuItem menuItem_2 = new JMenuItem("Просмотр всех клиентов");
	            menuItem_2.addActionListener(new ActionListener() {
	            	public void actionPerformed(ActionEvent e) {
	            		menu.dispose();
	            		ViewClient.go();
	            	}
	            });
	            menu_2.add(menuItem_2);
	            
	            
	            
	            
	            button_1.addActionListener(new ActionListener() {
	            	
	            	public void actionPerformed(ActionEvent arg0) {
	            		
	            		try {
	            			
	            			int rstat=0;
	        	            int scladstat=0;
	        	            if(radioButton.isSelected())
	        	            	rstat=1; else rstat=0;
	        	            if(radioButton_2.isSelected())
	        	            	scladstat=1; else scladstat=0;
	        	            String psumm="0";
		            		try {
		            			Integer.parseInt(textField_3.getText());
		            			psumm=textField_3.getText();
		            			} catch (Exception e1) {
		            				psumm="0";JOptionPane.showConfirmDialog(null, "Некорректный ввод данных сумма=0 р.", "База данных", JOptionPane.PLAIN_MESSAGE);
		            			}
		            		String psumm1="0";
		            		try {
		            			Integer.parseInt(textField_4.getText());
		            			psumm1=textField_4.getText();
		            			} catch (Exception e1) {
		            				psumm1="0";JOptionPane.showConfirmDialog(null, "Некорректный ввод данных расходы=0 р.", "База данных", JOptionPane.PLAIN_MESSAGE);
		            			}
	        	            
							Work.JDBCMySQL.UpdateTable("update hsc.view set name='"+textField_2.getText()+"',tel='"+textField_5.getText()+
									"',model='"+textField_7.getText()+"', sn='"+textField_8.getText()+"', komplekt='"+textField_9.getText()+"',"
											+ " defect='"+textField.getText()+"', prim='"+textField_1.getText()+
											"',summ='"+psumm+"',rstat='"+rstat+"',"
													+ "scladstat='"+scladstat+"',ras='"+psumm1+"' where id="+n);
							Work.JDBCMySQL.UpdateTable("update hsc.view set inj='"+comboBox.getSelectedItem()+"' where id="+n);
							
									
							JOptionPane.showConfirmDialog(null, "Успешное обновление данных", "База данных", JOptionPane.PLAIN_MESSAGE);
							if (psumm=="0")
							{menu.dispose();RedClient.go();}
						} catch (SQLException e) {
							// TODO Auto-generated catch block
							
							e.printStackTrace();
						}
	            	}
	            });
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
	            
	            JMenuItem menuItem_6 = new JMenuItem("\u041F\u0440\u0438\u0431\u044B\u043B\u044C");
	            menuItem_6.addActionListener(new ActionListener() {
	            	public void actionPerformed(ActionEvent e) {
	            		menu.dispose();
	            		StatSumm.go();
	            	}
	            });
	            menu_3.add(menuItem_6);
	            JMenuItem menuItem_5 = new JMenuItem("\u041F\u0440\u0438\u0431\u044B\u043B\u044C");
	            menuItem_5.addActionListener(new ActionListener() {
	            	public void actionPerformed(ActionEvent arg0) {
	            		
	            		menu.dispose();
	            		StatSumm.go();
	            	}
	            });
	            
	            
	            

	            menu.setVisible(true);




	           
	        }
	    


}
