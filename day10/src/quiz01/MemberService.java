package quiz01;

import java.util.Scanner;

public class MemberService {
	MemberDTO dto;
	public MemberService() {
		dto = new MemberDTO();
	}
	Scanner input = new Scanner(System.in);
	private boolean on = true;
	
	public void studentRegister(String name,int kor,int math,int eng) {
		int sum;
		dto.setName(name);
		dto.setKor(kor);
		dto.setMath(math);
		dto.setEng(eng);
		sum = dto.getKor() + dto.getEng() + dto.getMath();
		dto.setSum(sum);
		if(sum/3>=90) {
			dto.setGrade("A");
		} else if(sum/3>=80) {
			dto.setGrade("B");
		}else {
			dto.setGrade("C");
		}
		on = false;
		System.out.println("등록 완료");
	}
	
	public void studentView() {
		System.out.println("--------학생 보기----------");
		System.out.println("이름 : " + dto.getName());
		System.out.println("국어 : " + dto.getKor());
		System.out.println("영어 : " + dto.getEng());
		System.out.println("수학 : " + dto.getMath());
		System.out.println("총합 : " + dto.getSum());
		System.out.println("등급 : " + dto.getGrade());
	}
	
	public void studentModify() {
		int n,kor,eng,math,sum;
		String name;
		while(true) {
			System.out.println("1.이름 수정");
			System.out.println("2.국어점수 수정");
			System.out.println("3.수학점수 수정");
			System.out.println("4.영어점수 수정");
			System.out.println("5.종료");
			System.out.println(">>>>>>>>>>>>>>>>>>");
			n = input.nextInt();
			switch(n) {
			case 1:
				System.out.print("이름 입력 :");
				name = input.next();
				dto.setName(name);
				System.out.println("이름 변경 완료");
				break;
			case 2:
				System.out.print("국어 점수 :");
				kor = input.nextInt();
				dto.setKor(kor);
				sum = dto.getKor() + dto.getEng() + dto.getMath();
				dto.setSum(sum);
				if(sum/3>=90) {
					dto.setGrade("A");
				} else if(sum/3>=80) {
					dto.setGrade("B");
				}else {
					dto.setGrade("C");
				}
				System.out.println("국어 점수 변경 완료");
				break;
			case 3:
				System.out.print("수학 점수 :");
				math = input.nextInt();
				dto.setMath(math);
				sum = dto.getKor() + dto.getEng() + dto.getMath();
				dto.setSum(sum);
				if(sum/3>=90) {
					dto.setGrade("A");
				} else if(sum/3>=80) {
					dto.setGrade("B");
				}else {
					dto.setGrade("C");
				}
				System.out.println("수학 점수 변경 완료");
				break;
			case 4:
				System.out.print("영어 점수 :");
				eng = input.nextInt();
				dto.setEng(eng);
				sum = dto.getKor() + dto.getEng() + dto.getMath();
				dto.setSum(sum);
				if(sum/3>=90) {
					dto.setGrade("A");
				} else if(sum/3>=80) {
					dto.setGrade("B");
				}else {
					dto.setGrade("C");
				}
				System.out.println("영어 점수 변경 완료");
				break;
			case 5:
				System.out.println("수정 종료");
				return;
			}
		}
	}
	
	public void studentDel() {
		dto.setName(null);
		dto.setEng(0);
		dto.setKor(0);
		dto.setMath(0);
		dto.setGrade(null);
		dto.setSum(0);
		on = true;
		System.out.println("삭제 완료");
	}
	
	
	
	public void display() {
		int num,kor,eng,math;
		String name;
		while(true) {
			System.out.println("1.학생 등록");
			System.out.println("2.학생 보기");
			System.out.println("3.정보 수정");
			System.out.println("4.회원 탈퇴");
			System.out.println("5.종료");
			System.out.print(">>>>>>");
			num = input.nextInt();
			switch(num) {
			case 1:
				if(on) {
					System.out.println("--------학생 등록----------");
					System.out.println("이름 입력 :");
					name = input.next();
					System.out.println("국어 점수 :");
					kor = input.nextInt();
					System.out.println("수학 점수 :");
					math = input.nextInt();
					System.out.println("영어 점수 :");
					eng = input.nextInt();
					studentRegister(name,kor,math,eng);
				}else {
					System.out.println("학생 등록 불가");
				}
				break;
			case 2:
				if(!on) {
					studentView();
					System.out.println("---------------------");
				}else {
					System.out.println("등록된 학생이 없습니다.");
				}
				break;
			case 3:
				if(!on) {
					studentModify();
				}else {
					System.out.println("수정할 학생이 없습니다.");
				}
				break;
			case 4:
				if(!on) {
					studentDel();
				}else {
					System.out.println("삭제할 학생이 없습니다.");
				}
				break;
			case 5:
				System.out.println("종료");
				return;
			}
		}
	}
}
