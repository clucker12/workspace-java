package 정성호.db_common;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnet {
	public Connection getConnection() {
		Connection con = null;
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
		return con;
	}
	
	public static Connection getConnection2() {
		Connection con = null;
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
		return con;
	}
}
