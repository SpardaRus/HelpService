package Windows;

import javax.swing.*;

import Work.JDBCMySQL;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.Calendar;





public class SavedClient {
	private static JTextField textField_2;
	private static JTextField textField_5;
	private static JTextField textField;
	private static JTextField textField_1;
	private static JTextField textField_7;
	private static JTextField textField_8;
	private static JTextField textField_9;
	static Calendar c=Calendar.getInstance(); 

	static int year=c.get(Calendar.YEAR); 
	static int month=c.get(Calendar.MONTH)+1; 
	static int day=c.get(Calendar.DAY_OF_MONTH); 

        /**
         * @wbp.parser.entryPoint
         */
        public static void go() {

            JFrame menu=new JFrame("???????? ?????????? ??????");

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
            
            JLabel label = new JLabel("???? ??????");
            label.setBackground(new Color(0, 255, 255));
            label.setFont(new Font("Arial", Font.BOLD, 24));
            label.setHorizontalAlignment(SwingConstants.CENTER);
            panel.add(label, BorderLayout.NORTH);
            
            JPanel panel_1 = new JPanel();
            panel_1.setBackground(new Color(0, 255, 255));
            panel.add(panel_1, BorderLayout.SOUTH);
            
            JButton button = new JButton("\u041F\u0435\u0447\u0430\u0442\u044C \u0441\u043E\u0445\u0440\u0430\u043D\u043A\u0438");
            button.addActionListener(new ActionListener() {
            	public void actionPerformed(ActionEvent e) {
            		String path="C://Windows/Temp/SaveNote.txt";
            		try {
						Work.Print.print(path,textField_2.getText(),textField_5.getText(),
								textField_7.getText(),textField_8.getText(),textField_9.getText(),textField.getText(),textField_1.getText(), JDBCMySQL.SelectIntLastTable("select * from hsc.view", "id")+1);
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
            	}
            });
            panel_1.setLayout(new GridLayout(0, 4, 0, 0));
            panel_1.add(button);
            
            JButton button_1 = new JButton("??????? ? ????");
            button_1.addActionListener(new ActionListener() {
            	public void actionPerformed(ActionEvent arg0) {
            		try {
            			
						
						Work.JDBCMySQL.UpdateTable("INsert into hsc.view (name,tel,model, sn, komplekt, defect, prim, date, summ, rstat, scladstat) "
								+ "values('"+textField_2.getText()+"','"+textField_5.getText()+"','"
								+textField_7.getText()+"','"+textField_8.getText()+"'"
										+ ",'"+textField_9.getText()+"','"+textField.getText()+"','"+textField_1.getText()+"','"
														+year+"/"+month+"/"+day+ "','"
																+0+"','"+0+"','"+0+"')");
						JOptionPane.showConfirmDialog(null, "???????? ???????? ??????", "???? ??????", JOptionPane.PLAIN_MESSAGE);
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						
						e.printStackTrace();
					}
            	}
            });
            panel_1.add(button_1);
            
            JButton button_2 = new JButton("???????? ???? ????????");
            button_2.addActionListener(new ActionListener() {
            	public void actionPerformed(ActionEvent arg0) {
            		
            		menu.dispose();
            		ViewClient.go();
            		
            	}
            });
            panel_1.add(button_2);
            
            JButton button_3 = new JButton("???????? ??????");
            button_3.addActionListener(new ActionListener() {
            	public void actionPerformed(ActionEvent arg0) {
            		menu.dispose();
            		SavedClient.go();
            	}
            });
            panel_1.add(button_3);
            
            JPanel panel_2 = new JPanel();
            panel_2.setBackground(new Color(0, 255, 255));
            panel.add(panel_2, BorderLayout.CENTER);
            panel_2.setLayout(new GridLayout(2, 2, 0, 0));
            
            JPanel panel_3 = new JPanel();
            panel_3.setBackground(new Color(0, 255, 255));
            panel_2.add(panel_3);
            panel_3.setLayout(new BorderLayout(0, 0));
            
            JLabel label_3;
			try {
				label_3 = new JLabel("?????? ?"+(Work.JDBCMySQL.SelectIntLastTable("select * from hsc.view", "id")+1));
			
            label_3.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
            label_3.setHorizontalAlignment(SwingConstants.CENTER);
            panel_3.add(label_3, BorderLayout.NORTH);} 
            catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
            
            JPanel panel_7 = new JPanel();
            panel_7.setBackground(new Color(0, 255, 255));
            panel_3.add(panel_7, BorderLayout.CENTER);
            panel_7.setLayout(new GridLayout(4, 2, 0, 0));
            
            JLabel label_4 = new JLabel("\u0424.\u0418.\u041E.");
            label_4.setHorizontalAlignment(SwingConstants.CENTER);
            panel_7.add(label_4);
            
            textField_2 = new JTextField();
            panel_7.add(textField_2);
            textField_2.setColumns(10);
            
            JLabel label_6 = new JLabel("???????");
            label_6.setHorizontalAlignment(SwingConstants.CENTER);
            panel_7.add(label_6);
            
            textField_5 = new JTextField();
            panel_7.add(textField_5);
            textField_5.setColumns(10);
           
            
            JPanel panel_4 = new JPanel();
            panel_4.setBackground(new Color(0, 255, 255));
            panel_2.add(panel_4);
            panel_4.setLayout(new BorderLayout(0, 0));
            
            JLabel label_7 = new JLabel("???????");
            label_7.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
            label_7.setHorizontalAlignment(SwingConstants.CENTER);
            panel_4.add(label_7, BorderLayout.NORTH);
            
            JPanel panel_8 = new JPanel();
            panel_8.setBackground(new Color(0, 255, 255));
            panel_4.add(panel_8, BorderLayout.CENTER);
            panel_8.setLayout(new GridLayout(3, 2, 0, 0));
            
            JLabel label_9 = new JLabel("\u041D\u0430\u0438\u043C\u0435\u043D\u043E\u0432\u0430\u043D\u0438\u0435 \u0442\u0435\u0445\u043D\u0438\u043A\u0438: ");
            label_9.setHorizontalAlignment(SwingConstants.RIGHT);
            panel_8.add(label_9);
            
            textField_7 = new JTextField();
            textField_7.setColumns(10);
            panel_8.add(textField_7);
            
            JLabel lblSn = new JLabel("S/N: ");
            lblSn.setHorizontalAlignment(SwingConstants.RIGHT);
            panel_8.add(lblSn);
            
            textField_8 = new JTextField();
            textField_8.setColumns(10);
            panel_8.add(textField_8);
            
            JLabel label_11 = new JLabel("????????????: ");
            label_11.setHorizontalAlignment(SwingConstants.RIGHT);
            panel_8.add(label_11);
            
            textField_9 = new JTextField();
            textField_9.setColumns(10);
            panel_8.add(textField_9);
            
            JPanel panel_5 = new JPanel();
            panel_5.setBackground(new Color(0, 255, 255));
            panel_2.add(panel_5);
            panel_5.setLayout(new GridLayout(2, 2, 0, 0));
            
            JLabel label_1 = new JLabel("?????????????");
            label_1.setHorizontalAlignment(SwingConstants.CENTER);
            panel_5.add(label_1);
            
            textField = new JTextField();
            panel_5.add(textField);
            textField.setColumns(10);
            
            JPanel panel_6 = new JPanel();
            panel_6.setBackground(new Color(0, 255, 255));
            panel_2.add(panel_6);
            panel_6.setLayout(new GridLayout(2, 1, 0, 0));
            
            JLabel label_2 = new JLabel("??????????");
            label_2.setHorizontalAlignment(SwingConstants.CENTER);
            panel_6.add(label_2);
            
            textField_1 = new JTextField();
            panel_6.add(textField_1);
            textField_1.setColumns(10);
            
            JPanel panel_9 = new JPanel();
            panel_9.setBackground(new Color(0, 255, 255));
            panel.add(panel_9, BorderLayout.WEST);
            
            JPanel panel_10 = new JPanel();
            panel_10.setBackground(new Color(0, 255, 255));
            panel.add(panel_10, BorderLayout.EAST);
            
            JMenuBar menuBar = new JMenuBar();
            menu.setJMenuBar(menuBar);
            
            JMenu menu_1 = new JMenu("????");
            menuBar.add(menu_1);
            
            JMenuItem menuItem_1 = new JMenuItem("\u041D\u0430\u0441\u0442\u0440\u043E\u0439\u043A\u0438");
            menuItem_1.addActionListener(new ActionListener() {
            	public void actionPerformed(ActionEvent e) {
            		menu.dispose();
             		Settings.go();
            	}
            });
            menu_1.add(menuItem_1);
            
            JMenuItem menuItem = new JMenuItem("?????");
            menuItem.addActionListener(new ActionListener() {
            	public void actionPerformed(ActionEvent e) {
            		System.exit(0);
            	}
            });
            menu_1.add(menuItem);
            
            JMenu menu_2 = new JMenu("??????");
            menuBar.add(menu_2);
            
            JMenuItem menuItem_3 = new JMenuItem("???????? ??????");
            menuItem_3.addActionListener(new ActionListener() {
            	public void actionPerformed(ActionEvent arg0) {
            		menu.dispose();
            		SavedClient.go();
            	}
            });
            menu_2.add(menuItem_3);
            
            JMenuItem menuItem_2 = new JMenuItem("???????? ???? ????????");
            menuItem_2.addActionListener(new ActionListener() {
            	public void actionPerformed(ActionEvent e) {
            		menu.dispose();
            		ViewClient.go();
            	}
            });
            menu_2.add(menuItem_2);
            
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

