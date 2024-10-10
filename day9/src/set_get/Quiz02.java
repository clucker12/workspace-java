package set_get;

public class Quiz02 {
	public static void main(String[] args) {
		Quiztest02 t = new Quiztest02();
		int k=100,e=90,m=80;
		t.setKor(k);
		t.setEng(e);
		t.setMath(m);
		t.setSum(k, e, m);
		t.setAvg(t.getSum());
		
		System.out.println("국어 : " + t.getKor());
		System.out.println("수학 : " + t.getMath());
		System.out.println("영어 : " + t.getEng());
		System.out.println("합계 : " + t.getSum());
		System.out.println("평균 : " + t.getAvg());
		
		
	}
}
