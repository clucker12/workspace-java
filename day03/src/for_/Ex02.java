package for_;

public class Ex02 {
	public static void main(String[] args) {
		int i=0;
		for(i=0; i<=10 ;i++) {
			System.out.println(i+",");
		}
		System.out.println();
		
		i=0;
		for(;i<=10;) {
			System.out.println(i+",");
			i++;
		}
		System.out.println();
		
		//for(;;){
		while(true) {
			System.out.println(i+",");
			i++;
		}
	}
}
