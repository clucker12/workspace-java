package lombok_test_;

public class MainClass {
	public static void main(String[] args) {
		TestDTO dto = new TestDTO();
		dto.setName("홍길동");
		dto.setAge(0);
		TestDTO2 dto2 = new TestDTO2("111", "222", "3333");
		System.out.println("name : " + dto.getName());
		System.out.println("name = " + dto.getName()+"age = " + dto.getAge());
		System.out.println("name = " + dto2.getName()+"age = " + dto2.getAddr());
	}
}
