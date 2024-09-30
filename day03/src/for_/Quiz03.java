package for_;

public class Quiz03 {
	public static void main(String[] args) {
		int i=0,j=0;
		for(i=1;i<=25;i++) {
			System.out.print(i+"\t");
			if(i%5==0) {
				System.out.println();
			}
		}
		
		for(i=1;i<=5;i++) {
			for(j=1;j<=5;j++) {
				System.out.print(j*i+"\t");
			}
			System.out.println();
		}
	}
}
