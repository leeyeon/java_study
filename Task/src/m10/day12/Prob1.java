package m10.day12;

import java.util.List;

public class Prob1 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub

		String pathName = "./src/m10/day12/data.txt";
		
		FileUtil.fileToPrint(pathName);
		
		System.out.println("============================");
		
		System.out.println("ȭ�� ���� �� ���� ���� �˻�");
		List<User> vector = FileUtil.fileFindAddress(pathName, "����");
		for(User data : vector) {
			System.out.println(data);
		}
		
		System.out.println("============================");
		
		System.out.println("ȭ�� ���� �� ���� ���� �˻�");
		vector = FileUtil.fileFindAddress(pathName, "����");
		for(User data : vector) {
			System.out.println(data);
		}
		
		System.out.println("============================");
		
		System.out.println("ȭ�� ���� �� ��⵵ ���� �˻�");
		vector = FileUtil.fileFindAddress(pathName, "��⵵");
		for(User data : vector) {
			System.out.println(data);
		}
	}

}