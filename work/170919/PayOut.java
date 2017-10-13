package jb05.part08

public interface PayOut
{
	//interface Field (member varable) ==> public static final 특성을 갖는다.
	public final static String PayOut = "출금";

	//interface method ==> public abstract 특성을 갖는다.
	public abstract void PayOut(int money);
}  
