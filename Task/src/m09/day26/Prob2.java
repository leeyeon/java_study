package m09.day26;

import java.util.*;

public class Prob2 
{

	public List<String> dataChange(String[] strData) {

		Vector<String> v = new Vector<String>();

		for(int i = strData.length - 1; i >= 0; i--) {
			StringBuffer sb = new StringBuffer(strData[i]);
			sb.reverse();
			v.addElement(sb.toString());
		} // end of for

		return v;
	}
	public static void main(String[] args) 
	{
		Prob2 st = new Prob2();
		String[] strData = {"Java Programming", "JDBC", "Oracle10g", "JSP/Servlet"};
		List<String> v = st.dataChange( strData );

		/*
		for(int i=0; i<v.size(); i++) {
			System.out.println( v.elementAt(i));
		}
		*/

		for(String data : v ) {
			System.out.println(data);
		}

	}
}
