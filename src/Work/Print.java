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

		
		
		String text=  "������������ ����� '��� ���������'\n"
					+ "410040, �.�������, 50 ��� ������� 110�\n"
					+ "47-63-77 , �. 8-962-628-81-84\n"
					+ "��������� ��������\n"
					+ "����:"+day+"/"+month+"/"+year+"\n"
						+ "\t������ � "+n+"\n"
					+ "���: "+name+"\n"
					+ "�������:"+tel+"\n"
						+ "\t�������\n"
					+ "������: "+model+"\n"
					+ "S/N: "+sn+"\n"
						+ "\t�������������:\n"+komp+"\n"
						+ "\t����������:\n"+pr+"\n\n"
					+ "�� ���������:__________\n"
					+ "\n\n\n"
					+ "\t��������: ������������ ������ ����������� ��������,\n"
					+ "\t\t��������� � �������� ���� � ������������ �� ����.\n"
					+ "\t\t\t\t\t�������____________\n"
					+ "\t\t\t\t\t\t����:";
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

