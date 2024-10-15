package socket;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client01 {
	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket sock = new Socket("192.168.51.95",12345);
		
		Scanner input = new Scanner(System.in);
		
		OutputStream out = sock.getOutputStream();
		System.out.println("정수 입력");
		int num = input.nextInt();
		out.write(num);
		System.out.println("전송 완료");
		
		out.close();
		sock.close();
	}
}
