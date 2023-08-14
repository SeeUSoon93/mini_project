package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Random;

import controller.GsController;
import controller.PsController;

public class PsDAO {
	Connection conn = null;
	PreparedStatement psmt = null;
	PreparedStatement psmt2 = null;
	ResultSet rs = null;
	int cnt = 0;
	String data = "";
	Random rd = new Random();
	
	int str = 0; // 힘
	int intel = 0; // 지능
	int money = 0; // 재력
	int charm = 0; // 매력
	int mor = 0; // 도덕성
	int story = 0; // 스토리진행도
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
	
	public PsDTO PsTable(GsDTO dto) {
		getCon();
		String sql = "select * from princess where id = ?";
		PsDTO n = null;
		try {
			psmt = conn.prepareStatement(sql);

			psmt.setString(1, dto.getId());

			rs = psmt.executeQuery();
			rs.next();
			str = rs.getInt("str");
			intel = rs.getInt("intel");
			money = rs.getInt("money");
			charm = rs.getInt("charm");
			mor = rs.getInt("mor");
			
			n = new PsDTO(dto.getId(), str, intel, money, charm, mor);
		} catch (SQLException e) {
			System.out.println("sql 문제");

			e.printStackTrace();
		}
		getClose();
		return n;
	}

	// 체력단련 update
	public void ex1(String name) {
		getCon();
		String sql = "update PRINCESS set str = str+? where id = ? ";

		try {
			psmt = conn.prepareStatement(sql);
			int str = rd.nextInt(9) + 1;

			psmt.setInt(1, str);
			psmt.setString(2, name);
			cnt = psmt.executeUpdate();

		} catch (SQLException e) {

			e.printStackTrace();
		}
		getClose();

	}

	// 공부 update
	public void ex2(String name) {
		getCon();
		String sql = "update PRINCESS set intel = intel+ ? where id = ? ";

		try {
			psmt = conn.prepareStatement(sql);
			int intel = rd.nextInt(9) + 1;

			psmt.setInt(1, intel);
			psmt.setString(2, name);
			cnt = psmt.executeUpdate();

		} catch (SQLException e) {

			e.printStackTrace();
		}
		getClose();

	}

	// 알바 update
	public void ex3(String name) {
		getCon();
		String sql = "update PRINCESS set money = money+ ? where id = ? ";

		try {
			psmt = conn.prepareStatement(sql);
			int money = rd.nextInt(9) + 1;

			psmt.setInt(1, money);
			psmt.setString(2, name);
			cnt = psmt.executeUpdate();

		} catch (SQLException e) {

			e.printStackTrace();
		}
		getClose();

	}

	// 자기개발 update
	public void ex4(String name) {
		getCon();
		String sql = "update PRINCESS set charm = charm+ ? where id = ? ";

		try {
			psmt = conn.prepareStatement(sql);
			int charm = rd.nextInt(9) + 1;

			psmt.setInt(1, charm);
			psmt.setString(2, name);
			cnt = psmt.executeUpdate();

		} catch (SQLException e) {

			e.printStackTrace();
		}
		getClose();

	}

	// 스토리진행도 update
	public void storyUpdate(PsDTO dto) {
		getCon();
		
		String sql = "update PRINCESS set excount = ?, story = ? where id = ? ";
		try {
			psmt = conn.prepareStatement(sql);

			psmt.setInt(1, dto.getExCount() );
			psmt.setInt(2, dto.getStory() );
			psmt.setString(3, dto.getId());
			cnt = psmt.executeUpdate();

		} catch (SQLException e) {

			e.printStackTrace();
		}
		getClose();

	}
	// 이벤트 스텟업
	// 체력단련 update
	public void ev1(String name) {
		getCon();
		String sql = "update PRINCESS set str = str+? where id = ? ";

		try {
			psmt = conn.prepareStatement(sql);

			psmt.setInt(1, 20);
			psmt.setString(2, name);
			cnt = psmt.executeUpdate();

		} catch (SQLException e) {

			e.printStackTrace();
		}
		getClose();

	}

	// 공부 update
	public void ev2(String name) {
		getCon();
		String sql = "update PRINCESS set intel = intel+ ? where id = ? ";

		try {
			psmt = conn.prepareStatement(sql);

			psmt.setInt(1, 20);
			psmt.setString(2, name);
			cnt = psmt.executeUpdate();

		} catch (SQLException e) {

			e.printStackTrace();
		}
		getClose();

	}

	// 알바 update
	public void ev3(String name) {
		getCon();
		String sql = "update PRINCESS set money = money+ ? where id = ? ";

		try {
			psmt = conn.prepareStatement(sql);

			psmt.setInt(1, 20);
			psmt.setString(2, name);
			cnt = psmt.executeUpdate();

		} catch (SQLException e) {

			e.printStackTrace();
		}
		getClose();

	}

	// 자기개발 update
	public void ev4(String name) {
		getCon();
		String sql = "update PRINCESS set charm = charm+ ? where id = ? ";

		try {
			psmt = conn.prepareStatement(sql);

			psmt.setInt(1, 20);
			psmt.setString(2, name);
			cnt = psmt.executeUpdate();

		} catch (SQLException e) {

			e.printStackTrace();
		}
		getClose();

	}

	// 선성향 update
	public void ev5(String name) {
		getCon();
		String sql = "update PRINCESS set mor = mor+ ? where id = ? ";

		try {
			psmt = conn.prepareStatement(sql);

			psmt.setInt(1, 20);
			psmt.setString(2, name);
			cnt = psmt.executeUpdate();

		} catch (SQLException e) {

			e.printStackTrace();
		}
		getClose();

	}
	// 악성향 update
	public void ev6(String name) {
		getCon();
		String sql = "update PRINCESS set mor = mor- ? where id = ? ";

		try {
			psmt = conn.prepareStatement(sql);

			psmt.setInt(1, 20);
			psmt.setString(2, name);
			cnt = psmt.executeUpdate();

		} catch (SQLException e) {

			e.printStackTrace();
		}
		getClose();

	}

	public int endingCheck(String name) {
		int maxIndex = 0;
		int morCheck = 0;
		getCon();
		String sql = "select * from princess where id = ?";
		try {
			psmt = conn.prepareStatement(sql);

			psmt.setString(1, name);

			rs = psmt.executeQuery();
			rs.next();
			
			str = rs.getInt("str");
			intel = rs.getInt("intel");
			money = rs.getInt("money");
			charm = rs.getInt("charm");
			mor = rs.getInt("mor");
			
			int[] check = {str, intel, money, charm};
			for (int i = 0; i < check.length; i++) {
			    if (check[i] > check[maxIndex]) {
			        maxIndex = i;
			    }
			}
			if (mor>0) {
				morCheck = 1;
			} else {
				morCheck = -1;
			}
			
		} catch (SQLException e) {
			System.out.println("sql 문제");

			e.printStackTrace();
		}
		getClose();
		
		return (maxIndex+1)*morCheck;
	}
	// 상태창 불러오기
	public String selectOne(String id) {
		getCon();
		String sql = "SELECT * FROM princess WHERE id = ?";
		try {
			psmt = conn.prepareStatement(sql);

			psmt.setString(1, id);

			rs = psmt.executeQuery();

			if (rs.next()) {
				String name = rs.getString("name");
				int str= rs.getInt("str");
				int intel= rs.getInt("intel");
				int money= rs.getInt("money");
				int charm= rs.getInt("charm");
				int mor= rs.getInt("mor");

				data = data + "======캐릭터 상태창=======\n" +
				"이름 : " + name+ "\n"+
				"힘 : " + str+ "\n"+
				"지능 : " + intel+ "\n"+
				"재력 : " + money+ "\n"+
				"매력 : " + charm+ "\n"+
				"도덕성 : " + mor+ "\n"+
				"====================";
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		getClose();
		return data;
	}
	
	
	
	
	
}
