package shop.service.user.test;

import shop.service.user.Client;

public class ClientApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Client client = new Client("bit", "�̿���", 0 , true);
		
		System.out.println("�̸�:" + client.getName());
		System.out.println(client.toString());
	}

}
