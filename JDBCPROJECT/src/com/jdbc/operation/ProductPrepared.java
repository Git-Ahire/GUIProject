package com.jdbc.operation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class ProductPrepared {

	public static void main(String[] args)  throws Exception{
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","root");
		
//		PreparedStatement ps = con.prepareStatement("select * from product where id = ?");
//		PreparedStatement ps = con.prepareStatement("insert into product values(?,?,?)");
//		
//		ps.setInt(1, 1001);
//		ps.setString(2, "Mouse");
//		ps.setString(3, "xyz");
//		
//		ResultSet rs = ps.executeQuery();
//		
//		while(rs.next()) {
//			
//			System.out.println(rs.getInt("id"));
//			
//			System.out.println(rs.getString("name"));
//			
//			System.out.println(rs.getString("type"));
//			
//			
//		}
		
		Scanner sc = new Scanner(System.in);
		PreparedStatement ps = null;
		
		for(int i=1;i<=5;i++) {
			
			System.out.println("Enter id");
			int id =sc.nextInt();
			
			ps = con.prepareStatement("insert into product values(?,?,?)");
			
			ps.setInt(1, id);
		
			ps.executeUpdate();
		}

	}

}
