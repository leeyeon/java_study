package m09.day28;

import java.util.ArrayList;

public class Prob1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url1 = "http://localhost/order?prodId=PROD-001&prodName=������3&price=980000";
		
		String prodName = getParameter(url1, "prodName");
		System.out.println("��ǰ �̸� : "+prodName);
		
		String url2 = "http://localhost/registUser?userId=USER-001&userName=ȫ�浿&address=����� ������&userAge=28";
		String userAddress = getParameter(url2, "address");
		System.out.println("ȸ�� �ּ� : "+userAddress);
		
	}
	
	private static String getParameter(String url, String paramName) {
		
		String[] spl = url.split("\\?|\\&|\\=");
		
		for(int i=1; i<spl.length; i++) {
			if(paramName.equals(spl[i])) {
				return spl[i+1];
			}
		}
		
		return "error";

		/*
		//?���İ� tempUrl �� ���� => data
		ArrayList<String> pashing = new ArrayList<String>();
		String tempUrl = "";
		String checkParam = "";
		String result = "";
		
		for(int i=0; i<url.length(); i++) {
			char ch = url.charAt(i);
			if(ch=='?') {
				// ? ��������
				tempUrl = url.substring(i+1);
				break;
			}
		}
		
		//�Ľ��ؼ� list�� �ֱ�
		for(int i=0; i<tempUrl.length(); i++) {
			char ch = tempUrl.charAt(i);
			
			if((ch=='?') || (ch=='=') || (ch=='&') || (i == (tempUrl.length()-1))) {
				pashing.add(checkParam);
				checkParam = "";
			} else {
				checkParam += ch;
			}
		}
		
		//¦�� : name , Ȧ�� : value
		for(int i=0; i<pashing.size(); i = i + 2) {
			//System.out.println(pashing.get(i));
			if(paramName.equals(pashing.get(i))) {
				result = pashing.get(i+1);
				break;
			}
			else
				result = "error";
		}
		return result;
		*/
		
		
	}

}