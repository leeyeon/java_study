public class Prob 
{
	public static void main(String[] args) 
	{
		Book[] booklist = new Book[5];

		booklist[0] = new Book("Java Program", 25000);
		booklist[1] = new Book("JSP Program", 15000);
		booklist[2] = new Book("SQL Fundamentals", 30000);
		booklist[3] = new Book("JDBC Program", 28000);
		booklist[4] = new Book();
		booklist[4].setTitle("EJB Program");
		booklist[4].setPrice(34000);

		BookMgr mgr = new BookMgr(booklist);

		System.out.println("===책 목록===");
		mgr.printBooklist();
		System.out.println();

		System.out.println("===책 가격의 총합===");
		mgr.printTotalPrice();


	}
}
