public class employeeInsert {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// 1.load the driver

		Class.forName("com.mysql.cj.jdbc.Driver");

		// 2.establish connection
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "root");

		// 3.create statement
		Statement statement = connection.createStatement();

		// 4.execute statement and process result
		int result = statement.executeUpdate("insert into employee values(1,'Nilam','Pune'),(2,'Kajal','karjat'),(4,'Nikita','kashti')");

		if (result != 0) {
			System.out.println("Data inserted");
		} else {
			System.out.println("Data not inserted");
		}

		// 5.close connection
		connection.close();

	}

}
