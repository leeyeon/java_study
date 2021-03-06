package m10.day12;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Vector;

public class FileUtil {

	
	public static void fileToPrint(String fileName) {
		
		BufferedReader br = null;
		
		try {
			
			br = new BufferedReader(new FileReader(fileName));
			
			String source = "";
			while ((source = br.readLine()) != null) {
				System.out.println(":: " + source);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(br!=null)
					br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static List<User> fileFindAddress(String fileName, String address) {
		
		Vector<User> user = new Vector<User>();
		BufferedReader br = null;
		
		try {
			
			br = new BufferedReader(new FileReader(fileName));
			
			String source = "";
			while ((source = br.readLine()) != null) {
				String[] pasing = source.split("/");

				if(address.equals(pasing[1])) {					
					user.add(new User(pasing[0],pasing[1],pasing[2],
							("��".equals(pasing[3])? true : false)));
				}
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(br!=null)
					br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		return user;
	}
}
