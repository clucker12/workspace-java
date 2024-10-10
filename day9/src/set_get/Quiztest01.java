package set_get;

public class Quiztest01 {
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int ageM(int age) {
		this.age = age -1;
		return age;
	}
}
