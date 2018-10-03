package Work;

import java.sql.SQLException;

public class Start {
	public static int proc;

	public static void main(String[] args){
		
		try {
			proc=Work.JDBCMySQL.SelectIntLastTable("select * from hsc.inj", "procent");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Windows.SavedClient.go();

		System.out.println("End");
	}
	}
