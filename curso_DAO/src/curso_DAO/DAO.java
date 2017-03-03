package curso_DAO;

import java.sql.*;
import java.util.ArrayList;

public class DAO {
	private String getTableName(){
		return getClass().getName().split("\\.")[1].toLowerCase();
	}
	
	
	public DAO(String ...strings){

	}
	public boolean create(String ... strings){
		try{
			query("insert into "+getTableName()+" values "+"("+String.join(",",strings)+")");
			
			return true;
		}catch (Exception e){
			e.printStackTrace();
			return false;
		}
	}

	public  ArrayList<DAO> retrieveAll(){
		try{
			System.out.println(getTableName());
			ResultSet resultset = query("select * from " + getTableName());
			ArrayList<DAO> DAOlist = new ArrayList<DAO>(); 
			while (resultset.next()) {              
				int i = 1;
				ArrayList<String> values = new ArrayList<String>();
				while(i <= (resultset.getMetaData()).getColumnCount()) {
					values.add(resultset.getString(i++));
				}
				DAOlist.add(new DAO(values.toArray(new String[0])));
				System.out.println("aluno: " + resultset.getString("Nome"));                 
			}
			System.out.println("");
			return DAOlist;
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}
	public boolean update(){
		try{
			query("update "+getTableName()+" SET ");
			return true;
		}catch (Exception e){
			
			return false;
		}
	}
	public boolean delete(){
		return false;
	}
	private static ResultSet query(String sql){
		Connection connection = null;
		Statement statement = null;
		try {
			Class.forName("org.postgresql.Driver");

			connection = DriverManager.getConnection("jdbc:postgresql://127.0.0.1:5432/curso_DAO","postgres","postgres");
			statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(sql);

			//statement.close();
			//connection.close();

			return resultSet;
		} catch (Exception e) {
			System.out.println("Connection Failed! Check output console");
			e.printStackTrace();
			return null;
		}
	}
}
