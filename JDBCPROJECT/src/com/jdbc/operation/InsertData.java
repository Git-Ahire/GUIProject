package com.jdbc.operation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertData {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		// 1. register the driver class
		// mysql connector
		Class.forName("com.mysql.cj.jdbc.Driver");

		// 2. connection build
		// connection interface ,return
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC", "root", "root");
		System.out.println(con);

		// statement creation
		Statement st = con.createStatement();

		// insert data
		// String query = "insert into student (id,name,per)
		// values(1001,'Yogita',50.4),(1002,'Bhagyashree','68.9'),(1003,'pratiksha','89.0')";

		// update data
		// String query = " update student set name = 'Aditi' where id ='1001'";

		String query = "select * from student";

		ResultSet rs = st.executeQuery(query);
		while (rs.next()) {

			System.out.println(rs.getInt("id"));
			System.out.println(rs.getString("name"));
			System.out.println(rs.getDouble("per"));

		}

		// execution of query

		//int row = st.executeUpdate(query);// result set

		//System.out.println(row);

		System.out.println("Data inserted succefully");
		con.close();
		st.close();

	}

}
