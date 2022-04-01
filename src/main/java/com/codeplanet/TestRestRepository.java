package com.codeplanet;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class TestRestRepository {

	@Autowired
	JdbcTemplate jdbcTemplate;

	public List getFirstApi(String email) {
		try {
			Connection con = jdbcTemplate.getDataSource().getConnection();
			Statement stmt = con.createStatement();
			String query2 = "Select * from links where created_by='" + email + "'";
			ResultSet rs1 = stmt.executeQuery(query2);
			List<Map<String, String>> l = new ArrayList<Map<String, String>>();

			while (rs1.next()) {
				Map<String, String> s = new HashMap<String, String>();
				s.put("longUrl", rs1.getString("long_link"));
				s.put("shortUrl", rs1.getString("short_link"));
				l.add(s);
			}
			return l;
		} catch (Exception e) {

		}
		return null;

	}

}
