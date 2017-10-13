public class BookMgr 
{
	private Book[] bookList;

	public BookMgr() {
	}

	public BookMgr(Book[] bookList) {
		this.bookList = bookList;
	}

	public void printBooklist() {
		for(int i = 0; i<bookList.length; i++) {
			System.out.println(bookList[i].getTitle());
		}
	}

	public void printTotalPrice() {
		int sum = 0;
		for(int i = 0; i<bookList.length; i++) {
			sum += bookList[i].getPrice();
		}
		System.out.println("��ü å ������ ��: "+sum);
	}
}