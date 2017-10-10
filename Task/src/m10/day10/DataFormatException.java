package m10.day10;

public class DataFormatException extends RuntimeException {

	String title;
	
	public DataFormatException() {
		// TODO Auto-generated constructor stub
	}
	
	public DataFormatException(String title) {
		this.title = title;
	}
	
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return title+"책 정보는 변환할 수 없는 데이터 포맷입니다.";
	}

}
