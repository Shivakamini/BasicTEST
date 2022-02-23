package com.automation.SeleniumInterview;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import io.netty.handler.codec.http.HttpContentEncoder.Result;

public class connectToDB {

	public static void main(String[] args) throws SQLException, IOException {

		String DBURL = "jdbc:mysql://localhost:3306/user";
	    Connection con=DriverManager.getConnection(DBURL, "username","password");
        Statement st=con.createStatement();
		ResultSet res=st.executeQuery("query"); 

	}

}
