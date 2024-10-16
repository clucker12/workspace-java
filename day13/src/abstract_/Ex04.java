package abstract_;

class A04지상군 implements Army04{

	@Override
	public void attack() {
		System.out.println("지상군이 공격합니다!!");
		
	}
	
	public void attack1() {
		System.out.println("지상군이 공격합니다!!");
		
	}
	
	public void attack2() {
		System.out.println("지상군이 공격합니다!!");
		
	}
	@Override
	public void defense() {
		// TODO Auto-generated method stub
		
	}
	
}
class B04공군 implements Army04{

	@Override
	public void attack() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void defense() {
		// TODO Auto-generated method stub
		
	}
	
}


public class Ex04 {
	public static void main(String[] args) {
		Army04 a = new A04지상군();
		a.attack(); 
	}
}
