package Work;

import java.awt.Desktop;
import java.io.File;

import java.io.IOException;
import java.io.PrintWriter;

import java.util.Calendar;

public class Print {

	public static void write(String fileName, String text) 
	{
	
	File file = new File(fileName);
	
		try {
			if(!file.exists())					
					file.createNewFile();						
												
			PrintWriter out = new PrintWriter(file.getAbsoluteFile());
					try 	
					{										
					out.print(text);
					} 
						finally 	
						{																	
						out.close();
						}
							
			}
			catch(IOException e)
				{					
				throw new RuntimeException( e );
				}
	}
	
	public static void print(String file_path,String name,
			String tel,String model,String sn,String komp,String ns,String pr,int n)
	{
		Calendar c=Calendar.getInstance(); 
		
		int year=c.get(Calendar.YEAR); 
		int month=c.get(Calendar.MONTH)+1; 
		int day=c.get(Calendar.DAY_OF_MONTH); 

		
		
		String text=  "Компьютерный салон 'Ваш Компьютер'\n"
					+ "410040, г.Саратов, 50 лет Октября 110А\n"
					+ "47-63-77 , м. 8-962-628-81-84\n"
					+ "Сохранная расписка\n"
					+ "Дата:"+day+"/"+month+"/"+year+"\n"
						+ "\tКлиент № "+n+"\n"
					+ "Имя: "+name+"\n"
					+ "Телефон:"+tel+"\n"
						+ "\tТехника\n"
					+ "Модель: "+model+"\n"
					+ "S/N: "+sn+"\n"
						+ "\tКомплектность:\n"+komp+"\n"
						+ "\tПримечания:\n"+pr+"\n\n"
					+ "От заказчика:__________\n"
					+ "\n\n\n"
					+ "\tЗаказчик: оборудование забрал надлежащего качества,\n"
					+ "\t\tпритензий к внешнему виду и комплектации не имею.\n"
					+ "\t\t\t\t\tПодпись____________\n"
					+ "\t\t\t\t\t\tДата:";
		text=text+"\n\n\n_____________________________________________________________\n\n\n"+text;
		
		
		Print.write(file_path, text);		
		
		try {
			Desktop.getDesktop().print(new File(file_path));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

