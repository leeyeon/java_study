package m10.day10;

import java.util.Vector;

public class Prob1 {
	
	private static Book makeBook(String bookData) {
		
		String[] pashing = bookData.split(":");
		
		if(pashing.length != 3) {
			throw new DataFormatException(pashing[0]);
		}
		
		for(int i=0; i<pashing.length; i++) {
			pashing[i] = pashing[i].trim();
		}

		return new Book(pashing[0], pashing[1], Integer.parseInt(pashing[2]));
	}
	
	private static void printBookList(Vector bookList) {
		
		for(int i=0; i<bookList.size(); i++) {
			System.out.println(bookList.get(i));
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vector booklist = new Vector();
		
		try {
			
			booklist.add(makeBook("Java Programming 기초 : 컴퓨터 : 35000"));
			booklist.add(makeBook("초보자를 위한 SQL : 컴퓨터 : 28000"));
			booklist.add(makeBook("HTML5 API 소개 : 컴퓨터 : 58000"));			
			//Case1
			booklist.add(makeBook("JDBC Programming 기초 : 컴퓨터 : 45000"));			
			//Case2
			//booklist.add(makeBook("JDBC Programming 기초 : 컴퓨터"));
			booklist.add(makeBook("JSP Programming 고급 : 컴퓨터 : 56000"));
			System.out.println("<<책 목록>>");
			printBookList(booklist);
			
		} catch(DataFormatException e) {
			System.out.println(e.getMessage());
		}

	}

}
