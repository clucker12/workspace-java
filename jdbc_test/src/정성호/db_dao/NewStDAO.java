package 정성호.db_dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import 정성호.db_common.DBConnet;
import 정성호.db_dto.NewstDTO;

public class NewStDAO {
	Connection con;
	PreparedStatement ps;
	ResultSet rs;
	public NewStDAO() {
		con = DBConnet.getConnection2();
	}
	public void getList() {
		String sql = "select * from newst";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getString("id"));
				System.out.println("---------------------------");
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public ArrayList<NewstDTO> getList2() {
		String sql = "select * from newst";
		ArrayList<NewstDTO> list = new ArrayList<NewstDTO>();
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				NewstDTO dto = new NewstDTO();
				dto.setId(rs.getNString("id"));
				dto.setAge(rs.getInt("age"));
				dto.setName(rs.getString("name"));
				list.add(dto);
//				System.out.println(rs.getString("id"));
//				System.out.println("---------------------------");
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	public NewstDTO selectOne(String inputId) {
		NewstDTO dto = null;
		String sql = "select * from newst where id = '" +inputId+"'";
		try {
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			if(rs.next()) {
//				System.out.println("존재하는 id : " + rs.getString("id"));
				dto = new NewstDTO();
				dto.setName(rs.getString("name"));
				dto.setId(rs.getString("id"));
				dto.setAge(rs.getInt("age"));
				
			}else {
//				System.out.println("존재하지 않는 id");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return dto;
	}
	public int insert(String id, String name, int age) {
		String sql = "insert into newst(id,name,age) values(?,?,?)";
		int result =0;
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, id);
			ps.setString(2, name);
			ps.setInt(3, age);
			result = ps.executeUpdate();
		} catch (Exception e) {
			System.out.println("동일한 아이디 입력시 문제 발생!!!!");
			e.printStackTrace();
		}
		return result;
	}
	public int update(NewstDTO d) {
		int result =0;
		String sql = "update newst set age=?,name=? where id=?";
		try {
			ps= con.prepareStatement(sql);
			ps.setInt(1, d.getAge());
			ps.setString(2, d.getName());
			ps.setString(3, d.getId());
			result = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	public int delete(String id) {
		int result = 0;
		String sql = "delete from newst where id = ?";
		try {
			ps= con.prepareStatement(sql);
			ps.setString(1,id);
			result = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
}
