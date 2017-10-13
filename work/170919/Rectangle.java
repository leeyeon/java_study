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
		System.out.println("ù��° ���簢���� ����: ");
		rec1.setColor(keyboard.next());

		System.out.println("ù��° ���簢���� ����: ");
		rec1.setWidth(keyboard.nextInt());

		System.out.println("ù��° ���簢���� ����: ");
		rec1.setLength(keyboard.nextInt());

		Rectangle rec2 = new Rectangle();
		System.out.println("�ι�° ���簢���� ����: ");
		rec2.setColor(keyboard.next());

		System.out.println("�ι�° ���簢���� ����: ");
		rec2.setWidth(keyboard.nextInt());

		System.out.println("�ι�° ���簢���� ����: ");
		rec2.setLength(keyboard.nextInt());

		System.out.println(rec1.getColor() + "���簢���� ���̴� " +rec1.area()+
										"�̰� �ѷ��� " + rec1.perimiter() +"�Դϴ�.");
		
		System.out.println(rec2.getColor() + "���簢���� ���̴� " +rec2.area()+
										"�̰� �ѷ��� " + rec2.perimiter() +"�Դϴ�.");

		// �� ���簢���� ���̿� �ѷ� ��
		String areaTemp = null;
		String perimiterTemp = null;
		if (rec1.area() > rec2.area())
		{
			areaTemp = rec1.getColor();
		} else if (rec1.area() < rec2.area())
		{
			areaTemp = rec2.getColor();
		} else {
			System.out.println("���̰� �����ϴ�");
		}		

		if (rec1.perimiter() > rec2.perimiter())
		{
			perimiterTemp = rec1.getColor();
		} else if (rec1.perimiter() < rec2.perimiter())
		{
			perimiterTemp = rec2.getColor();
		} else {
			System.out.println("�ѷ��� �����ϴ�");
		}

		if ( areaTemp != null )
			System.out.println("���̴� "+ areaTemp +" ���簢���� �� Ů�ϴ�");

		if ( perimiterTemp != null )
			System.out.println("�ѷ��� "+ areaTemp +" ���簢���� �� Ů�ϴ�");
	}
}
