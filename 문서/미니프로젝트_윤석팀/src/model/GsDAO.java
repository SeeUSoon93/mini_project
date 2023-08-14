package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import controller.GsController;

public class GsDAO {


	// 전역변수
	Connection conn = null;
	PreparedStatement psmt = null;
	ResultSet rs = null;
	int cnt = 0;
	String data = "";
	String name = null;
	int story = 0;
	int exCount = 0;


	// getCon : DB에 연결권한을 확인하는 메서드(기능)
	public void getCon() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			String url = "jdbc:oracle:thin:@project-db-campus.smhrd.com:1524:xe";
			String db_id = "campus_e_0718_5";
			String db_pw = "smhrd5";
			conn = DriverManager.getConnection(url, db_id, db_pw);

		} catch (ClassNotFoundException e) {
			System.out.println("connection 문제");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("db연결 문제");
			e.printStackTrace();
		}

	}

	// getClose
	public void getClose() {
		try {
			if (rs != null)
				rs.close();
			if (psmt != null)
				psmt.close();
			if (conn != null)
				conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// id_check
	public void id_check(MbDTO dto) {
		getCon();
		String sql = "select * from princess where id = ?";

		try {
			psmt = conn.prepareStatement(sql);

			psmt.setString(1, dto.getId());

			rs = psmt.executeQuery();
			rs.next();
			name = rs.getString("name");
			story = rs.getInt("story");
			exCount = rs.getInt("excount");
			
			new GsController().nameCheck(new GsDTO(dto.getId(), story, name, exCount));
		} catch (SQLException e) {
			System.out.println("sql 문제");

			e.printStackTrace();
		}
		
		getClose();
		
	}
	
	// id_generate
	public GsDTO id_generate(GsDTO dto) {
		getCon();
		String sql = "update princess set name = ? where id = ?";
		GsDTO output = null;
		try {
			psmt = conn.prepareStatement(sql);

			psmt.setString(1, dto.getName());
			psmt.setString(2, dto.getId());

			cnt = psmt.executeUpdate();
			output = new GsDTO(dto.getId(), dto.getName(), dto.getStory(), cnt);
		} catch (SQLException e) {
			System.out.println("sql 문제");

			e.printStackTrace();
		}
		getClose();
		
		return output;
	}

}
