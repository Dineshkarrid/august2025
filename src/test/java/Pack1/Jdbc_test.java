package Pack1;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Jdbc_test {

	public static void main(String[] args)throws SQLException  {
		// TODO Auto-generated method stub
String url="jdbc:mysql://127.0.0.1:3306/aug4th2025";
String pwd="Root";
String user="root";
try(Connection con=DriverManager.getConnection(url,user,pwd)){
	System.out.println("connected successfully");
	String insertsql="insert into students (id,name,age)values(?,?,?)";
	try(PreparedStatement pt=con.prepareStatement(insertsql)){
		pt.setInt(1, 101);
		pt.setString(2, "dinesh");
		pt.setInt(3, 24);
		int rows=pt.executeUpdate();
		System.out.println("no of rows it contains are "+rows);
		
		
	} catch(SQLException e) {

		e.printStackTrace();
	}
	

	String read="select * from students";
	try(Statement stm =con.createStatement()){
	ResultSet rs=stm.executeQuery(read);
	while(rs.next()) {
		System.out.println("id is "+rs.getInt("id"));
		System.out.println("id is "+rs.getString("name"));
		System.out.println("id is "+rs.getInt("age"));}}

	catch(SQLException e) {

	e.printStackTrace();
}
String updatesql="update students set name=? where id=?";
try (PreparedStatement pt1=con.prepareStatement(updatesql)){
	pt1.setString(1, "hiii");
	pt1.setInt(2,101);
	int rows=pt1.executeUpdate();
	System.out.println("no of rows are updated "+rows);
}catch(SQLException e) {
	e.printStackTrace();
}
String deletesql="delete from students where id=?";
try(PreparedStatement pt3=con.prepareStatement(deletesql)){
	pt3.setInt(1, 102);
	int rows=pt3.executeUpdate();
	System.out.println("deleted rows"+rows);
}catch(SQLException e) {
	
}
	}

	}}