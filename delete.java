package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class employeedelete {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// 1.load the driver

				Class.forName("com.mysql.cj.jdbc.Driver");
				
				// 2.establish connection
				Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "root");

				// 3.create statement
				Statement statement = connection.createStatement();

				// 4.execute statement and process result
				int result = statement.executeUpdate("delete from employee where empid=2");

				if (result != 0) {
					System.out.println("Data deleted");
				} else {
					System.out.println("Data not deleted");
				}

				// 5.close connection
				connection.close();


	}
}
