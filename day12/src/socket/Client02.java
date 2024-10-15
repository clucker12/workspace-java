package socket;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client02 {
	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket sock = new Socket("192.168.51.95",12345);
		Scanner input = new Scanner(System.in);
		String msg = null;
		
		OutputStream os = sock.getOutputStream();
		DataOutputStream dos = new DataOutputStream(os);
		System.out.println("송신 데이터 입력");
		msg = input.next();
		dos.writeUTF(msg);
		
		InputStream in = sock.getInputStream();
		DataInputStream dis = new DataInputStream(in);
		msg = dis.readUTF();
		System.out.println("받은 데이터 : " + msg);
		
		dos.close(); os.close(); sock.close();
	}
}
