package spring.model2.control;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * Controller.java
 * Controller ��ü�� Control ���� �����ϴ� ������, �ٽ��� ���� ����
 */

public interface Controller {

	public void execute(HttpServletRequest req, HttpServletResponse res)
		throws ServletException, IOException;
}
