package spring.model2.control;

import spring.model2.service.view.HomeController;
import spring.model2.service.view.LogonActionController;
import spring.model2.service.view.LogonController;

public class ControllerMapping {

	private static ControllerMapping controllerMapping;
	
	public ControllerMapping() {
	}

	public static ControllerMapping getinstance() {
		if(controllerMapping == null) {
			controllerMapping = new ControllerMapping();
		}
		return controllerMapping;
	}
	
	public Controller getController(String actionPage) {
		System.out.println("[ControllerMapping.getController() start]");
		
		Controller controller = null;
		
		if(actionPage.equals("logon")) {
			controller = new LogonController();
		} else if(actionPage.equals("logonAction")) {
			controller = new LogonActionController();
		} else if(actionPage.equals("home")) {
			controller = new HomeController();
		}
		
		System.out.println("[ControllerMapping.getController() end]");
		
		return controller;
	}
}
