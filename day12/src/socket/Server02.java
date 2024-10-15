package socket;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server02 {
	public static void main(String[] args) throws IOException {
		ServerSocket server = new ServerSocket(12345);
		
		System.out.println("접속 대기중....");
		Socket sock = server.accept(); // accept는 클라이언트로 부터 연결을 대기
		InputStream in = sock.getInputStream();
		DataInputStream dis = new DataInputStream(in);
		
		String readData = dis.readUTF();
		System.out.println("수신 데이터 : " + readData);
		
		OutputStream os = sock.getOutputStream();
		DataOutputStream dos = new DataOutputStream(os);
		dos.writeUTF("서버에서 응답");
		
		dis.close(); in.close(); sock.close(); server.close();
	}
}
