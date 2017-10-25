package jw05;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLDecoder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/* 
 *  FileName : CookieReaderToServer.java
 *	 :: Client 에 필요 정보를 저장하는 Cookie 사용
*/
//@WebServlet("/CookieReaderToServer")
public class CookieReaderToServer extends HttpServlet{

	public void service(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException{
		
		req.setCharacterEncoding("EUC_KR");
		res.setContentType("text/html;charset=EUC_KR");
		PrintWriter out = res.getWriter();		
		
		// Client 로 부터 전송된 Cookie 처리
		Cookie[] cookies = req.getCookies();
		// Cookie 의 name=value 처리 변수
		String userName =null;

		//Cookie 의 존재유무 및 name=value 처리
		if(cookies != null) {
            out.println("Client에서 전송된 Cookie 있습니다.<br/>");
			//Array 로 return  :: Array 갯수만큼 처리
			for(int i=0;i<cookies.length;i++){
				//name=value 형식의 저장값 중 name 추출
				String name = cookies[i].getName();
				String value = URLDecoder.decode(cookies[i].getValue());
				System.out.println("client로 부터 전송된 cookie : "+name+"="+value);
				
				if(name.equals("name")){
					userName = value;
				}
			}
		}else{
            out.println("Client에서 전송된 cookie가 없습니다.<br/>");
        }

		out.println("<html><body>");
		//userName이 null 의미 :: cookie 에 id 가 저장 되지 않았음 ==> 처음방문
		if(userName == null){
			out.println("처음입니다.");
		}else{
			out.println(userName+"님 환영");
		}
		out.println("</body></html>");
	}
	
}//end of class