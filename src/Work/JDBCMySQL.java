package Work;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;



public class JDBCMySQL {
	
	public static void createDbUserTable(String createTableSQL) throws SQLException {
		Connection dbConnection = null;
		java.sql.Statement statement = null;
		
		
		
		
		try {
			dbConnection = getDBConnection();
			statement = dbConnection.createStatement();
		
		statement.execute(createTableSQL);
	
			
			
			
			
		
			
			}catch (SQLException e) {
		System.out.println(e.getMessage());
		}
			finally {
			if (statement != null) {
			statement.close();
		}
			if (dbConnection != null)
		{
		dbConnection.close();
}
}
}
	public static int SummTable(String createTableSQL, String k) throws SQLException {
		Connection dbConnection = null;
		java.sql.Statement statement = null;
		int n=0;
		
		
		
		try {
			dbConnection = getDBConnection();
			statement = dbConnection.createStatement();
		
		
	
			
			

		ResultSet rs = statement.executeQuery(createTableSQL);
		
		
		while (rs.next()) {
		
		n = Integer.parseInt(rs.getString(k))+n;
		}
		
			
			}catch (SQLException e) {
		System.out.println(e.getMessage());
		}
			finally {
			if (statement != null) {
			statement.close();
		}
			if (dbConnection != null)
		{
		dbConnection.close();
}
}
		return n;
}
	public static int SelectColIntLastTable(String createTableSQL) throws SQLException {
		Connection dbConnection = null;
		java.sql.Statement statement = null;
		int n=0;
		
		
		
		try {
			dbConnection = getDBConnection();
			statement = dbConnection.createStatement();
		
		
	
			
			

		ResultSet rs = statement.executeQuery(createTableSQL);
		
		
		while (rs.next()) {
		
		n++;
		
		}
		
			
			}catch (SQLException e) {
		System.out.println(e.getMessage());
		}
			finally {
			if (statement != null) {
			statement.close();
		}
			if (dbConnection != null)
		{
		dbConnection.close();
}
}
		return n;
}
	public static int SelectIntLastTable(String createTableSQL, String k) throws SQLException {
		Connection dbConnection = null;
		java.sql.Statement statement = null;
		int n=0;
		
		
		
		try {
			dbConnection = getDBConnection();
			statement = dbConnection.createStatement();
		
		
	
			
			

		ResultSet rs = statement.executeQuery(createTableSQL);
		
		
		while (rs.next()) {
		
		n = Integer.parseInt(rs.getString(k));
		
		}
		
			
			}catch (SQLException e) {
		System.out.println(e.getMessage());
		}
			finally {
			if (statement != null) {
			statement.close();
		}
			if (dbConnection != null)
		{
		dbConnection.close();
}
}
		return n;
}
	public static boolean SelectInTable(String k,String k2) throws SQLException {
		Connection dbConnection = null;
		java.sql.Statement statement = null;
		String createTableSQL="select * from hsc.view";
		boolean n=false;
		
		
		
		try {
			dbConnection = getDBConnection();
			statement = dbConnection.createStatement();
		
		
	
			
			

		ResultSet rs = statement.executeQuery(createTableSQL);
		
		
		while (rs.next()) {
		if (rs.getString(k).equals(k2))
		n = true;
		}
		
			
			}catch (SQLException e) {
		System.out.println(e.getMessage());
		}
			finally {
			if (statement != null) {
			statement.close();
		}
			if (dbConnection != null)
		{
		dbConnection.close();
}
}
		return n;
}
	public static boolean IfInTable(String createTableSQL,String k2) throws SQLException {
		Connection dbConnection = null;
		java.sql.Statement statement = null;
		
		boolean n=false;
		
		
		
		try {
			dbConnection = getDBConnection();
			statement = dbConnection.createStatement();
		
		
	
			
			

		ResultSet rs = statement.executeQuery(createTableSQL);
		
		
		while (rs.next()) {
		if (rs.getString(1).equals(k2))
		n = true;
		}
		
			
			}catch (SQLException e) {
		System.out.println(e.getMessage());
		}
			finally {
			if (statement != null) {
			statement.close();
		}
			if (dbConnection != null)
		{
		dbConnection.close();
}
}
		return n;
}
	public static String SelectSTable(String createTableSQL) throws SQLException {
		Connection dbConnection = null;
		java.sql.Statement statement = null;
		String n="";
		
		
		
		try {
			dbConnection = getDBConnection();
			statement = dbConnection.createStatement();
		
		
	
			
			

		ResultSet rs = statement.executeQuery(createTableSQL);
		
		
		while (rs.next()) {
			
		
		n = rs.getString(1);
		
		}
		
			
			}catch (SQLException e) {
		System.out.println(e.getMessage());
		}
			finally {
			if (statement != null) {
			statement.close();
		}
			if (dbConnection != null)
		{
		dbConnection.close();
}
}
		return n;
}
	public static String [] SelectSdTable(String createTableSQL) throws SQLException {
		Connection dbConnection = null;
		java.sql.Statement statement = null;
		

		String[] n=new String[SelectColIntLastTable(createTableSQL)];
		
		
		try {
			dbConnection = getDBConnection();
			statement = dbConnection.createStatement();
		
		
	
			
			

		ResultSet rs = statement.executeQuery(createTableSQL);
		
		int i=0;
		
		while (rs.next()) {
			
		
		n[i] = rs.getString(1);
		
		i++;
		
		}
		
			
			}catch (SQLException e) {
		System.out.println(e.getMessage());
		}
			finally {
			if (statement != null) {
			statement.close();
		}
			if (dbConnection != null)
		{
		dbConnection.close();
}
}
		return n;
}
	public static String SelectSTable(String createTableSQL, String k,int k2) throws SQLException {
		Connection dbConnection = null;
		java.sql.Statement statement = null;
		String n="";
		
		try {
			dbConnection = getDBConnection();
			statement = dbConnection.createStatement();
		

		ResultSet rs = statement.executeQuery(createTableSQL);
		
		
		while (rs.next()) {
			
		if(Integer.parseInt(rs.getString(1))==k2){
		n = rs.getString(k);
		}
		}
		
			
			}catch (SQLException e) {
		System.out.println(e.getMessage());
		}
			finally {
			if (statement != null) {
			statement.close();
		}
			if (dbConnection != null)
		{
		dbConnection.close();
}
}
		return n;
}
	public static String SelectSsSTable(String createTableSQL) throws SQLException {
		Connection dbConnection = null;
		java.sql.Statement statement = null;
		String n="";
		
		try {
			dbConnection = getDBConnection();
			statement = dbConnection.createStatement();
		

		ResultSet rs = statement.executeQuery(createTableSQL);
		
		
		while (rs.next()) {
			
		
		n = rs.getString(1);
		
		}
		
			
			}catch (SQLException e) {
		System.out.println(e.getMessage());
		}
			finally {
			if (statement != null) {
			statement.close();
		}
			if (dbConnection != null)
		{
		dbConnection.close();
}
}
		return n;
}
	public static int SelectITable(String createTableSQL, String k,int k2) throws SQLException {
		Connection dbConnection = null;
		java.sql.Statement statement = null;
		int n=0;
		
		
		
		try {
			dbConnection = getDBConnection();
			statement = dbConnection.createStatement();
		
		
	
			
			

		ResultSet rs = statement.executeQuery(createTableSQL);
		
		
		while (rs.next()) {
			n=rs.getInt(k);
		
			
		}
		
			
			}catch (SQLException e) {
		System.out.println(e.getMessage());
		}
			finally {
			if (statement != null) {
			statement.close();
		}
			if (dbConnection != null)
		{
		dbConnection.close();
}
}
		
		return n;
}
	
	public static void UpdateTable(String insertTableSQL) throws SQLException {
		Connection dbConnection = null;
		java.sql.Statement statement = null;
		
		
		
		
		try {
			dbConnection = getDBConnection();
			statement = dbConnection.createStatement();
		

		
		statement.executeUpdate(insertTableSQL);
			
			
			
			
		
			
			}catch (SQLException e) {
		System.out.println(e.getMessage());
		}
			finally {
			if (statement != null) {
			statement.close();
		}
			if (dbConnection != null)
		{
		dbConnection.close();
}
}
}
	
	public static String [][] SelectStringTable(String selectTableSQL,String[] ar) throws SQLException {
		Connection dbConnection = null;
		java.sql.Statement statement = null;
		
		String [][] data = new String[SelectColIntLastTable(selectTableSQL)][ar.length];
		
		
		
		try {
			dbConnection = getDBConnection();
			statement = dbConnection.createStatement();
		
		
			
			
			
			ResultSet rs = statement.executeQuery(selectTableSQL);
			
			int j=0;
			while (rs.next()) {
			
		for (int i=0;i<ar.length;i++){
		
			data[j][i]=rs.getString(ar[i]);	
		
			
		}j++;
		
			}
			}catch (SQLException e) {
		System.out.println(e.getMessage());
		}
			finally {
			if (statement != null) {
			statement.close();
		}
			if (dbConnection != null)
		{
		dbConnection.close();
}
}
		return data;
}
	
	private static Connection getDBConnection() {
		Connection dbConnection = null;
		try {
		Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
		System.out.println(e.getMessage());
		}
		try {
		dbConnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hsc","root", "root");
		return dbConnection;
		} catch (SQLException e) {
		System.out.println(e.getMessage());
		}
		return dbConnection;
		}
	
	

}
