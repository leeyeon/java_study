package m10.day12;

import java.util.List;

public class Prob1 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub

		String pathName = "./src/m10/day12/data.txt";
		
		FileUtil.fileToPrint(pathName);
		
		System.out.println("============================");
		
		System.out.println("화일 내용 중 서울 정보 검색");
		List<User> vector = FileUtil.fileFindAddress(pathName, "서울");
		for(User data : vector) {
			System.out.println(data);
		}
		
		System.out.println("============================");
		
		System.out.println("화일 내용 중 경주 정보 검색");
		vector = FileUtil.fileFindAddress(pathName, "경주");
		for(User data : vector) {
			System.out.println(data);
		}
		
		System.out.println("============================");
		
		System.out.println("화일 내용 중 경기도 정보 검색");
		vector = FileUtil.fileFindAddress(pathName, "경기도");
		for(User data : vector) {
			System.out.println(data);
		}
	}

}
