package jdbc_test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

class DB{
	//접속 -> 명령어 전송 -> 
	Connection con; // 연결할 객체를 가져온다
	PreparedStatement ps; // 명령어를 전송하는 역할
	ResultSet rs; // 결과 값을 받아오는 역할
	public DB() {
		try {
			// ojdbc가 있어야 사용가능 referenced libaries에 외부라이브러리 ojdbc.jar을 추가
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이브 로드 성공");
			String id,pwd,url;
			id = "c##java";
			pwd =  "1234";
			url = "jdbc:oracle:thin:@localhost:1522:xe";
			con = DriverManager.getConnection(url,id,pwd);
			System.out.println("연결 성공");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void getList() {
		String sql = "select * from newst";
		try {
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery(); // 명령어 실행
			while(rs.next()) {
				System.out.println(rs.getString("id"));
				System.out.println(rs.getString("name"));
				System.out.println(rs.getString("age"));
				System.out.println("------------------------");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

public class Ex01 {
	public static void main(String[] args) {
		DB db = new DB();
		db.getList();
	}
}
