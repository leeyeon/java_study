//package jb04.part01;

public class Bank03
{
	int balance;
	int money;
	int command;
	String bankName;
	String userName;

	public Bank03(){
	}
	public Bank03(String[] str){
		validate(str);
		initialize(str);
		work();
		displayMoney();
	}
	
	public void validate(String args[]){
		if(!(args.length ==2 || args.length==4)){
			System.out.println("[usage]:: java Bank03 [customerName][bankName][option][money]");
			System.out.println("[usuage]:: ���ڰ��� 2, 4���� �ʿ��մϴ�");
			System.exit(0);
		}
		if(args.length !=2 && Integer.parseInt(args[2]) !=1 &&  Integer.parseInt(args[2]) !=2){
			System.out.println("[usage]:: java Bank03 [customerName][bankName][option][money]");
			System.out.println("[usuage]:: option�� Ȯ���ϼ��� :: 1 =>�Ա�, 2=>���");
			System.exit(0);
		}
	}

	public void initialize(String[] value){
		userName = value[0];
		bankName = value[1];
		if(value.length == 4){
			command = Integer.parseInt(value[2]);
			money = Integer.parseInt(value[3]);
		}

		System.out.println(userName+"���� �ְŷ�������"+bankName+"�Դϴ�");
	}

	public void work(){
		if(command ==1){
			deposit();
		}
		else if(cinnabd == 2){
			withdrawal();
		}
	}

	public void deposit(){
		balance += money;
		System.out.println(money+"�� �Ա���");
	}

	public void withdrawal(){
		balance -= money;
		System.out.println(money+"�� �����");
	}

	public void displayMoney(){
		System.out.println("���� �ݾ���: "+balance+"�Դϴ�");
	}
	
	public static void main(String args[]){
		new Bank03(args);	
	}
}