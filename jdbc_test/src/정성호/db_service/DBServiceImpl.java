package 정성호.db_service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Scanner;

import 정성호.db_common.DBConnet;
import 정성호.db_dao.NewStDAO;
import 정성호.db_dto.NewstDTO;

public class DBServiceImpl implements DBService{
	NewStDAO dao;
	public DBServiceImpl() {
		dao = new NewStDAO();
	}
	
	@Override
	public void display() {
		Scanner input = new Scanner(System.in);
		String inputId;
		int num;
		while(true) {
			System.out.println("1. 모든 데이터 확인(service)");
			System.out.println("2. 모든 데이터 확인(dao)");
			System.out.println("3. 검색 데이터 확인");
			System.out.println("4. 데이터 추가");
			System.out.println("5. 데이터 수정");
			System.out.println("6. 데이터 삭제");
			System.out.println("7. 종료");
			num = input.nextInt();
			switch (num) {
			case 1: 
				Connection con = DBConnet.getConnection2();
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
				break;
			case 2: 
				System.out.println("---dao 연동 출력 ----");
				// dao.getList();
				ArrayList<NewstDTO> list = dao.getList2();
				System.out.println("아이디\t이름\t나이");
				System.out.println("----------------------");
//				for(NewstDTO d : list)
				for(int i=0; i < list.size(); i++) {
					NewstDTO d = list.get(i);
					System.out.println(d.getId()+"\t"+d.getName()+"\t"+d.getAge());
				}
				break;
			case 3: 
				System.out.println("찾을 id 입력");
				inputId = input.next();
				NewstDTO dto = dao.selectOne(inputId);
				if(dto !=null) {
					System.out.println(inputId + "님의 정보");
					System.out.println("id : " + dto.getId());
					System.out.println("name : " + dto.getName());
					System.out.println("age : " + dto.getAge());
				}else {
					System.out.println("존재하지 않는 id 입니다");
					System.out.println("다시 검색하세요!!!");
				}
				break;
			case 4: 
				System.out.println("저장 id");
				String id = input.next();
				System.out.println("저장 name");
				String name = input.next();
				System.out.println("저장 age");
				int age = input.nextInt();
				int result = dao.insert(id,name,age);
				if(result == 0) {
					System.out.println("문제가 발생했습니다.");
				}else {
					System.out.println("회원가입 축하");
				}
				break;
			case 5: 
				System.out.println("수정 비교할 id");
				id = input.next();
				System.out.println("수정 name");
				name = input.next();
				System.out.println("수정 age");
				age = input.nextInt();
				NewstDTO d = new NewstDTO();
				d.setName(name);
				d.setAge(age);
				d.setId(id);
				result = dao.update(d);
				if(result ==0) {
					System.out.println("수정 실패");
				}else {
					System.out.println("수정 완료");
				}
				break;
			case 6: 
				System.out.println("삭제할 id");
				id = input.next();
				result = dao.delete(id);
				if(result == 0) {
					System.out.println("삭제 실패");
				}else {
					System.out.println("삭제 완료");
				}
				break;
			case 7: 
				return;
			}
		}
		
		
		/*
		System.out.println("disp연동");
		
		Connection con = null;
		System.out.println("연동 전 con : " + con);
		//DBConnet db = new DBConnet();
		//con = db.getConnection();
		con = DBConnet.getConnection2();
		System.out.println("연동 후 con : " + con);
		*/
	}
	
}
