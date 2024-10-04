package 정성호;

public class Quiz08 {
	public static void main(String[] args) {
		int rice = 100*1000;
		int eat = 20;
		int mouse = 2;
		int day = 0;
		while(rice>=0) {
			day+=1;
			rice -= eat*mouse;
			if(day%10==0) {
				mouse*=2;
			}
		}
		System.out.println("날짜 : " + day);
		System.out.println("쥐의 수 : " + mouse);
	}
}
