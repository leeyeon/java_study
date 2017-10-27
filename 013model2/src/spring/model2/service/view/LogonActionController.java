package spring.model2.service.view;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import spring.model2.control.Controller;
import spring.model2.service.user.dao.UserDao;
import spring.model2.service.user.vo.UserVO;

public class LogonActionController implements Controller {

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		System.out.println("[LogonActionController.execute() start]");
		
		HttpSession session = req.getSession(true);
		
		if(session.isNew() || session.getAttribute("userVO") == null) {
			session.setAttribute("userVO", new UserVO());
		}
		
		UserVO userVO = (UserVO)session.getAttribute("userVO");
		
		String requestPage = "/user/logon.jsp";
		
		// 로그인 한 사람이면 home.jsp 로 가.
		if(userVO.isActive()) {
			requestPage = "/user/home.jsp";
		} else {
		// 로그인 안 되있으면...?
			String userId = req.getParameter("userId");
			String userPasswd = req.getParameter("userPasswd");
			
			userVO.setUserId(userId);
			userVO.setUserPasswd(userPasswd);
			
			UserDao userDao = new UserDao();
			userDao.getUser(userVO);
			
			if(userVO.isActive()) {
				requestPage= "/user/home.jsp";
			}
		}
		
		RequestDispatcher rd = req.getRequestDispatcher(requestPage);
		rd.forward(req, res);
		
		System.out.println("[LogonActionController.execute() end]");
	}

}
