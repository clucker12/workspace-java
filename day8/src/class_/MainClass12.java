package class_;

import java.util.ArrayList;
import java.util.HashMap;

public class MainClass12 {
	public static void main(String[] args) {
		TestClass12 t = new TestClass12();
		int[] a = t.test1();
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a.length);
		
		ArrayList<String> arr = new ArrayList<String>();
		String str = "test";
		arr.add("111");
		arr.add("222");
		HashMap<String, String> m = t.test2(arr,str);
		System.out.println("-----------------main---------------");
		System.out.println("map : " + m);
	}
}
