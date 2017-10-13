//package jb04.part01;

public class Bank02
{
	int balance;
	int money;
	int command;
	String bankName;
	String userName;

	public Bank02(){
	}
	public Bank02(String[] str){
		userName=str[0];
		bankName=str[1];
		command=Integer.parseInt(str[2]);
		money=Integer.parseInt(str[3]);
	}
	
	public void work(){
		if(command==1){
			deposit();
		}
		else if(command==2){
			withdrawal();	
		}
	}

	public void deposit(){
		balance += money;
		System.out.println(money+"�� �����.");
	}

	public void withdrawal(){
		balance -=money;
		System.out.println(money+"�� �����.");
	}

	public void displayMoney(){
		System.out.println("���� �ݾ���: "+balance+"�Դϴ�");
	}
	
	public static void main(String args[]){
		if(!(args.length == 2 || args.length == 4)){
			System.out.println("[usage]:: java Bank02 [customerName][bankName][option][money]");
			System.out.println("[usuage]:: ���ڰ��� 2, 4���� �ʿ��մϴ�");
			System.exit(0);
		}

		System.out.println(args[0]+"���� �ְŷ�������"+args[1]+" �Դϴ�");

		Bank02 b = new Bank02();

		if(args.length !=2) {
			int command = Integer.parseInt(args[2]);

			if(command !=1 && command !=2){
				System.out.println("[usage]:: java Bank02 [customerName][bankName][option][money]");
				System.out.println("[usuage]:: option�� Ȯ���ϼ��� :: 1 => �Ա�, 2 ==> ���");
				return;
			}

			b= new Bank02(args);

			b.work();
		}

		b.displayMoney();

	}
}