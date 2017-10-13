import java.util.Scanner;

public class Rectangle 
{
	private String color;
	private int width;
	private int length;

	public int area() {
		int result = width * length;
		return result;
	}

	public int perimiter() {
		int result = 2 * width + 2 * length;
		return result;
	}


	public String getColor () {
		return color;
	}
	public int getWidth () {
		return width;
	}
	public int getLength () {
		return length;
	}

	public void setColor (String color) {
		this.color = color;
	}
	public void setWidth (int width) {
		this.width = width;
	}
	public void setLength (int length) {
		this.length = length;
	}

	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);

		Rectangle rec1 = new Rectangle();
		System.out.println("첫번째 직사각형의 색깔: ");
		rec1.setColor(keyboard.next());

		System.out.println("첫번째 직사각형의 가로: ");
		rec1.setWidth(keyboard.nextInt());

		System.out.println("첫번째 직사각형의 세로: ");
		rec1.setLength(keyboard.nextInt());

		Rectangle rec2 = new Rectangle();
		System.out.println("두번째 직사각형의 색깔: ");
		rec2.setColor(keyboard.next());

		System.out.println("두번째 직사각형의 가로: ");
		rec2.setWidth(keyboard.nextInt());

		System.out.println("두번째 직사각형의 세로: ");
		rec2.setLength(keyboard.nextInt());

		System.out.println(rec1.getColor() + "직사각형의 넓이는 " +rec1.area()+
										"이고 둘레는 " + rec1.perimiter() +"입니다.");
		
		System.out.println(rec2.getColor() + "직사각형의 넓이는 " +rec2.area()+
										"이고 둘레는 " + rec2.perimiter() +"입니다.");

		// 두 직사각형의 넓이와 둘레 비교
		String areaTemp = null;
		String perimiterTemp = null;
		if (rec1.area() > rec2.area())
		{
			areaTemp = rec1.getColor();
		} else if (rec1.area() < rec2.area())
		{
			areaTemp = rec2.getColor();
		} else {
			System.out.println("넓이가 같습니다");
		}		

		if (rec1.perimiter() > rec2.perimiter())
		{
			perimiterTemp = rec1.getColor();
		} else if (rec1.perimiter() < rec2.perimiter())
		{
			perimiterTemp = rec2.getColor();
		} else {
			System.out.println("둘레가 같습니다");
		}

		if ( areaTemp != null )
			System.out.println("넓이는 "+ areaTemp +" 직사각형이 더 큽니다");

		if ( perimiterTemp != null )
			System.out.println("둘레는 "+ areaTemp +" 직사각형이 더 큽니다");
	}
}
