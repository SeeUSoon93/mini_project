package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MbDAO {

	Connection conn = null;
	PreparedStatement psmt = null;
	PreparedStatement psmt2 = null;
	ResultSet rs = null;
	int cnt = 0;
	String data = "";

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
	public int id_check(MbDTO dto) {
		int count = 0;

		getCon();
		String sql = "select * from MEMBER where id = ?";

		try {
			psmt = conn.prepareStatement(sql);

			psmt.setString(1, dto.getId());

			rs = psmt.executeQuery();

			while (rs.next()) {
				count++;
			}

		} catch (SQLException e) {
			System.out.println("sql 문제");

			e.printStackTrace();
		}
		getClose();
		return count;
	}

	// insert
	public int insert(MbDTO dto) {
		getCon();
		String sql = "insert into MEMBER values(?, ?)";
		String sq2 = "insert into princess(id, str, intel, money, charm, mor, excount, story) values(?,0,0,0,0,0,0,0)";

		try {
			psmt = conn.prepareStatement(sql);
			psmt2 = conn.prepareStatement(sq2);

			psmt.setString(1, dto.getId());
			psmt.setString(2, dto.getPw());
			psmt2.setString(1, dto.getId());

			cnt = psmt.executeUpdate();
			psmt2.executeUpdate();
		} catch (SQLException e) {
			System.out.println("sql 문제");

			e.printStackTrace();
		}
		getClose();
		return cnt;
	}

	// 로그인
	public String login(MbDTO dto) {
		getCon();
		String sql = "SELECT * FROM MEMBER WHERE ID = ? AND PW = ?";

		try {
			psmt = conn.prepareStatement(sql);

			psmt.setString(1, dto.getId());
			psmt.setString(2, dto.getPw());

			rs = psmt.executeQuery();
			// 로그인
			if (rs.next()) {
				String id = rs.getString("ID");
				data += id;
			}
		} catch (SQLException e) {
			System.out.println("sql 문제");

			e.printStackTrace();
		}
		getClose();
		return data;
	}

}
