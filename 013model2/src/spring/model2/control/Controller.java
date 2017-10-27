package spring.model2.control;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * Controller.java
 * Controller 객체는 Control 에서 수행하는 실질적, 핵심적 역할 수행
 */

public interface Controller {

	public void execute(HttpServletRequest req, HttpServletResponse res)
		throws ServletException, IOException;
}
