public class Test2
{
	public static void main(String[] args)
	{
		int i = Integer.parseInt(args[0]);
		int j = Integer.parseInt(args[1]);

		if(i>j) {
			System.out.println("ù��°�μ�:"+i+ ", �ι�°�μ�:"+j+","+i+"-"+j+"="+(i - j)+"�Դϴ�.");
		} else {
			System.out.println("ù��°�μ�:"+i+ ", �ι�°�μ�:"+j+","+i+"+"+j+"="+(i + j)+"�Դϴ�.");
		}
	}
}