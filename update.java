package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class employeeupdate {

	

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		// 1.load the driver

		Class.forName("com.mysql.cj.jdbc.Driver");
		
		
		// 2.establish connection
				Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "root");

				// 3.create statement
				Statement statement = connection.
						createStatement();

				// 4.execute statement and process result
				int result = statement.executeUpdate("update employee set empname='Nilam' where empid=1");

				if (result != 0) {
					System.out.println("Data updated");
				} else {
					System.out.println("Data not updated");
				}

				// 5.close connection
				connection.close();

	}

}
