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
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import Work.JDBCMySQL;

import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import java.awt.GridLayout;




import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTable;



public class StatSumm {
	private static JTextField textField;
	private static JTextField textField_1;

	


	/**
	 * @wbp.parser.entryPoint
	 */
	static String[][] data1={
			 {"Доход",""}	,	
			 {"Расходы на зарплату",""}	,
			 {"Расходы на запчасти",""}	,
			 {"Итоговая прибыль магазина",""}
	 };
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
         
         JLabel label = new JLabel("\u041E\u0442\u0447\u0435\u0442 \u043E \u043F\u0440\u0438\u0431\u044B\u043B\u0438");
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
         gbl_panel_4.rowHeights = new int[] {103, 200, 200};
         gbl_panel_4.columnWeights = new double[]{1.0, Double.MIN_VALUE};
         gbl_panel_4.rowWeights = new double[]{0.0, 0.0, 1.0};
         panel_4.setLayout(gbl_panel_4);
         
         JPanel panel_1 = new JPanel();
         panel_1.setBackground(new Color(0, 255, 255));
         GridBagConstraints gbc_panel_1 = new GridBagConstraints();
         gbc_panel_1.fill = GridBagConstraints.BOTH;
         gbc_panel_1.insets = new Insets(0, 0, 5, 0);
         gbc_panel_1.gridx = 0;
         gbc_panel_1.gridy = 0;
         panel_4.add(panel_1, gbc_panel_1);
         panel_1.setLayout(new GridLayout(1, 3, 0, 0));
         
         JPanel panel_9 = new JPanel();
         panel_9.setBackground(new Color(0, 255, 255));
         panel_1.add(panel_9);
         panel_9.setLayout(new GridLayout(3, 1, 0, 0));
         
         JPanel panel_10 = new JPanel();
         panel_10.setBackground(new Color(0, 255, 255));
         panel_9.add(panel_10);
         
         JPanel panel_13 = new JPanel();
         panel_13.setBackground(new Color(0, 255, 255));
         panel_9.add(panel_13);
         panel_13.setLayout(new GridLayout(0, 3, 0, 0));
         
         JLabel label_7 = new JLabel("\u0421: ");
         label_7.setHorizontalAlignment(SwingConstants.RIGHT);
         panel_13.add(label_7);
         
         textField = new JTextField();
         textField.setText("2017-03-30");
         panel_13.add(textField);
         textField.setColumns(10);
         
         JLabel label_11 = new JLabel("\u041F\u0440\u0438\u043C\u0435\u0440: 2017-03-30");
         label_11.setHorizontalAlignment(SwingConstants.CENTER);
         panel_9.add(label_11);
         
         JPanel panel_7 = new JPanel();
         panel_7.setBackground(Color.CYAN);
         panel_1.add(panel_7);
         panel_7.setLayout(new GridLayout(3, 1, 0, 0));
         
         JPanel panel_8 = new JPanel();
         panel_8.setBackground(Color.CYAN);
         panel_7.add(panel_8);
         
         JPanel panel_14 = new JPanel();
         panel_14.setBackground(Color.CYAN);
         panel_7.add(panel_14);
         panel_14.setLayout(new GridLayout(0, 3, 0, 0));
         
         JLabel label_8 = new JLabel("\u041F\u043E: ");
         label_8.setHorizontalAlignment(SwingConstants.RIGHT);
         panel_14.add(label_8);
         
         textField_1 = new JTextField();
         textField_1.setText("2050-05-31");
         textField_1.setColumns(10);
         panel_14.add(textField_1);
         
         JLabel label_12 = new JLabel("\u041F\u0440\u0438\u043C\u0435\u0440: 2050-05-31");
         label_12.setHorizontalAlignment(SwingConstants.CENTER);
         panel_7.add(label_12);
         
         JPanel panel_11 = new JPanel();
         panel_11.setBackground(Color.CYAN);
         panel_1.add(panel_11);
         panel_11.setLayout(new GridLayout(3, 1, 0, 0));
         
         JPanel panel_12 = new JPanel();
         panel_12.setBackground(Color.CYAN);
         panel_11.add(panel_12);
         
         JButton button_2 = new JButton("\u0412\u044B\u0447\u0438\u0441\u043B\u0438\u0442\u044C");
         
         
         panel_11.add(button_2);
         
        
         
         JPanel panel_5 = new JPanel();
         panel_5.setBackground(new Color(0, 255, 255));
         GridBagConstraints gbc_panel_5 = new GridBagConstraints();
         gbc_panel_5.insets = new Insets(0, 0, 5, 0);
         gbc_panel_5.fill = GridBagConstraints.BOTH;
         gbc_panel_5.gridx = 0;
         gbc_panel_5.gridy = 1;
         panel_4.add(panel_5, gbc_panel_5);
         panel_5.setLayout(new GridLayout(0, 1, 0, 0));
         
        
         
         
         //
         String[] ar1={"name","procent","summ"};
         
         String [][] data =null;
         try {
 			
 			data = JDBCMySQL.SelectStringTable("Select * from hsc.inj",ar1);
 			
 		} catch (SQLException e) {
 			// TODO Auto-generated catch block
 			e.printStackTrace();
 		}
        
       
         String[] ar={"Имя","Процент","Сумма"};
 JTable table_1 = new JTable(data, ar);
         
         JScrollPane scrollPane = new JScrollPane(table_1);
         panel_5.add(scrollPane);
         table_1.setRowHeight(30);
         
         
         
         
         
         JPanel panel_6 = new JPanel();
         panel_6.setBackground(Color.CYAN);
         GridBagConstraints gbc_panel_6 = new GridBagConstraints();
         gbc_panel_6.fill = GridBagConstraints.BOTH;
         gbc_panel_6.gridx = 0;
         gbc_panel_6.gridy = 2;
         panel_4.add(panel_6, gbc_panel_6);
         panel_6.setLayout(new GridLayout(0, 1, 0, 0));
         
         JPanel panel_15 = new JPanel();
         panel_15.setBackground(new Color(0, 255, 255));
         panel_6.add(panel_15);
 panel_15.setLayout(new GridLayout(0, 1, 0, 0));
         
 
 String[] ar2={"Сведения","Сумма"};
 JTable table_11 = new JTable(data1, ar2);
 table_11.setRowHeight(30);
         JScrollPane scrollPane_1 = new JScrollPane(table_11);
         panel_15.add(scrollPane_1);
         
   
        
       
        

       

JMenu menu_3 = new JMenu("\u041E\u0442\u0447\u0435\u0442\u044B");
menuBar.add(menu_3);
JMenuItem menuItem_5 = new JMenuItem("\u041F\u0440\u0438\u0431\u044B\u043B\u044C");
menuItem_5.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent arg0) {
		
		menu.dispose();
		StatSumm.go();
	}
});
JMenuItem menuItem_4 = new JMenuItem("\u0421\u0442\u0430\u0442\u0443\u0441 \u0440\u0430\u0431\u043E\u0442");
menuItem_4.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		menu.dispose();
 		StatRabClient.go();
	}
});
menu_3.add(menuItem_4);


menu_3.add(menuItem_5);
button_2.addActionListener(new ActionListener() {
	
 	public void actionPerformed(ActionEvent arg0) {
 		String[] ar1={"name","procent"};
 	    
 	    String [][] data =null;
 	    float mp=0;
 	    try {
 			
 			data = JDBCMySQL.SelectStringTable("Select * from hsc.inj",ar1);
 			
 		} catch (SQLException e) {
 			// TODO Auto-generated catch block
 			e.printStackTrace();
 		}
 		try {
			float ss=Work.JDBCMySQL.SummTable("select summ from hsc.view where date BETWEEN '"+textField.getText()+"' AND '"+textField_1.getText()+"'", "summ");
			float rr=Work.JDBCMySQL.SummTable("select ras from hsc.view where date BETWEEN '"+textField.getText()+"' AND '"+textField_1.getText()+"'", "ras");
			
			for (int i=0;i<data.length;i++){
		   float injsumm=Work.JDBCMySQL.SummTable("select summ from hsc.view where date BETWEEN '"+textField.getText()+"' AND '"+textField_1.getText()+"' AND inj='"+data[i][0]+"'", "summ");
		   float injras=Work.JDBCMySQL.SummTable("select ras from hsc.view where date BETWEEN '"+textField.getText()+"' AND '"+textField_1.getText()+"' AND inj='"+data[i][0]+"'", "ras");
		   Work.JDBCMySQL.createDbUserTable("update hsc.inj set summ="+((injsumm-injras)/100*Integer.parseInt(data[i][1]))+" where name='"+data[i][0]+"'");
		   mp=(injsumm-injras)/100*Integer.parseInt(data[i][1])+mp;
		   }
			data1[0][1]=""+ss;
			data1[1][1]=""+mp;
			data1[2][1]=""+rr;
			data1[3][1]=""+(ss-rr-mp);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			JOptionPane.showConfirmDialog(null, "Некорректный ввод данных", "База данных", JOptionPane.PLAIN_MESSAGE);
			e.printStackTrace();
		}
 		menu.dispose();
 		StatSumm.go();
 		
 	}
 });
         
         
         menu.setVisible(true);
	}
}
